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
	left:122px;
	top:3px;
	width:901px;
	height:100px;
	z-index:1;
	background-color: #CCFF66;
}
.STYLE1 {font-size: 24px}
#apDiv2 {
	position:absolute;
	width:400px;
	height:20px;
	z-index:2;
}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var tno = document.getElementById("tno").value;
	  var content = document.getElementById("content").value;
	  var time = document.getElementById("time").value;
	  var sno = document.getElementById("sno").value;
	  var name = document.getElementById("name").value;
	  var behave = document.getElementById("behave").value;
	  
	  if(tno == null || tno == "" ){
		  //alert("用户名不能为空！");
		  alert("培训编号不能为空");
		  return false;
	  }else
	  if(content == null || content == "" ){
		  //alert("用户名不能为空！");
		  alert("培训内容不能为空");
		  return false;
	  }else
	  if(time == null || time == "" ){
		  //alert("用户名不能为空！");
		  alert("培训时间不能为空");
		  return false;
	  }else
	  if(sno == null || sno == "" ){
		  //alert("用户名不能为空！");
		  alert("员工编号不能为空");
		  return false;
	  }else
	  if(name == null || name == "" ){
		  //alert("用户名不能为空！");
		  alert("名字不能为空");
		  return false;
	  }else
	  if(behave == null || behave == "" ){
		  //alert("用户名不能为空！");
		  alert("培训表现不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
  <form id="form1" name="form1" method="post" action="addTrainServlet" onsubmit="return check()">
  <table width="899" height="224" border="0">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="4" bordercolor="#F0F0F0" bgcolor="#FFFFFF"><div align="center" class="STYLE1">员工培训</div></td>
    </tr>
    <tr>
      <td width="265" bordercolor="#F0F0F0" bgcolor="#FFFFFF"><div align="center">培训编号</div></td>
      <td colspan="3" bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form2" name="form2" method="post" action="">
        <label>
          <input type="text" name="tno" id="tno" />
          </label>
     </td>
    </tr>
    <tr>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><div align="center">培训内容</div></td>
      <td width="243" bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form3" name="form2" method="post" action="">
        <label>
        <input type="text" name="content" id="content" />
        </label>
      </td>
      <td width="125" bordercolor="#F0F0F0" bgcolor="#FFFFFF"><div align="center">培训时间</div></td>
      <td width="236" bordercolor="#F0F0F0" bgcolor="#FFFFFF"><input type="text" name="time" id="textfield7" /></td>
    </tr>
    <tr>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><div align="center">员工编号</div></td>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form4" name="form2" method="post" action="">
        <label>
        <input type="text" name="sno" id="sno" />
        </label>
      </td>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form7" name="form7" method="post" action="servlet/listTrainservlet?name=lmy">
        <label></label>
        <label></label>
      </td>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form9" name="form9" method="post" action="servlet/updateTrainservlet?name=lmy">
        <label><br>
          </label>
        <label></label>
      </td>
    </tr>
    <tr>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><div align="center">名字</div></td>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form5" name="form2" method="post" action="">
        <label>
        <input type="text" name="name" id="name" />
        </label>
      </td>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF">&nbsp;</td>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form10" name="form10" method="post" action="servlet/addTrainservlet?name=lmy">
        <label></label>
      </td>
    </tr>
    <tr>
      <td bordercolor="#F0F0F0" bgcolor="#FFFFFF"><div align="center">培训表现</div></td>
      <td colspan="3" bordercolor="#F0F0F0" bgcolor="#FFFFFF"><form id="form6" name="form2" method="post" action="">
        <label>
        <input type="text" name="behave" id="behave" />
        </label>
     </td>
    </tr>
    <label>    </label>
    <div id="apDiv2">
      <label>
      <input type="submit" name="button" id="button" value="提交">
      <td><font color="red" size="2" id="error">${error}</font></td>
      </label>
    </div>
      </table>
  </form>
</div>
</body>
</html>
