<%@page import="com.px.bean.Debt"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
<form id="form5" name="form5" method="post" action="updateDebtServlet">
<div id="apDiv1">
  <table width="1041" height="296" border="0">
  <%List<Debt> debts = (List<Debt>)request.getAttribute("debts"); %>
  <%
  if(debts !=null){
	     for(int i=0;i<debts.size();i++){
	    	 Debt debt=debts.get(i);
  %>
    <tr>
      <td colspan="7"><div align="center"><span class="STYLE1">欠费表</span></div></td>
    </tr>
    <tr>
      <td width="180" height="59"><div align="center">编号</div></td>
      <td><form id="form1" name="form1" method="post" action="">
          <label>
          <input type="text" name="dno" id="dno" value="<%=debt.getDno()%>" readOnly=true/>
          </label>
     </td>
      <td><div align="center">房间号</div></td>
      <td><form id="form2" name="form2" method="post" action="">
        <label>
          <input type="text" name="rno" id="rno" value="<%=debt.getRno()%>"/>
          </label>
     </td>
    </tr>
    <tr>
      <td height="51"><div align="center">欠费金额</div></td>
      <td width="324"><form id="content" name="content" method="post" action="">
        <label>
        <input type="text" name="price" id="price" value="<%=debt.getPrice()%>"/>
        </label>
     </td>
      <td width="182"><div align="center">时间</div></td>
      <td width="325"><form id="begintime" name="begintime" method="post" action="">
        <label>
          <input type="text" name="time" id="time" value="<%=debt.getTime()%>"/>
          </label>
     </td>
    </tr>
    <tr>
      <td><div align="center">是否支付</div></td>
      <td><form id="form5" name="form5" method="post" action="">
        <label>
          <input name="pay" type="name" id="pay" maxlength="100" value="<%=debt.getPay()%>"/>
          </label>
      </td>
      <td><div align="center">
        <input type="submit" name="button" id="button" value="提交" />
      </div></td>
      <td><form id="form6" name="form6" method="post" action="">
        <label></label>
     </td>
    </tr>

    <tr>
      <td colspan="4"><form id="form3" name="form3" method="post" action="">
        <label>
        <div align="center"></div>
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
    <%}}%>
  </table>
  </form>
</div>
</body>
</html>
