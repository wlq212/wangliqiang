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
<script type="text/javascript">
  function check(){
	  
	  var lno = document.getElementById("lno").value;
	  var reason = document.getElementById("reason").value;
	  var time = document.getElementById("time").value;
	  var sno = document.getElementById("sno").value;
	  var name = document.getElementById("name").value;
	  
	  if(lno == null || lno == "" ){
		  //alert("用户名不能为空！");
		  alert("考核编号不能为空");
		  return false;
	  }else
	  if(reason == null || reason == "" ){
		  //alert("用户名不能为空！");
		  alert("考核内容不能为空");
		  return false;
	  }else
	  if(time == null || time == "" ){
		  //alert("用户名不能为空！");
		  alert("考核时间不能为空");
		  return false;
	  }else
	  if(sno == null || sno == "" ){
		  //alert("用户名不能为空！");
		  alert("员工编号不能为空");
		  return false;
	  }else
	  if(name == null || name == "" ){
		  //alert("用户名不能为空！");
		  alert("员工姓名不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
  <form name="form6" method="post" action="addLeaveServlet" onsubmit="return check()">
  <table width="711" border="2" bordercolor="#FF00FF">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="2"><div align="center" class="STYLE1">离职信息</div></td>
    </tr>
    <tr>
      <td colspan="2">离职编号      
        <form id="form2" name="form2" method="post" action="">
          <label>
          <input type="text" name="lno" id="lno" />
          </label>
        </td>
    </tr>
    
    <tr>
      <td width="71"><div align="center">离职原因</div></td>
      <td><form id="form1" name="form1" method="post" action="">
        <label>
        <textarea name="reason" cols="90" rows="15" id="reason"></textarea>
        </label>
           </td>
    </tr>
    <tr>
      <td><div align="center">离职时间</div></td>
      <td><form id="form3" name="form3" method="post" action="">
        <label>
          <input type="text" name="time" id="time" />
          </label>
            </td>
    </tr>
    <tr>
      <td height="28"><div align="center">员工编号</div></td>
      <td><form id="form4" name="form3" method="post" action="">
        <label>
        <input type="text" name="sno" id="sno" />
        </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">名字</div></td>
      <td><form id="form5" name="form3" method="post" action="">
        <label>
        <input type="text" name="name" id="name" />
        </label>
      </td>
    </tr>
</div>
<div id="apDiv3">
    <label>
    <input type="submit" name="button" id="button" value="提交">
    </label>
    <tr>
    <td><font color="red" size="2" id="error">${error}</font></td>
    </tr>
      </table>
  </form>
</div>
</body>
</html>
