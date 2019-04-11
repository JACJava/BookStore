<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<%-- added stylesheet reference but style sheet was not provided by Pluralsight so grabbed one used in a prior tutorial --%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

<%-- 2090410 added single line for one book --%>
<%-- <p>Book Title: + ${book_title}</p> --%>

<%-- 2090411 added foreach loop for multiple books from an arraylist --%>
<%-- 2090411 to do that, need to add Maven support to our project    --%>
<%-- 2090411 so we can use the JSP standard tag library              --%>

<%-- 
<c:forEach items="${book_titles}" var="item">
	<p>Book: ${item}</p>
</c:forEach>
 --%>

<%-- 2090411 changed to accept an array of book objects              --%>
<%--
<c:forEach items="${book_list}" var="item">
	<p>Book: ${item}</p>
</c:forEach>
 --%>

<%-- 2090411 create column headings           --%>
<div class = "container">
	<h1>Book Store</h1>
	<table>
		<caption>List of Books</caption>
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
		</tr>
	</table>
</div>

<%-- 2090411 keep the foreach loop so we can create a row            --%>
<c:forEach items="${book_list}" var="item">
	<tr>
		<td> ${item.getTitle()} </td>
		<td> ${item.getAuthor()} </td>
		<td> ${item.getPrice()} </td>
	</tr>
	<br> </br>
</c:forEach>



</body>
</html>