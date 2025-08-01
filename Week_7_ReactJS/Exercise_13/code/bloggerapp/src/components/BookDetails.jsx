import React from "react";

function BookDetails({ books }) {
  return (
    <div className="card">
      <h2>Book Details</h2>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.name}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
