
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Juego del cubo</title>
  </head>
  <body>
    <%
      String bola1="";
      String bola2="";
      String bola3="";
      int aleatorio = (int)(Math.random() * 3 + 1);
      switch (aleatorio) {
        case 1:
          bola1 = "con";
          bola2 = "sin";
          bola3 = "sin";
          break;
        case 2:
          bola1 = "sin";
          bola2 = "con";
          bola3 = "sin";
          break;
        case 3:
          bola1 = "sin";
          bola2 = "sin";
          bola3 = "con";
          break;
      }
    %>
    <img src="img/cubilete/cubilete_<%= bola1 %>_bola.png">
    <img src="img/cubilete/cubilete_<%= bola2 %>_bola.png">
    <img src="img/cubilete/cubilete_<%= bola3 %>_bola.png">
    <br>
    <%
      String resultado;
      if (aleatorio == Integer.parseInt(request.getParameter("cubo"))){
        resultado = "Enhorabuena! Has acertado.";
      } else {
        resultado = "Lo siento has fallado, vuelve a intentarlo.";
      }
    %>
    <h1><%= resultado%></h1>
  </body>
</html>
