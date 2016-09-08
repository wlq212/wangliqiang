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
<title>员工注册界面</title>
<style type="text/css">
<!--
.STYLE1 {font-size: 36px}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var sno = document.getElementById("sno").value;
	  var password = document.getElementById("password").value;
	  var sname = document.getElementById("sname").value;
	  var sex = document.getElementById("sex").value;
	  var age = document.getElementById("age").value;
	  var education = document.getElementById("education").value;
	  var address = document.getElementById("address").value;
	  var email = document.getElementById("email").value;
	  var phone = document.getElementById("phone").value;
	  var status = document.getElementById("status").value;
	  var father = document.getElementById("father").value;
	  var fworkerplace = document.getElementById("fworkerplace").value;
	  var mother = document.getElementById("mother").value;
	  var mworkerplace = document.getElementById("mworkerplace").value;
	  
	  if(sno == null || sno == "" ){
		  //alert("用户名不能为空！");
		  alert("工号不能为空");
		  return false;
	  }else
	  if(password == null || password == "" ){
		  //alert("用户名不能为空！");
		  alert("密码不能为空");
		  return false;
	  }else
	  if(sname == null || sname == "" ){
		  //alert("用户名不能为空！");
		  alert("用户名不能为空");
		  return false;
	  }else
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
	  if(education == null || education == "" ){
		  //alert("用户名不能为空！");
		  alert("学历不能为空");
		  return false;
	  }else
	  if(address == null || address == "" ){
		  //alert("用户名不能为空！");
		  alert("地址不能为空");
		  return false;
	  }else
	  if(email == null || email == "" ){
		  //alert("用户名不能为空！");
		  alert("邮箱不能为空");
		  return false;
	  }else
	  if(phone == null || phone == "" ){
		  //alert("用户名不能为空！");
		  alert("手机号不能为空");
		  return false;
	  }else
	  if(status == null || status == "" ){
		  //alert("用户名不能为空！");
		  alert("政治面貌不能为空");
		  return false;
	  }else
	  if(father == null || father == "" ){
		  //alert("用户名不能为空！");
		  alert("父亲不能为空");
		  return false;
	  }else
	  if(fworkerplace == null || fworkerplace == "" ){
		  //alert("用户名不能为空！");
		  alert("父亲工作单位不能为空");
		  return false;
	  }else
	  if(mother == null || mother == "" ){
		  //alert("用户名不能为空！");
		  alert("母亲不能为空");
		  return false;
	  }else
	  if(mworkerplace == null || mworkerplace == "" ){
		  //alert("用户名不能为空！");
		  alert("母亲工作单位不能为空");
		  return false;
	  }
	  return true;
  }
</script>
</head>

<body>
<center>
<form id="form10" name="form10" method="post" action="addStuffServlet" onsubmit="return check()">
<table width="790" border="2"><tr><td height="68" colspan="3"><div align="center"><table width="790" border="2"><tr><td height="68" colspan="3"><div align="center">
  <table width="1036" border="2">
    <tr>
      <td width="1024" height="68" colspan="3"><div align="center">
          <table width="790" border="2">
          <%String error = (String)request.getAttribute("error"); %>
            <tr>
              <td height="68" colspan="3"><div align="center"><span class="STYLE1">员工个人信息</span></div></td>
              <td width="151" rowspan="2">&nbsp;</td>
            </tr>
            <tr>
              <td width="169"><div align="center">工号</div></td>
              <td colspan="2"><form id="form1" name="form1" method="post" action="">
                <label>
                  <input type="text" name="sno" id="sno" />
                  </label>
                密码
                <label>
                <input type="text" name="password" id="password">
                </label>
              </td>
            </tr>
            <tr>
              <td><div align="center">名字</div></td>
              <td width="249"><form id="form2" name="form2" method="post" action="">
                <label>
                  <input type="text" name="sname" id="sname" />
                  </label>
              </td>
              <td width="191"><div align="center">性别</div></td>
              <td><form id="form8" name="form8" method="post" action="">
                <label>
                  <input type="text" name="sex" id="sex" />
                  </label>
              </td>
            </tr>
            <tr>
              <td><div align="center">年龄</div></td>
              <td><form id="form3" name="form3" method="post" action="">
                <label>
                  <input type="text" name="age" id="age" />
                  </label>
              </td>
              <td><div align="center">学历</div></td>
              <td><form id="form9" name="form9" method="post" action="">
                <label>
                  <input type="text" name="education" id="education" />
                  </label>
              </td>
            </tr>
            <tr>
              <td><div align="center">家庭地址</div></td>
              <td><form id="form4" name="form4" method="post" action="">
                <label>
                  <input type="text" name="address" id="address" />
                  </label>
              </td>
              <td><div align="center">邮箱</div></td>
              <td><input type="text" name="email" id="email" /></td>
            </tr>
            <tr>
              <td><div align="center">电话号码</div></td>
              <td><form id="form5" name="form5" method="post" action="">
                <label>
                  <input type="text" name="phone" id="phone" />
                  </label>
              </td>
              <td><div align="center">政治面貌</div></td>
              <td><input type="text" name="status" id="status" /></td>
            </tr>
            <tr>
              <td><div align="center">父亲</div></td>
              <td><form id="form6" name="form6" method="post" action="">
                <label>
                  <input type="text" name="father" id="father" />
                  </label>
              </td>
              <td><div align="center">父亲工作单位</div></td>
              <td><input type="text" name="fworkerplace" id="fworkerplace" /></td>
            </tr>
            <tr>
              <td><div align="center">母亲</div></td>
              <td><form id="form7" name="form7" method="post" action="">
                <label>
                  <input type="text" name="mother" id="mother" />
                  </label>
              </td>
              <td><div align="center">母亲工作单位</div></td>
              <td><input type="text" name="mworkerplace" id="mworkerplace" /></td>
            </tr>
            <tr>
              <td height="44" colspan="4">
                <label>
                  <div align="center">
                    <input type="submit" name="button" id="button" value="注册"action="servlet/listStaffservlet?name=lmy" />
                  </div>
                </label>
                <label></label>
                <label></label>
                <label></label>
                <label></label>
                <label></label>
                <div align="center"></div>
                <div align="center"></div>
              </td>
              </tr>
              <tr>
              <td><font color="red" size="2" id="error">${error}</font></td>
              </tr>
          </table>
        <span class="STYLE1"></span></div></td>
    </tr>
  </table>
  <span class="STYLE1"></span></div></td>
      </tr>
</table>
</form>
</center>
  </div></td>
    </tr>
</table>
</body>
</html>
