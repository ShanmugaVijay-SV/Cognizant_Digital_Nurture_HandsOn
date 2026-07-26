import React from 'react';

export function UserGreeting() {
  return <h1>Welcome back</h1>;
}

export function GuestGreeting() {
  return <h1>Please sign up.</h1>;
}

export function Greeting(props) {
  const isLoggedIn = props.isLoggedIn;
  if (isLoggedIn) {
    return <UserGreeting />;
  }
  return <GuestGreeting />;
}

export default Greeting;
