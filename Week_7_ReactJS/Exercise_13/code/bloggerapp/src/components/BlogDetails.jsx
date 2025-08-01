import React from "react";

function BlogDetails({ blogs }) {
  return (
    <div className="card">
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <p><strong> {blog.author}</strong></p>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
