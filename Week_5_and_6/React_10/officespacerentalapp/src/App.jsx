import React from 'react';
import './App.css';
import officeImg from './assets/office.png';

function App() {
  // 1. Element to display heading of the page
  const element = "Office Space";

  // 2. Image attribute and element
  const sr = officeImg;
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" className="office-img" />;

  // 3. Object of office details
  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai"
  };

  // Color logic for Rent using array as per lab hint
  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push('textRed');
  } else {
    colors.push('textGreen');
  }

  // 4. List of Office Objects to loop through
  const officeList = [
    { Name: "DBS", Rent: 50000, Address: "Chennai" },
    { Name: "Prestige Cyber Towers", Rent: 75000, Address: "Bangalore" },
    { Name: "Tidel Tech Park", Rent: 58000, Address: "Chennai" },
    { Name: "DLF Cyber City", Rent: 92000, Address: "Gurgaon" },
    { Name: "RMZ Millenia", Rent: 45000, Address: "Hyderabad" }
  ];

  return (
    <div className="container">
      {/* Primary display matching exact output in hands-on lab assignment */}
      <div className="lab-output">
        <h1>{element} , at Affordable Range</h1>
        {jsxatt}
        <h1>Name: {ItemName.Name}</h1>
        <h3 className={colors.join(' ')}>Rent: Rs. {ItemName.Rent}</h3>
        <h3>Address: {ItemName.Address}</h3>
      </div>

      <hr className="divider" />

      {/* Looping through list of office space objects */}
      <div className="list-section">
        <h2>All Office Spaces</h2>
        <div className="office-grid">
          {officeList.map((item, index) => {
            let itemColors = [];
            if (item.Rent <= 60000) {
              itemColors.push('textRed');
            } else {
              itemColors.push('textGreen');
            }

            return (
              <div key={index} className="office-item-card">
                <img src={sr} width="100%" alt={item.Name} className="card-img" />
                <h3>Name: {item.Name}</h3>
                <h4 className={itemColors.join(' ')}>Rent: Rs. {item.Rent}</h4>
                <p>Address: {item.Address}</p>
              </div>
            );
          })}
        </div>
      </div>
    </div>
  );
}

export default App;
