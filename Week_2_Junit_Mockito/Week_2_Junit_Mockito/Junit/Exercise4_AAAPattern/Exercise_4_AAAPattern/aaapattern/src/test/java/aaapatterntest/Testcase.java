package aaapatterntest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import aapatternpackage.Addition;
import static org.junit.Assert.*;


public class Testcase {

    private Addition addition;

   
    @Before
    public void setUp() {
        addition = new Addition(); 
        System.out.println("Setup complete");
    }

   
    @After
    public void tearDown() {
        addition = null;
        System.out.println("Teardown complete");
    }

    
    @Test
    public void testAddition() {
      
        int result = addition.add(10, 20);
        assertEquals(30, result);
    }

  
    @Test
    public void testAdditionWithZero() {
        int result = addition.add(0, 50);
        assertEquals(50, result);
    }
}
