<%@ include file="../include/importTags.jsp"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE HTML>
<html>
	<head>
	<meta http-equiv="Content-Type" content="type-text/html; charset=utf-8">
	<link type="text/css" href="<spring:url value='/css/first.css' />"
		  rel="Stylesheet">
	</head>
	
	<body>
		<div>
			<tiles:insertAttribute name="main-content" />
			<img src='<spring:url value="/images/543305_3567626798707_1749128401_n.jpg"/>'/>
		</div>
	</body>
</html>