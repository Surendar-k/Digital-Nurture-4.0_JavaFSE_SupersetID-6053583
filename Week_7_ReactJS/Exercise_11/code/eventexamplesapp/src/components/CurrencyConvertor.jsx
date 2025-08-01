import React, { useState } from "react";

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState("");
  const [currencyCode, setCurrencyCode] = useState("");
  const [converted, setConverted] = useState("");

  const conversionRates = {
    EURO: 0.011,
    USD: 0.012,
    GBP: 0.0095,
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    const upperCurrency = currencyCode.trim().toUpperCase();
    const rate = conversionRates[upperCurrency];

    if (!rate) {
      alert(`Unsupported currency: ${currencyCode}`);
      setConverted("");
      return;
    }

    const result = (parseFloat(rupees) * rate).toFixed(2);
    setConverted(`${upperCurrency} ${result}`);
    alert(`Converting to ${upperCurrency} Amount is ${result}`);
  };

  return (
    <div>
      <h2 style={{ color: "green" }}>Currency Convertor</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="number"
          placeholder="Enter amount in INR"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          required
        />

        <input
          type="text"
          placeholder="Enter target currency (e.g., EUR)"
          value={currencyCode}
          onChange={(e) => setCurrencyCode(e.target.value)}
          required
          style={{ marginLeft: "10px" }}
        />

        <button type="submit" style={{ marginLeft: "10px" }}>
          Convert
        </button>

        <input
          type="text"
          readOnly
          value={converted}
          placeholder="Converted Amount"
          style={{ marginLeft: "10px" }}
        />
      </form>
    </div>
  );
};

export default CurrencyConvertor;
