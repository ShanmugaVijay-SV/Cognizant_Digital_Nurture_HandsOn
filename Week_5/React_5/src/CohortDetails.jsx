import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ cohort }) {
  // If cohort object is passed as prop
  const status = cohort?.status || '';
  const isOngoing = status.toLowerCase() === 'ongoing';
  
  const h3Style = {
    color: isOngoing ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={h3Style}>{cohort.title}</h3>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startedOn}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.status}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coach}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
