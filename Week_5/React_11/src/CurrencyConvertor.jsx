import React, { useState } from 'react';

export function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');
  const [result, setResult] = useState(null);

  const handleSubmit = (e) => {
    e.preventDefault();
    const numericAmount = parseFloat(amount) || 0;
    // 1 Euro = 80 Rupees (or rate factor 80 as per assignment output 80 * 80 = 6400)
    const convertedAmount = numericAmount * 80;
    setResult(convertedAmount);
    alert(`Converting to Euro amount is ${convertedAmount}`);
  };

  return (
    <div className="currency-container">
      <h2 className="currency-heading">Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit} className="currency-form">
        <div className="form-row">
          <label>Amount:</label>
          <input
            type="text"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>
        <div className="form-row">
          <label>Currency:</label>
          <input
            type="text"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>
        <button type="submit" className="btn submit-btn">Submit</button>
      </form>
      {result !== null && (
        <div className="result-box">
          Converted Amount: <strong>{result}</strong>
        </div>
      )}
    </div>
  );
}

export default CurrencyConvertor;
