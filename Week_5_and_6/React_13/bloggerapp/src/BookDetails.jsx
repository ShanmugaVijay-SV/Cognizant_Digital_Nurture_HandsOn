import React from 'react';

export function BookDetails(props) {
  // Conditional Rendering Technique 1: Early Return
  if (!props.books || props.books.length === 0) {
    return <div className="st2"><p>No Book Details Available.</p></div>;
  }

  // Conditional Rendering Technique 2: Element Variable as shown in lab hint
  const bookdet = (
    <ul>
      {props.books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="st2">
      <h1>Book Details</h1>
      {bookdet}
    </div>
  );
}

export default BookDetails;
