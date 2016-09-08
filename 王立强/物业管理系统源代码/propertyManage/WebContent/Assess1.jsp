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
	left:149px;
	top:5px;
	width:866px;
	height:430px;
	z-index:1;
	background-color: #FFCCFF;
}
.STYLE1 {font-size: 40px}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var ano = document.getElementById("ano").value;
	  var content = document.getElementById("content").value;
	  var time = document.getElementById("time").value;
	  var sno = document.getElementById("sno").value;
	  var name = document.getElementById("name").value;
	  var rank = document.getElementById("rank").value;
	  
	  if(ano == null || ano == "" ){
		  //alert("用户名不能为空！");
		  alert("考核编号不能为空");
		  return false;
	  }else
	  if(content == null || content == "" ){
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
	  }else
	  if(rank == null || rank == "" ){
		  //alert("用户名不能为空！");
		  alert("考核等级不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form id="form8" name="form9" method="post" action="addAssessServlet" onsubmit="return check()">
  <table width="864" height="415" border="0">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="4"><div align="center"><span class="STYLE1">员工考核信息</span></div></td>
    </tr>
    <tr>
      <td width="184" height="61"><div align="center">考核编号</div></td>
      <td colspan="3"><form id="ano" name="ano" method="post" action="">
        <label>
        <input type="text" name="ano" id="ano" />
        </label>
          </td>
    </tr>
    <tr>
      <td><div align="center">考核内容</div></td>
      <td colspan="3"><form id="content" name="content" method="post" action="">
        <label>
        <textarea name="content" id="content"></textarea>
        </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">考核时间</div></td>
      <td width="225"><form id="time" name="time" method="post" action="">
        <label>
        <input type="text" name="time" id="time" />
        </label>
      </td>
      <td width="218"><div align="center">员工编号</div></td>
      <td width="207"><form id="sno" name="sno" method="post" action="">
        <label>
        <input type="text" name="sno" id="sno" />
        </label>
      </td>
    </tr>
    <tr>
      <td height="119"><div align="center">员工姓名</div></td>
      <td><form id="name" name="name" method="post" action="">
        <label>
        <input type="text" name="name" id="name" />
        </label>
      </td>
      <td><form id="form9" name="form9" method="post" action="">
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label><br>
        </label>
            </td>
      <td><form id="form7" name="form9" method="post" action="">
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label><br>
        <br>
        </label>
              <label></label></td>
    </tr>
    <tr>
      <td><div align="center">考核等级</div></td>
      <td><form id="rank" name="rank" method="post" action="">
        <label>
        <input type="text" name="rank" id="rank" />
        </label>
      </td>
      <td><form id="form10" name="form10" method="post" action="">
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label>
        <input type="submit" name="button3" id="button3" value="提交"action="servlet/updateAssessservlet?name=lmy">
        </label>
        <label></label>
        <label> <br>
        </label>
      </td>
      <td><font color="red" size="2" id="error">${error}</font></td>
      <td>
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label> 
        <br>
        </label>
      </td>
    </tr>
  </table>
  </form>
</div>
</body>
</html>
