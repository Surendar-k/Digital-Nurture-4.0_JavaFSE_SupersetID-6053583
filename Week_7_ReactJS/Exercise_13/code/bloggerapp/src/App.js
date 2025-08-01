// src/App.js
import React from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";
import "./App.css";

function App() {
  const books = [
    { id: 1, name: "Master React", price: 670 },
    { id: 2, name: "Deep Dive Into Angular 11", price: 800 },
    { id: 3, name: "Mongo Essentials", price: 450 },
  ];

  const blogs = [
    { id: 1, title: "React Learning", author: "Stephen Bit", content: "Welcome to learning React" },
    { id: 2, title: "Installation", author: "Screwoverier", content: "You can install React from npm." },
  ];

  const courses = [
    { id: 1, name: "Angular", date: "4/5/2021" },
    { id: 2, name: "React", date: "6/3/2021" },
  ];

  return (
    <div className="App">
      

      {/* 3-column layout */}
      <div className="grid-container">
         <div className="column">
          <CourseDetails courses={courses} />
        </div>
       
        <div className="column">
          <BookDetails books={books} />
        </div>
         <div className="column">
          <BlogDetails blogs={blogs} />
        </div>
       
      </div>
    </div>
  );
}

export default App;
