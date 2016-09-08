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
	  
	  var rpno = document.getElementById("rpno").value;
	  var rno = document.getElementById("rno").value;
	  var content = document.getElementById("content").value;
	  var price = document.getElementById("price").value;
	  var time = document.getElementById("time").value;
	  
	  if(rpno == null || rpno == "" ){
		  //alert("用户名不能为空！");
		  alert("维修单号不能为空");
		  return false;
	  }else
	  if(rno == null || rno == "" ){
		  //alert("用户名不能为空！");
		  alert("房间不能为空");
		  return false;
	  }else
	  if(content == null || content == "" ){
		  //alert("用户名不能为空！");
		  alert("维修内容不能为空");
		  return false;
	  }else
	  if(price == null || price == "" ){
		  //alert("用户名不能为空！");
		  alert("维修费用不能为空");
		  return false;
	  }else
	  if(time == null || time == "" ){
		  //alert("用户名不能为空！");
		  alert("维修时间不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form id="form7" name="form7" method="post" action="addRepairServlet" onsubmit="return check()">
  <table width="754" height="416" border="2" bordercolor="#FF0033">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="4"><div align="center"><span class="STYLE1">维修</span></div></td>
    </tr>
    <tr>
      <td width="46"><div align="center">维修单号</div></td>
      <td colspan="3"><form id="form1" name="form1" method="post" action="">
        <label>
          <input type="text" name="rpno" id="rpno" />
          </label>
            </td>
    </tr>
    <tr>
      <td><div align="center">房间</div></td>
      <td colspan="3"><form id="form2" name="form1" method="post" action="">
        <label>
        <input type="text" name="rno" id="rno" />
        </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">维修内容</div></td>
      <td colspan="3"><form id="form3" name="form1" method="post" action="">
        <label>
        <input type="text" name="content" id="content" />
        </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">维修费用</div></td>
      <td colspan="3"><form id="form4" name="form1" method="post" action="">
        <label>
        <input type="text" name="price" id="price" />
        </label>
      </td>
    </tr>
    <tr>
      <td height="43"><div align="center">维修时间</div></td>
      <td colspan="3"><form id="form5" name="form1" method="post" action="">
        <label>
        <input type="text" name="time" id="time" />
        </label>
      </td>
    </tr>
    <tr>
      <td height="215" colspan="4"><form id="form6" name="form6" method="post" action="servlet/listRepairservlet?name=lmy">
        <label></label>
             <form id="form10" name="form10" method="post" action="">
          <label></label>
             <form id="form8" name="form8" method="post" action="servlet/deteleRepairservlet?name=lmy">
        <label></label>
          <label></label>
          <div align="center">
            <input type="submit" name="button" id="button" value="提交" />
          </div>
      </td>
    </tr>
    <tr>
    <td><font color="red" size="2" id="error">${error}</font></td>
    </tr>
  </table>
  </form>
</div>
</body>
</html>
