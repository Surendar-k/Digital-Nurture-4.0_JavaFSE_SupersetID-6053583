import React from "react";
import ListofPlayers from "./components/ListofPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const flag = false; // Change to false to show IndianPlayers

  return (
    <div className="App">{flag ? <ListofPlayers /> : <IndianPlayers />}</div>
  );
}

export default App;
