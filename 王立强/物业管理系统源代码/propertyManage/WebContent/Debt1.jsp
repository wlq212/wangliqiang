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
	left:305px;
	top:4px;
	width:540px;
	height:375px;
	z-index:1;
	background-color: #FFFFCC;
}
.STYLE1 {font-size: 40px}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var dno = document.getElementById("dno").value;
	  var rno = document.getElementById("rno").value;
	  var price = document.getElementById("price").value;
	  var time = document.getElementById("time").value;
	  var pay = document.getElementById("pay").value;
	  
	  if(dno == null || dno == "" ){
		  //alert("用户名不能为空！");
		  alert("欠费单号不能为空");
		  return false;
	  }else
	  if(rno == null || rno == "" ){
		  //alert("用户名不能为空！");
		  alert("欠费房间不能为空");
		  return false;
	  }else
	  if(price == null || price == "" ){
		  //alert("用户名不能为空！");
		  alert("费用不能为空");
		  return false;
	  }else
	  if(time == null || time == "" ){
		  //alert("用户名不能为空！");
		  alert("时间不能为空");
		  return false;
	  }else
	  if(pay == null || pay == "" ){
		  //alert("用户名不能为空！");
		  alert("是否支付不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form name="form7" method="post" action="addDebtServlet" onsubmit="return check()">
  <table width="541" height="452" border="2">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td width="529"><div align="center" class="STYLE1">欠费信息</div></td>
    </tr>
    <tr>
      <td height="42"><div align="left">欠费单号
          <form id="form2" name="form2" method="post" action="">
            <label>
              <input type="text" name="dno" id="dno" />
            </label>
          </div>        
        <form id="form1" name="form1" method="post" action="">
          <label>
          <div align="left"></div>
          </label>
     </td>
    </tr>
    <tr>
      <td><div align="left">欠费房间
      </div>        <form id="form3" name="form3" method="post" action="">
          <label>
          <div align="left">
            <input type="text" name="rno" id="rno" />
          </div>
          </label>
      </td>
    </tr>
    <tr>
      <td><div align="left">费用
        <form id="form5" name="form5" method="post" action="">
          <label>
            <input type="text" name="price" id="price" />
            </label>
      </div></td>
    </tr>
    <tr>
      <td><div align="left">时间
        <form id="form4" name="form4" method="post" action="">
          <label>
            <input type="text" name="time" id="time" />
            </label>
      </div></td>
    </tr>
    <tr>
      <td height="27"><div align="left">是否支付
        <form id="form6" name="form6" method="post" action="">
          <label>
            <input type="text" name="pay" id="pay" />
            </label>
      </div></td>
    </tr>
    <tr>
      <td height="28">
        <label>
        <input type="submit" name="button2" id="button2" value="提交"action="servlet/listDebtservlet?name=lmy">
        </label>
        <label></label>
        <label><br>
        </label>
        <label></label>
      </td>
      <td><font color="red" size="2" id="error">${error}</font></td>
    </tr>
  </table>
        </form>
</div>
</body>
</html>
