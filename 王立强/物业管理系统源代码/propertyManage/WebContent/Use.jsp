<%@page import="com.px.bean.Use"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style type="text/css">
<!--
#apDiv1 {
	position:absolute;
	left:133px;
	top:2px;
	width:1041px;
	height:446px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
-->
</style>
</head>

<body>
<div id="apDiv1">
<form id="form5" name="form5" method="post" action="updateUseServlet">
  <table width="1041" height="296" border="0">
  <%List<Use> uses = (List<Use>)request.getAttribute("uses"); %>
  <%
  if(uses !=null){
	     for(int i=0;i<uses.size();i++){
	    	Use use=uses.get(i);
  %>
    <tr>
      <td colspan="7"><div align="center"><span class="STYLE1">用户表</span></div></td>
    </tr>
    <tr>
      <td width="180" height="59"><div align="center">编号</div></td>
      <td>
          <label>
          <input type="text" name="uno" id="uno" value="<%=use.getUno()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">用户名字</div></td>
        <label>
          </label>
     </td>
    </tr>
    <tr>
      <td height="51"><div align="center">密码</div></td>
      <td width="324">
        <label>
        <input type="text" name="password" id="passowrd" value="<%=use.getPassword()%>" readOnly=true/>
        </label>
     </td>
      <td width="182"><div align="center">性别</div></td>
      <td width="325">
        <label>
          <input type="text" name="sex" id="sex" value="<%=use.getSex()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">年龄</div></td>
      <td>
        <label>
          <input name="age" type="name" id="age" maxlength="100" value="<%=use.getAge()%>" readOnly=true/>
          </label>
     </td>
      <td><div align="center">车子型号</div></td>
      <td>
        <label>
          <input type="text" name="carid" id="carid" value="<%=use.getCarid()%>"/>
          </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">宠物
      </div></td>
      <td>
        <label>
          <input type="text" name="pet" id="pet" value="<%=use.getPet()%>"/>
          </label>
      </td>
      <td><div align="center">电话号码</div></td>
      <td>
        <label>
          <input type="text" name="phone" id="phone" value="<%=use.getPhone()%>"/>
          </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">父亲</div></td>
      <td>
        <label>
          <input type="text" name="father" id="father" value="<%=use.getFather()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">母亲</div></td>
      <td>
        <label>
          <input type="text" name="mother" id="mother" value="<%=use.getMother()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td colspan="4">
        <label>
          <div align="center">
            <input type="submit" name="button" id="button" value="提交" />
          </div>
        </label>
        <div align="center"></div>
      </td>
    </tr>
  </table>
  <table width="1042" border="0">
    <tr>
      <td><label>
        <div align="center"></div>
      </label>
      <div align="center">&nbsp;</div></td>
    </tr>
	<%}} %>
  </table>
  </form>
</div>
</body>
</html>

