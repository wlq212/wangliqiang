<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>物业管理系统</title>
</head>

<frameset rows="63,*,23" frameborder="no" border="0" framespacing="0" id="allFrame">
  <frame src="top.jsp" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" />
  <frame src="center.jsp" name="mainFrame" id="mainFrame" />
  <frame src="down.jsp" name="bottomFrame" scrolling="No" noresize="noresize" id="bottomFrame" />
</frameset>
<noframes><body>
</body>
</noframes></html>