import React from 'react';

export function CourseDetails(props) {
  // Conditional Rendering Technique 4: Ternary Operator
  const coursedet = (props.courses && props.courses.length > 0) ? (
    <ul>
      {props.courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </ul>
  ) : (
    <p>No Course Details Available.</p>
  );

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
}

export default CourseDetails;
