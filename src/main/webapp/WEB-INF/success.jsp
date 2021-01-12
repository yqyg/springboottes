<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>

	<h1 style="color: red;text-align: center;">恭喜成功</h1>


	<form style="text-align: center;background-color: azure"
			action="${pageContext.request.contextPath}/upload/jump"
			method="post" enctype="multipart/form-data">
		<input type="submit" value="跳转">
	</form>
<%--<a href="../../webapp/WEB-INF/index.jsp"><button>点击跳转继续添加</button></a>--%>
</body>
</html>
