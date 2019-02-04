<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Serie de Fibonacci</title>
  </head>
  <body>
    <h1>Serie de Fibonacci</h1>
    <%
      int numero=Integer.parseInt(request.getParameter("num"));
      int fibo1 = 0;
      int fibo2 = 1;
      out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
      out.print(fibo1 + " ");
      for (int i = 2; i <= numero; i++) {
        out.print(fibo2 + " ");
        fibo2 = fibo1 + fibo2;
        fibo1 = fibo2 - fibo1;
      }
    %>
  </body>
</html>
