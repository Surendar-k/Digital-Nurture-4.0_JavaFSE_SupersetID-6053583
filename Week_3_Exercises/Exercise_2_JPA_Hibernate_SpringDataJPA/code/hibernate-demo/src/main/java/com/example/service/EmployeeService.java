package com.example.service;

import com.example.model.Employee;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeService {

    public Integer addEmployee(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer employeeId = null;

        try {
            tx = session.beginTransaction();
            employeeId = (Integer) session.save(employee);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return employeeId;
    }
}
