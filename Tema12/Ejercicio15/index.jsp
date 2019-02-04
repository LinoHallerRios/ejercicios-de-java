<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Numeros Primos</title>
    <style>
      .rojo {color:red;}
    </style>
  </head>
  <body>
    <div id="wrapper">
      <p>
        Los numeros primos aparecen en rojo: 
      </p>
      <p>
        <%
          int contador = 0;
          int num = 0;
          for (int i = 0; i < 100; i++){
            contador = 0;
            num = (int)(Math.random() * 200) + 1;
            for (int I = 1; I <= num; I++) {
              if ((num % I) == 0) {
                contador++;
              }
            }
            if (contador <= 2) {
              out.print("<span class=\"rojo\">" + num + "</span> ");
            } else {
              out.print(num + " ");
            }
          }
        %>
      </p>
    </div>
  </body>
</html>
