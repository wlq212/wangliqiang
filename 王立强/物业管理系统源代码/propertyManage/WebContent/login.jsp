<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/jsp; charset=gb2312" />
<title>物业管理系统_登录界面</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	overflow:hidden;
}
.STYLE1 {font-size: 12px}
#apDiv1 {
	position:absolute;
	left:282px;
	top:448px;
	width:35px;
	height:20px;
	z-index:1;
}
-->
</style>
<script type="text/javascript">

  function check(){
	  var name = document.getElementById("name").value;
	  var pass = document.getElementById("pass").value;
	  if(name == null || name == ""){
		  alert("用户名不能为空");	
		  return false;
	  }
	  if(pass == null || pass == ""){
		  alert("密码不能为空");
		  return false;
	  }
	  return true;
  }
  </script>
</head>

<body>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="9fc967">&nbsp;</td>
  </tr>
  <tr>
    <td height="604"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="604" background="login_02.gif">&nbsp;</td>
        <td width="989"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="345" background="login_1.jpg">&nbsp;</td>
          </tr>
          <tr>
            <td height="47"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="539" height="47" background="login_05.gif" nowrap="nowrap">&nbsp;</td>
                <td width="206" background="login_06.gif" nowrap="nowrap">
                <form name="form1" method="post" action="loginServlet" onsubmit="return check()">
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
  	      <td><font color="red" size="2" id="error">${error}</font></td>
  	    </tr>
                  <tr>
                    <td width="21%" height="22"><div align="center"><span class="STYLE1">用户名</span></div></td>
                    <td width="53%" height="22"><div align="center">
                        <input name="name" id="name" type="text" size="15" style="height:17px; border:solid 1px #bbbbbb">
                    </div></td>
                    <td width="26%" height="22">
                      <label>
                      <div align="center"></div>
                      </label>
                                     </td>
                    </tr>
                  <tr>
                    <td height="25"><div align="center"><span class="STYLE1">密码</span>
                    </div>
                      <div align="center"></div>                      <div align="center"></div></td>
                    <td height="25"><input name="password" id="password" type="password" size="15" style="height:17px; border:solid 1px #bbbbbb"></td>
                    <td height="25">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="2"><form name="form3" method="post" action="">
                      <label></label>
                                        </td>
                    <td height="2">&nbsp;</td>
                    <td height="2">&nbsp;</td>
                  </tr>
                  <tr>
                    <td height="3"><div align="center">
                      <input type="button" name="button2" id="button2" value="注册" onclick="window.open('Staff1.jsp')">
                    </div></td>
                     <td height="3"><div align="center">
                      <input type="submit" name="button2" id="button2" value="登录">
                    </div></td>
                    <td height="3">&nbsp;</td>
                  </tr>
                </table>
                </form>
                </td>
                <td width="244" background="login_07.gif" nowrap="nowrap">&nbsp;</td>
              </tr>
            </table></td>
          </tr>
          <tr>
            <td height="212" background="login_08.gif">&nbsp;</td>
          </tr>
        </table></td>
        <td background="login_04.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td bgcolor="70ad21">&nbsp;</td>
  </tr>
</table>
</body>
</html>

