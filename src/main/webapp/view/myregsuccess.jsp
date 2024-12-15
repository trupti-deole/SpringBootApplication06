<%@page import="com.example.demo.model.Employee"%>
<html>
<head>
<title>REgisterPage</title>
</head>
<body>
   <h2>REgister successfully</h2>
   <%Employee e=(Employee)request.getAttribute("data"); %>
   <%= e.getName() %>
   <%= e.getEmpId() %>
   <%= e.getPwd() %>
   <%= e.getAdd() %>
   <%= e.getMarks() %>
</body>
</html>

