<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Math</title>
</head>
<body>
	<%
	String a;
	String b;
	int c;
	
		String errorA = "";
		
		if (request.getAttribute("errorA") != null) {
			errorA = (String) request.getAttribute("errorA");

		}
		String errorB = "";

		if (request.getAttribute("errorB") != null) {
			errorB = (String) request.getAttribute("errorB");
		}
		String errorC = "";
		if (request.getAttribute("errorC") != null) {
			errorB = (String) request.getAttribute("errorC");
		}


		if (request.getAttribute("parametarA") != null) {
			a = (String) request.getAttribute("parametarA");
		} else {
			a = "0";
		}
		if (request.getAttribute("parametarB") != null) {
			b = (String) request.getAttribute("parametarB");
		} else {
			b = "0";
		}
		if (request.getAttribute("parametarC") != null) {
			c = (Integer) request.getAttribute("parametarC");
		} else {
			c = 0;
		}
	%>

	<form action='../WebAppDay0203Math/math' method='post'>
		a: <input type='text' value=<%=a%> name='a' /> <br>
		<%=errorA%>
		<br> b: <input type='text' value=<%=b%> name='b' /> <br>
		<%=errorB%>
		<br> c: <input type='text' value=<%=c%> name='c' /> <br>
		<%=errorC%>
		<br><input type='submit' value='plus' name='plus' id='operation' /> <br> 
		<input type='submit' value='minus' name='minus' id='operation' />

	</form>

</body>
</html>
