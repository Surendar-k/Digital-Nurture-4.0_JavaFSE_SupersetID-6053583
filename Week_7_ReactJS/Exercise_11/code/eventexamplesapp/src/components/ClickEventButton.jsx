import React from "react";

const ClickEventButton = () => {
  const handleClick = (event) => {
    console.log("Synthetic Event:", event);
    alert("I was clicked!");
  };

  return (
    <div>
      <button onClick={handleClick}>Click on me</button>
    </div>
  );
};

export default ClickEventButton;
