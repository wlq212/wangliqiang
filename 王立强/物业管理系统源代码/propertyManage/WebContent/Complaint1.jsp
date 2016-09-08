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
	top:8px;
	width:751px;
	height:1791px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var cono = document.getElementById("cono").value;
	  var uno = document.getElementById("uno").value;
	  var name = document.getElementById("name").value;
	  var content = document.getElementById("content").value;
	  var time = document.getElementById("time").value;
	  
	  if(cono == null || cono == "" ){
		  //alert("用户名不能为空！");
		  alert("投诉单号不能为空");
		  return false;
	  }else
	  if(uno == null || uno == "" ){
		  //alert("用户名不能为空！");
		  alert("客户编号不能为空");
		  return false;
	  }else
	  if(name == null || name == "" ){
		  //alert("用户名不能为空！");
		  alert("名字不能为空");
		  return false;
	  }else
	  if(content == null || content == "" ){
		  //alert("用户名不能为空！");
		  alert("投诉内容不能为空");
		  return false;
	  }else
	  if(time == null || time == "" ){
		  //alert("用户名不能为空！");
		  alert("投诉时间不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form id="form6" name="form6" method="post"action="addComplaintServlet" onsubmit="return check()">
  <table width="750" height="329" border="0" bgcolor="#FFFFCC">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="4" bgcolor="#FFCCFF"><div align="center" class="STYLE1">投诉</div></td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">投诉单号</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form1" name="cono" method="post" action="">
        <label>
          <input type="text" name="cono" id="cono" />
          </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">客户编号</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form2" name="form1" method="post" action="">
        <label>
        <input type="text" name="uno" id="uno" />
        </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">名字</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form3" name="form1" method="post" action="">
        <label>
        <input type="text" name="name" id="name" />
        </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">投诉内容</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form4" name="form1" method="post" action="">
        <label>
        <input type="text" name="content" id="content" />
        </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">投诉时间</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form5" name="form1" method="post" action="">
        <label></label>
        <input type="text" name="time" id="time" />
      </td>
    </tr>
    <tr>
      <td>
        <label>
          <input type="submit" name="button" id="button" value="提交" />
          </label>
      </td>
      <td><font color="red" size="2" id="error">${error}</font></td>
      <td>&nbsp;</td>
      <td><form id="form8" name="form8" method="post" action="servlet/listComplaintservlet?name=lmy">
        <label></label>
        <label></label>
      </td>
      <td><form id="form10" name="form10" method="post" action="">
        <label></label>
      </td>
    </tr>
    <tr>
      <td><form id="form7" name="form7" method="post" action="servlet/updateComplaintservlet?name=lmy">
        <label></label>
        <label></label>
      </td>
      <td><form id="form11" name="form11" method="post" action="">
      </td>
      <td><form id="form9" name="form9" method="post"action=" servlet/deleteComplaintservlet?name=lmy">
        <label></label>
      </td>
      <td>&nbsp;</td>
    </tr>
  </table>
        </form>
</div>
</body>
</html>
