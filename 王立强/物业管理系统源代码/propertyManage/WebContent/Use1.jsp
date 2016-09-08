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
<title>用户注册界面</title>
<style type="text/css">
<!--
#apDiv1 {
	position:absolute;
	left:85px;
	top:6px;
	width:1906px;
	height:301px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
#apDiv2 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:1;
}
#apDiv3 {
	position:absolute;
	width:1px;
	height:50px;
	z-index:1;
	left: -45px;
	top: 4px;
}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var uno = document.getElementById("sno").value;
	  var uname = document.getElementById("uname").value;
	  var password = document.getElementById("password").value;
	  var sex = document.getElementById("sex").value;
	  var age = document.getElementById("age").value;
	  var carid = document.getElementById("carid").value;
	  var pet = document.getElementById("pet").value;
	  var phone = document.getElementById("phone").value;
	  var father = document.getElementById("father").value;
	  var mother = document.getElementById("mother").value;
	  
	  if(uno == null || uno == "" ){
		  //alert("用户名不能为空！");
		  alert("用户编号不能为空");
		  return false;
	  }else
		  if(uname == null || uname == "" ){
			  //alert("用户名不能为空！");
			  alert("姓名不能为空");
			  return false;
		  }else
	  if(password == null || password == "" ){
		  //alert("用户名不能为空！");
		  alert("密码不能为空");
		  return false;
	  }els
	  if(sex == null || sex == "" ){
		  //alert("用户名不能为空！");
		  alert("性别不能为空");
		  return false;
	  }else
	  if(age == null || age == "" ){
		  //alert("用户名不能为空！");
		  alert("年龄不能为空");
		  return false;
	  }else
	  if(carid == null || carid == "" ){
		  //alert("用户名不能为空！");
		  alert("车子型号不能为空");
		  return false;
	  }else
	  if(pet == null || pet == "" ){
		  //alert("用户名不能为空！");
		  alert("宠物不能为空");
		  return false;
	  }else
	  if(phone == null || phone == "" ){
		  //alert("用户名不能为空！");
		  alert("电话号码不能为空");
		  return false;
	  }else
	  if(father == null || father == "" ){
		  //alert("用户名不能为空！");
		  alert("父亲不能为空");
		  return false;
	  }else
	  if(mother == null || mother == "" ){
		  //alert("用户名不能为空！");
		  alert("母亲不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form name="form5" method="post" action="addUseServlet" onsubmit="return check()">
  <table width="976" height="348" border="0">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td bgcolor="#CCFF66"><div align="center" class="STYLE1">客户</div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">用户编号
        <form name="form4" method="post" action="">
          <label></label>
       
        </div>        <form id="form1" name="form1" method="post" action="">
          <label></label>
          
          <div align="center">
            <input type="text" name="uno" id="uno" />
            </div>
</td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">姓名</div>
        
        <div align="center">
          <input type="text" name="uname" id="uname" />
      </div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">密码</div>
        
        <div align="center">
          <input type="text" name="password" id="password" />
      </div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">性别</div>        
<div align="center"><input type="text" name="sex" id="sex" />
        </div></td>
    </tr>
    <tr>
      <td height="23" bgcolor="#CCFF66"><div align="center">年龄</div>
        
        <div align="center">
          <input type="text" name="age" id="age" />
      </div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">车子型号</div>
        
        <div align="center">
          <input type="text" name="carid" id="carid" />
      </div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">宠物</div> 
                                                                                                                                                                                      
        <div align="center">
          <input type="text" name="pet" id="pet" />
      </div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">电话号码</div>
        
        <div align="center">
          <input type="text" name="phone" id="phone" />
      </div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF66"><div align="center">父亲</div> 
                                                                                                                                                                                                                                                                                                                                                                                    
        <div align="center">
          <input type="text" name="father" id="father" />
              </div></td>
    </tr>
    <tr>
      <td height="20" bgcolor="#CCFF66"><div align="center">母亲</div> 
                                                                                                                                                                          
        <div align="center">
          <input type="text" name="mother" id="mother" />
      </div></td>
    </tr>
    <tr>
      <td height="62" bgcolor="#CCFF66"><div align="center">
        <form name="form3" method="post" action="servlet/listUseeservlet?name=lmy">
          <label></label>
        </div>        <form name="form7" method="post" action="">
          <label></label>       
          <label>
          <div align="center">
            <input type="submit" name="button3" id="button3" value="提交">
            <td><font color="red" size="2" id="error">${error}</font></td>
          </div>
          </label>
          <label></label>
          </td>
    </tr>
  </table>
            </form>
  <div id="apDiv3">
    <form id="form2" name="form2" method="post" action="servlet/addUseservlet?name=lmy">
      <label></label>
    </form>
  </div>
</div>
</body>
</html>
