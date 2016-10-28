<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp" %>	

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
	</head>
	<title>Welcome</title>
	<body>
		Welcome in our magic world!
		<form:form 	id="form"
					method="POST"
					action = "/childgift1/welcome/send"
					modelAttribute="magicKeyForm">
						<form:label path="magicKey">MagicKey :</form:label>
						<form:input path="magicKey"/>
						
						<form:button>Send</form:button>
		</form:form>		
	</body>
</html>	