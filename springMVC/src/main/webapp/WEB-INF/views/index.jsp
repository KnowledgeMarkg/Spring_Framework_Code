<%@page import="java.util.List"%>
<html>
<body>
<% String name =(String)request.getAttribute("Name");%>
<h2>Hello World! <%= name %></h2>
<%
  List<String> family = (List<String>)request.getAttribute("family");
int i=1;
%>
<%
for(String st : family){
%>	  
   <h1>Family Member <%= i %> : <%= st %></h1>
<%
i++;
}
%>
</body>
</html>
