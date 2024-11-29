<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Menu</title>
<style>
  body {
    background-color: #000;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center; 
    align-items: center;     
    min-height: 100vh;       
  }
  .gallery {
    display: flex;
    flex-wrap: wrap;
    gap: 20px;
    justify-content: center; 
    align-items: center;     
  }
  .item {
    width: 480px;
    text-align: center;
    position: relative;
  }
  .item img {
    width: 100%;
    border-radius: 8px;
    transition: transform 0.3s ease;
  }
  .item:hover img {
    transform: scale(1.1);
  }
  h2 {
    color: aliceblue;
  }
</style>
</head>
<body>
<div class="gallery">
  <div class="item">        
    <a href="E3.jsp">
      <img src="photo1.jpg" alt="Image 1">
    </a>
    <h2>Central tendency for grouped data</h2>           
  </div>
  <div class="item">
    <a href="C&R.jsp">
      <img src="photo2.jpg" alt="Image 2">
    </a>
    <h2>Correlation and Regression</h2>
  </div>
</div>
</body>
</html>
