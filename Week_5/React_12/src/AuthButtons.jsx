import React from 'react';

export function LoginButton(props) {
  return (
    <button onClick={props.onClick} className="btn login-btn">
      Login
    </button>
  );
}

export function LogoutButton(props) {
  return (
    <button onClick={props.onClick} className="btn logout-btn">
      Logout
    </button>
  );
}
