<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="laptops" method="post">
		Brand: <input type="text" name="brand" />
		<input type="submit" value="Submit"/>
	</form>

	Numele brandului : ${lapBrandName} 
	<br>
	Numar de caractere: ${lapBrandLength}
	<br>
	Paritate: ${oddEven}
	<br>
	<a href="http://localhost:8080/JSP52/">Back to main page.</a>
	
</body>
</html>