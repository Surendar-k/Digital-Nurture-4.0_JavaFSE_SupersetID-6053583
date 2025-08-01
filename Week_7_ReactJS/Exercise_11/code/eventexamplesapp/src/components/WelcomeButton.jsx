import React from "react";

const WelcomeButton = () => {
  const sayWelcome = (message) => {
    alert(`You clicked: ${message}`);
  };

  return (
    <div>
      <button onClick={() => sayWelcome("Welcome")}>Say Welcome</button>
    </div>
  );
};

export default WelcomeButton;
