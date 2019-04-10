<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Julie's Today's Date</title>
</head>
<body>

<%

	java.util.Random random = new java.util.Random();

	int randomInt = random.nextInt(1000);
	
	randomInt++;
	
	boolean randomBoolean = randomInt % 2 == 0;
	
	String message2;
	
	if (randomBoolean) {
		message2 = "You flipped heads " + randomInt +" "+ randomBoolean + "<br/>";
	}	 
	else {	
		message2 = "You flipped tails " + randomInt +" "+ randomBoolean + "<br/>";
	}
	
%>

<%=
	message2
%>



<%-- =
	new java.util.Date()
--%>


</body>
</html>