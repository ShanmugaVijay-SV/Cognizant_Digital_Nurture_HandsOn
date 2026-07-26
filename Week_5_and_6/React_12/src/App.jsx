import React, { useState } from 'react';
import Greeting from './Greeting';
import { LoginButton, LogoutButton } from './AuthButtons';
import './App.css';

const sampleFlights = [
  { id: 'AI-204', airline: 'Air India', from: 'Delhi (DEL)', to: 'Mumbai (BOM)', departure: '10:00 AM', price: '₹4,500' },
  { id: '6E-512', airline: 'IndiGo', from: 'Chennai (MAA)', to: 'Bangalore (BLR)', departure: '02:30 PM', price: '₹3,200' },
  { id: 'UK-819', airline: 'Vistara', from: 'Hyderabad (HYD)', to: 'Goa (GOI)', departure: '06:15 PM', price: '₹5,800' }
];

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);
  const [bookedFlight, setBookedFlight] = useState(null);

  const handleLoginClick = () => {
    setIsLoggedIn(true);
  };

  const handleLogoutClick = () => {
    setIsLoggedIn(false);
    setBookedFlight(null);
  };

  // Element variable conditional rendering as required in lab objectives
  let button;
  if (isLoggedIn) {
    button = <LogoutButton onClick={handleLogoutClick} />;
  } else {
    button = <LoginButton onClick={handleLoginClick} />;
  }

  const handleBookTicket = (flight) => {
    setBookedFlight(flight);
    alert(`Ticket successfully booked for ${flight.airline} (${flight.id})!`);
  };

  return (
    <div className="app-container">
      <div className="header-section">
        <Greeting isLoggedIn={isLoggedIn} />
        {button}
      </div>

      <hr className="divider" />

      <div className="flights-container">
        <h2>{isLoggedIn ? 'Flight Ticket Booking' : 'Available Flight Schedule (Guest Browsing)'}</h2>
        <div className="flights-grid">
          {sampleFlights.map((flight) => (
            <div key={flight.id} className="flight-card">
              <div className="flight-header">
                <h3>{flight.airline}</h3>
                <span className="flight-id">{flight.id}</span>
              </div>
              <p><strong>From:</strong> {flight.from}</p>
              <p><strong>To:</strong> {flight.to}</p>
              <p><strong>Departure:</strong> {flight.departure}</p>
              <p className="price">Price: <span>{flight.price}</span></p>

              {isLoggedIn ? (
                <button
                  className="book-btn"
                  onClick={() => handleBookTicket(flight)}
                >
                  {bookedFlight?.id === flight.id ? 'Booked ✓' : 'Book Ticket'}
                </button>
              ) : (
                <p className="guest-notice">Log in to book tickets</p>
              )}
            </div>
          ))}
        </div>
      </div>
    </div>
  );
}

export default App;
