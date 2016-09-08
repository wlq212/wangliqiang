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
	left:79px;
	top:2px;
	width:499px;
	height:400px;
	z-index:1;
}
#apDiv2 {
	position:absolute;
	width:1px;
	height:1px;
	z-index:1;
}
#apDiv3 {
	position:absolute;
	width:1px;
	height:115px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
#apDiv4 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:1;
	left: -200px;
	top: 438px;
}
#apDiv5 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:1;
}
#apDiv6 {
	position:absolute;
	width:0px;
	height:115px;
	z-index:1;
	left: 1px;
}
#apDiv7 {
	position:absolute;
	width:70px;
	height:100px;
	z-index:1;
}
#apDiv8 {
	position:absolute;
	width:730px;
	height:10px;
	z-index:1;
}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var cno = document.getElementById("cno").value;
	  var content = document.getElementById("content").value;
	  var begintime = document.getElementById("begintime").value;
	  var time = document.getElementById("time").value;
	  var sno = document.getElementById("sno").value;
	  var name = document.getElementById("name").value;
	  
	  if(cno == null || cno == "" ){
		  //alert("用户名不能为空！");
		  alert("合同编号不能为空");
		  return false;
	  }else
	  if(content == null || content == "" ){
		  //alert("用户名不能为空！");
		  alert("合同内容不能为空");
		  return false;
	  }else
		  if(begintime == null || begintime == "" ){
			  //alert("用户名不能为空！");
			  alert("生效时间不能为空");
			  return false;
		  }else
	  if(time == null || time == "" ){
		  //alert("用户名不能为空！");
		  alert("有效期限不能为空");
		  return false;
	  }else
	  if(sno == null || sno == "" ){
		  //alert("用户名不能为空！");
		  alert("员工编号不能为空");
		  return false;
	  }else
	  if(name == null || name == "" ){
		  //alert("用户名不能为空！");
		  alert("员工名字不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
    <form id="form2" name="form2" method="post" action="addContractServlet" onsubmit="return check()">
  <table width="730" border="2" align="center">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td height="69" colspan="4"><div align="center"><span class="STYLE1">合同</span></div></td>
    </tr>
    <tr>
      <td width="228">合同编号        </td>
      <td colspan="3">生效时间</td>
    </tr>
    <tr>
      <td><form id="form1" name="form1" method="post" action="">
        <label>
          <input type="text" name="cno" id="cno" />
          </label>
     </td>
      <td colspan="3"><input type="text" name="begintime" id="begintime" /></td>
    </tr>
    <tr>
      <td height="244" colspan="4"><form id="form4" name="form4" method="post" action="">
        <label>
          <textarea maxlenth="300" name="content" id="content">合同内容</textarea>
          </label>
        员工编号
        <label>
        <input type="text" name="sno" id="sno">
        </label>
      </td>
    </tr>
    <tr>
      <td height="60"><div align="center">有效期限</div></td>
      <td width="218"><form id="form3" name="form3" method="post" action="">
        <label>
          <input type="text" name="time" id="time" />
          </label>
      </td>
      <td width="126">员工名字</td>
      <td width="128"><form id="form5" name="form5" method="post" action="">
        <label>
          <input type="text" name="name" id="name" />
          </label>
      </td>
    </tr>
  <div id="apDiv8">
      <label></label>
      <label></label>
      <input type="submit" name="button3" id="button3" value="提交" action="servlet/updateContractservlet?name=lmy"/>
      <label></label>
      <p>
        <label></label>
        <label></label>
      </p>
      <p>
        <label></label>
        <label></label>
      </p>
      <tr>
    <td><font color="red" size="2" id="error">${error}</font></td>
    </tr>
        </table>
    </form>
  </div>
</div>
</body>
</html>
