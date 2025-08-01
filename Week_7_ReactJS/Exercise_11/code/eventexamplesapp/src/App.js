import React from "react";
import Counter from "./components/Counter";
import WelcomeButton from "./components/WelcomeButton";
import ClickEventButton from "./components/ClickEventButton";
import CurrencyConvertor from "./components/CurrencyConvertor";

const App = () => {
  return (
    <div className="App" style={{ padding: "20px", fontFamily: "Arial" }}>
     
      <Counter />
      
      <WelcomeButton />
   
      <ClickEventButton />
      
      <CurrencyConvertor />
    </div>
  );
};

export default App;
