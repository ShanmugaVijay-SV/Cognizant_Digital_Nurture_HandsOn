import React from 'react';
import CohortDetails from './CohortDetails';
import './App.css';

const cohortsList = [
  {
    id: 1,
    title: 'INTADMDF10 -.NET FSD',
    startedOn: '22-Feb-2022',
    status: 'Scheduled',
    coach: 'Aathma',
    trainer: 'Jojo Jose'
  },
  {
    id: 2,
    title: 'ADM21JF014 -Java FSD',
    startedOn: '10-Sep-2021',
    status: 'Ongoing',
    coach: 'Apoorv',
    trainer: 'Elisa Smith'
  },
  {
    id: 3,
    title: 'CDBJF21025 -Java FSD',
    startedOn: '24-Dec-2021',
    status: 'Ongoing',
    coach: 'Aathma',
    trainer: 'John Doe'
  }
];

function App() {
  return (
    <div className="dashboard-container">
      <h1 className="dashboard-title">Cohorts Details</h1>
      <div className="cohorts-wrapper">
        {cohortsList.map((cohort) => (
          <CohortDetails key={cohort.id} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;
