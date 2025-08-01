import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

const App = () => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (
    <div style={styles.container}>
      <h1>✈️ Ticket Booking App</h1>
      {isLoggedIn ? (
        <>
          <UserPage />
          <button onClick={handleLogout} style={styles.button}>Logout</button>
        </>
      ) : (
        <>
          <GuestPage />
          <button onClick={handleLogin} style={styles.button}>Login</button>
        </>
      )}
    </div>
  );
};

const styles = {
  container: {
    textAlign: 'center',
    marginTop: '50px',
    fontFamily: 'Arial',
  },
  button: {
    padding: '10px 20px',
    marginTop: '20px',
    fontSize: '16px',
    cursor: 'pointer',
  },
};

export default App;
