<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	list
</h1>

<P>   <c:forEach items="${list}" var="board">
${board.title}<br>
</c:forEach> </P>

</body>
</html>
