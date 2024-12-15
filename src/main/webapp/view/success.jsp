<html>
<head>
<title>SuccessPage</title>
</head>
<body>
<h2>You login successfully.....</h2>
	<% String uname=(String)request.getAttribute("uname"); 
	String pwd=(String)request.getAttribute("pwd");   %>
	
	<%= uname %>
	<%= pwd %>

</body>
</html>