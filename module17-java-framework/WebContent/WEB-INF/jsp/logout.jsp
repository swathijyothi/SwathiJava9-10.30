<%
session.getAttribute("u");
session.invalidate();
response.sendRedirect("login");

%>