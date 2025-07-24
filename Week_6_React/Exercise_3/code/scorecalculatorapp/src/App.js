// src/App.js

import React from "react";
import { CalculateScore } from "./components/CalculatorScore";

function App() {
  return (
    <div className="App">
      <CalculateScore
        Name="Steeve"
        School="DNV Public School"
        total={284}
        goal={3}
      />
    </div>
  );
}

export default App;
