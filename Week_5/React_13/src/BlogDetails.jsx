import React from 'react';

export function BlogDetails(props) {
  // Conditional Rendering Technique 3: Logical && operator
  const hasBlogs = props.blogs && props.blogs.length > 0;

  // Element Variable Conditional Rendering
  const content = hasBlogs && (
    <ul>
      {props.blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <h6>{blog.author}</h6>
          <p>{blog.desc}</p>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {content || <p>No Blog Details Available.</p>}
    </div>
  );
}

export default BlogDetails;
