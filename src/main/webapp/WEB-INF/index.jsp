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
	<!-- 上传文件，没有改名字 -->
	<h1>上传文件，没有改名字</h1>
	<form
		action="${pageContext.request.contextPath}/upload/upload01.action"
		method="post" enctype="multipart/form-data">
		选择文件:<input type="file" name="mf"> <input type="submit"
			value="上传">
	</form>
	<br>
	<hr>
	<h1>上传文件 改名字</h1>
	<form
		action="${pageContext.request.contextPath}/upload/upload02.action"
		method="post" enctype="multipart/form-data">
		选择文件:<input type="file" name="mf"> <input type="submit"
			value="上传">
	</form>
	<br>
	<hr>
	<h1>上传文件 改名字+分文件夹管理</h1>
	<form
		action="${pageContext.request.contextPath}/upload/up"
		method="post" enctype="multipart/form-data">
		选择文件:<input type="file" name="mf"> <input type="submit"
			value="上传">
	</form>
	<br>
</body>
</html>
