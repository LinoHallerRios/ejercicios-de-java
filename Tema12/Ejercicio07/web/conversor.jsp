<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>conversor de divisas</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
    <%
      double conversion=0;
      conversion = Double.parseDouble(request.getParameter("cantidad")) * 166.386;
    %>
    <div id="wrapper">
      <h1><h1>Conversor de <br>euros-pesetas</h1></h1>
      <%= request.getParameter("cantidad") %> euros son <%= conversion %> pesetas
    </div>
    <img id="jsp" src="img/euros.png">
    
  </body>
</html>
