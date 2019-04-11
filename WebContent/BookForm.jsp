<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<%-- added stylesheet reference but style sheet was not provided by Pluralsight so grabbed one used in a prior tutorial --%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

<div class = "container">
	<div class ="links">
		<h1> <a href="list">Book Store</a></h1>
		<h1> <a href="new">Add New Store</a></h1>
	</div>

	<form name="book_form" method="post" action="insert">
	<caption><h2>New Book Form</h2></caption>
		<p><label>Title:</label>
		<input type="text" name="booktitle" /></p>
		<p><label>Author:</label>
		<input type="text" name="bookauthor" /></p>
		<p><label>Price:</label>
		<input type="text" name="bookprice" /></p>	
		<br><br>
		<p><input type="submit" value="Submit"></p>
	</form>
</div>

</body>
</html>