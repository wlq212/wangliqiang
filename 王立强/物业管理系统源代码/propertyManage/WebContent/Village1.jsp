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
	left:156px;
	top:12px;
	width:843px;
	height:914px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var vno = document.getElementById("vno").value;
	  var name = document.getElementById("name").value;
	  var introduce = document.getElementById("introduce").value;
	  var sno = document.getElementById("sno").value;
	  var admini = document.getElementById("admini").value;
	  var num = document.getElementById("num").value;
	  
	  if(vno == null || vno == "" ){
		  //alert("用户名不能为空！");
		  alert("小区编号不能为空");
		  return false;
	  }else
	  if(name == null || name == "" ){
		  //alert("用户名不能为空！");
		  alert("小区名不能为空");
		  return false;
	  }else
	  if(introduce == null || introduce == "" ){
		  //alert("用户名不能为空！");
		  alert("小区介绍不能为空");
		  return false;
	  }else
	  if(sno == null || sno == "" ){
		  //alert("用户名不能为空！");
		  alert("员工编号不能为空");
		  return false;
	  }else
	  if(admini == null || admini == "" ){
		  //alert("用户名不能为空！");
		  alert("员工名不能为空");
		  return false;
	  }else
	  if(num == null || num == "" ){
		  //alert("用户名不能为空！");
		  alert("户数不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form id="form5" name="form5" method="post" action="addVillageServlet" onsubmit="return check()">
  <table width="835" height="332" border="0">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td height="92" colspan="4" bgcolor="#CCFF99"><div align="center"><span class="STYLE1">小区</span></div></td>
    </tr>
    <tr>
      <td width="116" height="34" bgcolor="#CCFF99"><div align="center">小区编号</div></td>
      <td width="402" bgcolor="#CCFF99"><form id="form1" name="form1" method="post" action="">
        <label>
        <input type="text" name="vno" id="vno" />
        </label>
      </td>
      <td width="125" bgcolor="#CCFF99"><div align="center">户数</div></td>
      <td width="162" bgcolor="#CCFF99"><input type="text" name="num" id="num" /></td>
    </tr>
    <tr>
      <td height="41" bgcolor="#CCFF99"><div align="center">小区名</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="name" id="name" /></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form id="form2" name="form2" method="post" action="servlet/listVillageservlet?name=lmy">
        <label></label>
      </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">&nbsp;</td>
    </tr>
    <tr>
      <td height="44" bgcolor="#CCFF99"><div align="center">小区介绍</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="introduce" id="introduce" /></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form id="form3" name="form3" method="post" action="servlet/deleteVillageservlet?name=lmy">
        <label></label>
      </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">&nbsp;</td>
    </tr>
    <tr>
      <td height="56" bgcolor="#CCFF99"><div align="center">员工编号</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="sno" id="sno" /></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form id="form4" name="form4" method="post" action="">
        <label></label>
      </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form name="form6" method="post"action="servlet/updateVillageservlet?name=lmy">
        <label></label>
     </td>
    </tr>
    <tr>
      <td height="47" bgcolor="#CCFF99"><div align="center">员工名</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="admini" id="admini" /></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">
        <label>
          <input type="submit" name="button4" id="button4" value="提交" />
          </label>
          <td><font color="red" size="2" id="error">${error}</font></td>
      </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">&nbsp;</td>
    </tr>
  </table>
        </form>
</div>
</body>
</html>