<%@page import="com.px.bean.Stuff"%>
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
.STYLE1 {font-size: 36px}
-->
</style>
</head>

<body>
<center>
<form id="form5" name="form5" method="post" action="updateStuffServlet">
<table>
<%List<Stuff> stuffs = (List<Stuff>)request.getAttribute("stuffs"); %>
  <%
  if(stuffs !=null){
	     for(int i=0;i<stuffs.size();i++){
	    	 Stuff staff=stuffs.get(i);
  %>
<table width="790" border="2"><tr><td height="68" colspan="3"><div align="center"><table width="790" border="2"><tr><td height="68" colspan="3"><div align="center">
  <table width="1036" border="2">
    <tr>
      <td width="1024" height="68" colspan="3"><div align="center">
          <table width="790" border="2">
            <tr>
              <td height="68" colspan="3"><div align="center"><span class="STYLE1">员工个人信息</span></div></td>
              <td width="151" rowspan="2">&nbsp;</td>
            </tr>
            <tr>
              <td width="169"><div align="center">工号</div></td>
              <td colspan="2"><form id="form1" name="form1" method="post" action="">
                <label>
                  <input type="text" name="sno" id="sno" value="<%=staff.getSno()%>" readOnly=true/>
                  </label>
                密码
                <label>
                <input type="text" name="password" id="password"value="<%=staff.getPassword()%>" readOnly=true/>
                </label>
             </td>
            </tr>
            <tr>
              <td><div align="center">名字</div></td>
              <td width="249"><form id="form2" name="form2" method="post" action="">
                <label>
                  <input type="text" name="sname" id="sname"value="<%=staff.getSname()%>" readOnly=true/>
                  </label>
              </td>
              <td width="191"><div align="center">性别</div></td>
              <td><form id="form8" name="form8" method="post" action="">
                <label>
                  <input type="text" name="sex" id="sex"value="<%=staff.getSex()%>" readOnly=true/>
                  </label>
              </td>
            </tr>
            <tr>
              <td><div align="center">年龄</div></td>
              <td><form id="form3" name="form3" method="post" action="">
                <label>
                  <input type="text" name="age" id="age" value="<%=staff.getAge()%>" readOnly=true/>
                  </label>
              </td>
              <td><div align="center">学历</div></td>
              <td><form id="form9" name="form9" method="post" action="">
                <label>
                  <input type="text" name="education" id="education" value="<%=staff.getEducation()%>"/>
                  </label>
             </td>
            </tr>
            <tr>
              <td><div align="center">家庭地址</div></td>
              <td><form id="form4" name="form4" method="post" action="">
                <label>
                  <input type="text" name="address" id="address"value="<%=staff.getAddress()%>" />
                  </label>
             </td>
              <td><div align="center">邮箱</div></td>
              <td><input type="text" name="email" id="email"value="<%=staff.getEmail()%>" /></td>
            </tr>
            <tr>
              <td><div align="center">电话号码</div></td>
              <td><form id="form5" name="form5" method="post" action="">
                <label>
                  <input type="text" name="phone" id="phone"value="<%=staff.getPhone()%>" />
                  </label>
             </td>
              <td><div align="center">政治面貌</div></td>
              <td><input type="text" name="status" id="status"value="<%=staff.getStatus()%>" /></td>
            </tr>
            <tr>
              <td><div align="center">父亲</div></td>
              <td><form id="form6" name="form6" method="post" action="">
                <label>
                  <input type="text" name="father" id="father" value="<%=staff.getFather()%>" readOnly=true/>
                  </label>
             </td>
              <td><div align="center">父亲工作单位</div></td>
              <td><input type="text" name="fworkerplace" id="fworkerplace" value="<%=staff.getFworkerplace()%>" readOnly=true/></td>
            </tr>
            <tr>
              <td><div align="center">母亲</div></td>
              <td><form id="form7" name="form7" method="post" action="">
                <label>
                  <input type="text" name="monther" id="monther"value="<%=staff.getMother()%>" readOnly=true/>
                  </label>
              </td>
              <td><div align="center">母亲工作单位</div></td>
              <td><input type="text" name="mworkerplace" id="mworkerplace"value="<%=staff.getMworkerplace()%>" readOnly=true/></td>
            </tr>
            <tr>
              <td height="44" colspan="4"><form id="form10" name="form10" method="post" >
                <label>
                  <div align="center">
                    <input type="submit" name="button" id="button" value="提交" />
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
          </table>
        <span class="STYLE1"></span></div></td>
    </tr>
  </table>
  <span class="STYLE1"></span></div></td>
      </tr>
  </div></td>
    </tr>
<%}} %>
</table>
</form>
</center>
</body>
</html>
