<%@page import="com.px.bean.Contract"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
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
<form id="form5" name="form5" method="post" action="updateContractServlet">
  <table width="1041" height="296" border="0">
    <%List<Contract> contracts = (List<Contract>)request.getAttribute("contracts"); %>
  <%
  if(contracts !=null){
	     for(int i=0;i<contracts.size();i++){
	    	 Contract contract=contracts.get(i);
  %>
    <tr>
      <td colspan="7"><div align="center"><span class="STYLE1">合同表</span></div></td>
    </tr>
    <tr>
      <td width="180" height="59"><div align="center">合同编号</div></td>
      <td colspan="3"><form id="form1" name="form1" method="post" action="">
          <label>
          <input type="text" name="cno" id="cno" value="<%=contract.getCno()%>" readOnly=true/>
          </label>
     </td>
    </tr>
    <tr>
      <td height="51"><div align="center">合同内容</div></td>
      <td width="324"><form id="content" name="content" method="post" action="">
        <label>
        <input type="text" name="content" id="content" size="60"value="<%=contract.getContent()%>" readOnly=true/>
        </label>
      </td>
      <td width="182"><div align="center">生效时间</div></td>
      <td width="325"><form id="begintime" name="begintime" method="post" action="">
        <label>
          <input type="text" name="begintime" id="begintime" value="<%=contract.getBegintime()%>" readOnly=true/>
          </label>
     </td>
    </tr>
    <tr>
      <td><div align="center">时间</div></td>
      <td><form id="form5" name="form5" method="post" action="">
        <label>
          <input name="time" type="text" id="time" maxlength="100"value="<%=contract.getTime()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">员工编号</div></td>
      <td><form id="form6" name="form6" method="post" action="">
        <label>
          <input type="text" name="sno" id="sno"value="<%=contract.getSno()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td height="21" colspan="4"><div align="center">姓名
        <input type="text" name="name" id="name" value="<%=contract.getName()%>" readOnly=true/>
      </div>        
        <div align="center"></div>        </td>
    </tr>
    <tr>
      <td height="21" colspan="4">&nbsp;</td>
    </tr>
  </table>
  <table width="1042" border="0">
    <tr>
      <td><label>
      </label>
      <div align="center">&nbsp;</div></td>
    </tr>
    <%}} %>
  </table>
  </form>
</div>
</body>
</html>
