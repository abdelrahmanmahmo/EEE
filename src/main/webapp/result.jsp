<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results Page</title>
<style>
    body {
        background-color: #f4f4f9; 
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }

    h2 {
        text-align: center;
        color: #333;
        margin-top: 20px;
    }

    .result-container {
        background-color: #fff;
        border: 2px solid #0078D7;
        border-radius: 10px; 
        width: 50%;
        margin: 20px auto;
        padding: 20px;
        box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        text-align: center;
    }

    .result-container p {
        color: #333;
        font-size: 18px;
        margin: 10px 0;
    }

    a {
        display: inline-block;
        text-decoration: none;
        background-color: #0078D7;
        color: #fff;
        padding: 10px 20px;
        border-radius: 5px;
        margin-top: 20px;
        font-size: 16px;
    }

    a:hover {
        background-color: #005bb5; 
</style>
</head>
<body>
<h2>Results</h2>
<div class="result-container">
    <p>Mean: ${mean}</p>
    <p>Variance: ${variance}</p>
    <p>Mode: ${mode}</p>
    <p>Median: ${median}</p>
</div>
<div style="text-align: center;">
    <a href="E3.jsp">Go Back</a>
</div>
</body>
</html>