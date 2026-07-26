import React from 'react';

export function OddPlayers([first, , third, , fifth]) {
  return (
    <div>
      <li> First : {first}</li>
      <li> Third : {third}</li>
      <li> Fifth : {fifth}</li>
    </div>
  );
}

export function EvenPlayers([, second, , fourth, , sixth]) {
  return (
    <div>
      <li> Second : {second}</li>
      <li> Fourth : {fourth}</li>
      <li> Sixth : {sixth}</li>
    </div>
  );
}

export const T20Players = ['First Player', 'Second Player', 'Third Player'];
export const RanjiTrophyPlayers = ['Fourth Player', 'Fifth Player', 'Sixth Player'];
export const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

export function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <div>
      {IndianPlayers.map((player, index) => (
        <div key={index}>
          <li>Mr. {player}</li>
        </div>
      ))}
    </div>
  );
}
