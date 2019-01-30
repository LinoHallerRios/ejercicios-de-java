<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Pirámide</title>
  </head>
  <body>
    <%
      int alturaTotal = Integer.parseInt(request.getParameter("altura"));
      int altura = 1;
      int i = 0;
      int espacios = alturaTotal - 1;

      while (altura <= alturaTotal) {

        for (i = 1; i <= espacios; i++) {
          out.print("<img src=\"img/blanco.png\">");
        }

        for (i = 1; i < altura * 2; i++) {
          out.print("<img src=\"img/banana.ico\">");
        }

        out.println("</br>");

        altura++;
        espacios--;
      }
    %>
  </body>
</html>
