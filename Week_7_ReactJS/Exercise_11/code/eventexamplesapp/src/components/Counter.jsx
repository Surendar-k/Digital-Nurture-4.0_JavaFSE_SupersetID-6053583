import React, { Component } from "react";

class Counter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };

    // Bind methods for 'this' context
    this.increment = this.increment.bind(this);
    this.sayHello = this.sayHello.bind(this);
  }

  increment() {
    this.setState({ count: this.state.count + 1 });
    this.sayHello(); // Call another method
  }

  sayHello() {
    console.log("Hello! This is a static message.");
  }

  decrement = () => {
    this.setState({ count: this.state.count - 1 });
  };

  render() {
    return (
      <div>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.increment}>Increment</button>
       
       <br></br> <button onClick={this.decrement}>Decrement</button>
      </div>
    );
  }
}

export default Counter;
