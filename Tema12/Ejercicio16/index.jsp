<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tirada de dado</title>
  </head>
  <body>
    <%
      int d1 = (int)(Math.random()*6)+1;
      int d2 = (int)(Math.random()*6)+1;
      int d3 = (int)(Math.random()*6)+1;
    %>
    <img src="<%=d1%>.png">
    <img src="<%=d2%>.png">
    <img src="<%=d3%>.png">
  </body>
</html>
