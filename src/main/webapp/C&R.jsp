<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Correlation and Regression calculator</title>
<style>
        body {
            background: linear-gradient(45deg, #e0f7fa, #b2dfdb, #c8e6c9, #fff9c4, #ffe0b2);
            background-size: 900% 200%;
            height: 90vh;
            animation: animate 10s linear infinite;
        }

        @keyframes animate {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
        }
        form{
            width: 400px;
            height: 400px;
            border: 1px solid #000000;
            border-radius: 30px;
            margin: 50px auto
}
input[type="text"], [type="submit"]{
    color:aliceblue;
    text-align: center;
    width: 300px;
    height: 50px;
    margin-bottom: 20px;
    margin-left: 10px;
    border: 5px solid #00baff;
    border-radius: 20px;
    background-color:#000000 ;
    
    outline: none
}
input [type="submit"]{

    margin-left: 150px;
    font-size: 1em;
    padding: 10px;
    color: #fff;
    border: 6px solid #0f0e0f;
    border-radius: 30px/60px;
    text-decoration: none;
    cursor: pointer;
    transition: all 0.3s ease-out;
    background-color: #000000;
    
  }
  input [type="submit"]:hover {
    background: hsl(258, 100%, 45%);
  }
  </style>
</head>
<body>
<div align="center"> <h2>Enter Data for Correlation and Regression Calculation</h2> </div>
 <div align="center">
    <form action="index2" method="post">
        Number of Data Points: <input type="text" name="n" required><br>
        X Values (Space-separated): <input type="text" name="xValues" required><br>
        Y Values (Space-separated): <input type="text" name="yValues" required><br>
        <input type="submit" value="Calculate">
    </form>
    </div>
</body>
</html>