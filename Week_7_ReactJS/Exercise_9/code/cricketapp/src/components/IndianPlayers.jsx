import React from "react";

export const OddPlayers = ({ team }) => {
  const [first, , third, , fifth] = team;

  return (
    <div>
      <h2>Odd Players</h2>
      <ul>
        <li>First : {first}</li>
        <li>Third : {third}</li>
        <li>Fifth : {fifth}</li>
      </ul>
    </div>
  );
};


export const EvenPlayers = ({ team }) => {
  const [, second, , fourth, , sixth] = team;

  return (
    <div>
      <h2>Even Players</h2>
      <ul>
        <li>Second : {second}</li>
        <li>Fourth : {fourth}</li>
        <li>Sixth : {sixth}</li>
      </ul>
    </div>
  );
};



export const MergedIndianPlayers = () => {
  const T20Players = ["First Player", "Second Player", "Third Player"];
  const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];

  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>List of Indian Players Merged:</h2>
      <ul>
        {IndianPlayers.map((player, index) => (
          <li key={index}>Mr. {player}</li>
        ))}
      </ul>
    </div>
  );
};

// Wrapper component
const IndianPlayers = () => {
  const team = ["Sachin1", "Dhoni2", "Virat3", "Rohit4", "Yuvaraj5", "Raina6"];

  return (
    <div>
     <OddPlayers team={team} />
<EvenPlayers team={team} />

      <MergedIndianPlayers />
    </div>
  );
};

export default IndianPlayers;
