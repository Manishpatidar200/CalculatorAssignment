/*
import React, { useState } from "react";

const Calculator = () => {
  const [num1, setNum1] = useState("");
  const [num2, setNum2] = useState("");
  const [operation, setOperation] = useState("add");
  const [result, setResult] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    const response = await fetch(`/calculate?num1=${num1}&num2=${num2}&operation=${operation}`);
    const data = await response.json();
    setResult(data);
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="num1">Number 1:</label>
        <input type="text" id="num1" value={num1} onChange={(e) => setNum1(e.target.value)} />
      </div>
      <div>
        <label htmlFor="num2">Number 2:</label>
        <input type="text" id="num2" value={num2} onChange={(e) => setNum2(e.target.value)} />
      </div>
      <div>
        <label htmlFor="operation">Operation:</label>
        <select id="operation" value={operation} onChange={(e) => setOperation(e.target.value)}>
          <option value="add">Add</option>
          <option value="subtract">Subtract</option>
          <option value="multiply">Multiply</option>
          <option value="divide">Divide</option>
        </select>
      </div>
      <button type="submit">Calculate</button>
      <div>Result: {result}</div>
    </form>
  );
};

export default Calculator;
*/
import React, { useState } from "react";

const Calculator = () => {
  const [num1, setNum1] = useState("");
  const [num2, setNum2] = useState("");
  const [operation, setOperation] = useState("add");
  const [result, setResult] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();
    const response = await fetch(`http://localhost:8080/calculate?num1=${num1}&num2=${num2}&operation=${operation}`);
    const data = await response.json();
    setResult(data);
  };

  return (
    <form onSubmit={handleSubmit}>
      <div>
        <label htmlFor="num1">Number 1:</label>
        <input type="text" id="num1" value={num1} onChange={(e) => setNum1(e.target.value)} />
      </div>
      <div>
        <label htmlFor="num2">Number 2:</label>
        <input type="text" id="num2" value={num2} onChange={(e) => setNum2(e.target.value)} />
      </div>
      <div>
        <label htmlFor="operation">Operation:</label>
        <select id="operation" value={operation} onChange={(e) => setOperation(e.target.value)}>
          <option value="add">Add</option>
          <option value="subtract">Subtract</option>
          <option value="multiply">Multiply</option>
          <option value="divide">Divide</option>
        </select>
      </div>
      <button type="submit">Calculate</button>
      <div>Result: {result}</div>
    </form>
  );
};

export default Calculator;
