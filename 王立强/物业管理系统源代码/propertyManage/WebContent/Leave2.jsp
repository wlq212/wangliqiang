<%@page import="com.px.bean.Leave"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
<!--
#apDiv1 {
	position:absolute;
	left:225px;
	top:7px;
	width:712px;
	height:328px;
	z-index:1;
}
.STYLE1 {font-size: 30px}
#apDiv2 {
	position:absolute;
	left:45px;
	top:7px;
	width:93px;
	height:188px;
	z-index:2;
}
#apDiv3 {
	position:absolute;
	left:569px;
	top:487px;
	width:50px;
	height:42px;
	z-index:2;
}
-->
</style>
</head>

<body>
<form id="form5" name="form5" method="post" action="updateLeaveServlet">
<center>
<table>
<%List<Leave> leaves = (List<Leave>)request.getAttribute("leaves"); %>
  <%
  if(leaves!=null){
	     for(int i=0;i<leaves.size();i++){
	    	Leave leave=leaves.get(i);
  %>
<div id="apDiv1">
  <table width="711" border="2" bordercolor="#FF00FF">
    <tr>
      <td colspan="2"><div align="center" class="STYLE1">离职信息</div></td>
    </tr>
    <tr>
      <td colspan="2">离职编号      
        <form id="form2" name="form2" method="post" action="">
          <label>
          <input type="text" name="lno" id="lno" value="<%=leave.getLno()%>" readOnly=true/>
          </label>
 </td>
    </tr>
    
    <tr>
      <td width="71"><div align="center">离职原因</div></td>
      <td><form id="form1" name="form1" method="post" action="">
        <label>
        <textarea name="reason" cols="90" rows="15" id="reason" readOnly=true><%=leave.getReason()%></textarea>
        </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">离职时间</div></td>
      <td><form id="form3" name="form3" method="post" action="">
        <label>
          <input type="text" name="time" id="time"value="<%=leave.getTime()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td height="28"><div align="center">离职员工编号</div></td>
      <td><form id="form4" name="form3" method="post" action="">
        <label>
        <input type="text" name="sno" id="sno" value="<%=leave.getSno()%>" readOnly=true/>
        </label>
</td>
    </tr>
    <tr>
      <td><div align="center">离职员工姓名</div></td>
      <td><form id="form5" name="form3" method="post" action="">
        <label>
        <input type="text" name="name" id="name"value="<%=leave.getName()%>" readOnly=true/>
        </label>
</td>
    </tr>
  </table>
</div>
<div id="apDiv3">
  <form name="form6" method="post" action="">
</div>
<%}}%>
</table>
</center>
</form>
</body>
</html>
