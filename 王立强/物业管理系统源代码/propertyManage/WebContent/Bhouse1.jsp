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
	left:199px;
	top:3px;
	width:802px;
	height:350px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var bhno = document.getElementById("bhno").value;
	  var rno = document.getElementById("rno").value;
	  var time = document.getElementById("time").value;
	  var style = document.getElementById("style").value;
	  var retur = document.getElementById("retur").value;
	  
	  if(bhno == null || bhno == "" ){
		  //alert("用户名不能为空！");
		  alert("订单编号不能为空");
		  return false;
	  }else
	  if(rno == null || rno == "" ){
		  //alert("用户名不能为空！");
		  alert("房间号不能为空");
		  return false;
	  }else
	  if(time == null || time == "" ){
		  //alert("用户名不能为空！");
		  alert("时间不能为空");
		  return false;
	  }else
	  if(style == null || style == "" ){
		  //alert("用户名不能为空！");
		  alert("购买类型不能为空");
		  return false;
	  }else
	  if(retur == null || retur == "" ){
		  //alert("用户名不能为空！");
		  alert("是否退房不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form id="form6" name="form6" method="post" action="addBhouseServlet" onsubmit="return check()">
  <table width="802" height="353" border="1" bordercolor="#FF99FF" bgcolor="#FFCCCC">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="2"><div align="center"><span class="STYLE1">购租房记录</span></div></td>
    </tr>
    <tr>
      <td width="167"><div align="center">订单编号</div></td>
      <td width="617"><form id="form1" name="bhno" method="post" action="">
        <label>
          <input type="text" name="bhno" id="bhno" />
          </label>
           </td>
    </tr>
    <tr>
      <td><div align="center">房间</div></td>
      <td><form id="form2" name="form1" method="post" action="">
        <label>
        <input type="text" name="rno" id="rno" />
        </label>
    </td>
    </tr>
    <tr>
      <td><div align="center">时间</div></td>
      <td><form id="form3" name="form1" method="post" action="">
        <label>
        <input type="text" name="time" id="time" />
        </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">购买类型</div></td>
      <td><form id="form4" name="form1" method="post" action="">
        <label>
        <input type="text" name="style" id="style" />
        </label>
    </td>
    </tr>
    <tr>
      <td><div align="center">是否退房</div></td>
      <td><form id="form5" name="form1" method="post" action="">
        <label>
        <input type="text" name="retur" id="retur" />
        </label>
     </td>
    </tr>
    <tr>
      <td colspan="2">
        <label>
          <input name="button" type="submit" id="button" value="提交"action="servlet/listBhouseservlet?name=lmy" />
          </label>
        <label></label>
        <label></label>
        <label></label>
        <label></label>
      </td>
      <td><font color="red" size="2" id="error">${error}</font></td>
    </tr>
  </table>
        </form>
</div>
</body>
</html>
