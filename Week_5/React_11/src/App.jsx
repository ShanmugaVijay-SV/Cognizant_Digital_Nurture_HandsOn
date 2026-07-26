import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css';

function App() {
  const [counter, setCounter] = useState(5);

  // Task 1: Increment button invokes multiple methods
  const incrementValue = () => {
    setCounter((prev) => prev + 1);
  };

  const sayHello = () => {
    alert("Hello Member1");
  };

  const handleIncrement = () => {
    incrementValue();
    sayHello();
  };

  const handleDecrement = () => {
    setCounter((prev) => prev - 1);
  };

  // Task 2: Function taking "welcome" as an argument
  const handleSayWelcome = (msg) => {
    alert(msg);
  };

  // Task 3: Synthetic event handler for "Click on me"
  const handleCustomEvent = (e) => {
    alert("I was clicked");
  };

  return (
    <div className="app-container">
      <div className="counter-section">
        <div className="counter-display">{counter}</div>
        <div className="button-group">
          <button className="btn" onClick={handleIncrement}>Increment</button>
          <button className="btn" onClick={handleDecrement}>Decrement</button>
          <button className="btn" onClick={() => handleSayWelcome('welcome')}>Say welcome</button>
          <button className="btn" onClick={(e) => handleCustomEvent(e)}>Click on me</button>
        </div>
      </div>

      <hr className="divider" />

      {/* Task 4: Currency Convertor Component */}
      <CurrencyConvertor />
    </div>
  );
}

export default App;
