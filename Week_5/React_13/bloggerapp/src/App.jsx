import React, { useState } from 'react';
import { books, courses, blogs } from './data';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import './App.css';

function App() {
  const [selectedView, setSelectedView] = useState('all');

  return (
    <div className="app-container">
      <div className="control-bar">
        <span>View Filters (Conditional Rendering): </span>
        <button className="btn" onClick={() => setSelectedView('all')}>Show All</button>
        <button className="btn" onClick={() => setSelectedView('courses')}>Course Details</button>
        <button className="btn" onClick={() => setSelectedView('books')}>Book Details</button>
        <button className="btn" onClick={() => setSelectedView('blogs')}>Blog Details</button>
      </div>

      {/* Main 3-column layout matching lab hint and screenshot */}
      <div className="three-column-container">
        {(selectedView === 'all' || selectedView === 'courses') && (
          <CourseDetails courses={courses} />
        )}
        {(selectedView === 'all' || selectedView === 'books') && (
          <BookDetails books={books} />
        )}
        {(selectedView === 'all' || selectedView === 'blogs') && (
          <BlogDetails blogs={blogs} />
        )}
      </div>
    </div>
  );
}

export default App;
