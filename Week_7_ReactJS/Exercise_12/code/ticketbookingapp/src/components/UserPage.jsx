import React from 'react';
import FlightList from './FlightList';

const UserPage = () => {
  return (
    <div>
      <h1>Welcome back</h1>
      <FlightList />
      <button>🧾 Book Ticket</button>
    </div>
  );
};

export default UserPage;
