<%--
  Created by IntelliJ IDEA.
  User: Phong Vu
  Date: 11/9/2021
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>SimpleCalculator</title>
    <style>
      div{
        width: 300px;
        height: 150px;
        border: 1px solid black;
      }
      select{
        margin-left: 100px;
      }
      button{
        margin-left: 100px;
      }
    </style>
  </head>
  <body>
  <h2>SimpleCalculator</h2>
  <div>
    <form action="/CalculatorServlet" >
      <label for="first">First operand</label>
      <input type="text" id="first" value="" name="firstO"><br>
      <select name="Operator" id="">
        <option value="+">Addition</option>
        <option value="-">Subtraction</option>
        <option value="*">multiplication</option>
        <option value="/">division</option>
      </select><br>
      <label for="second">Second operand</label>
      <input type="text" id="second" value="" name="secondO"><br>
      <button type="submit">Calculate</button>
    </form>
  </div>
  </body>
</html>
