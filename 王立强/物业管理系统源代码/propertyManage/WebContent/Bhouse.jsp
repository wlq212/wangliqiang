<%@page import="com.px.bean.Bhouse"%>
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
	top:3px;
	width:802px;
	height:350px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
-->
</style>
</head>

<body>
<div id="apDiv1">
<form id="form6" name="form6" method="post" action="updateBhouseServlet">
  <table width="802" height="353" border="1" bordercolor="#FF99FF" bgcolor="#FFCCCC">
  <%List<Bhouse> bhouses = (List<Bhouse>)request.getAttribute("bhouses"); %>
  <%
  if(bhouses !=null){
	     for(int i=0;i<bhouses.size();i++){
	    	 Bhouse bhouse=bhouses.get(i);
  %>
    <tr>
      <td colspan="2"><div align="center"><span class="STYLE1">购租房记录</span></div></td>
    </tr>
    <tr>
      <td width="167"><div align="center">编号</div></td>
      <td width="617"><form id="form1" name="bno" method="post" action="">
        <label>
          <input type="text" name="bhno" id="bhno"  value="<%=bhouse.getBhno()%>" readOnly=true/>
          </label>
      </form>      </td>
    </tr>
    <tr>
      <td><div align="center">房间号</div></td>
      <td><form id="form2" name="form1" method="post" action="">
        <label>
        <input type="text" name="rno" id="rno"  value="<%=bhouse.getRno()%>"/>
        </label>
      </form></td>
    </tr>
    <tr>
      <td><div align="center">购买时间</div></td>
      <td><form id="form3" name="form1" method="post" action="">
        <label>
        <input type="text" name="time" id="time"  value="<%=bhouse.getTime()%>" />
        </label>
      </form></td>
    </tr>
    <tr>
      <td><div align="center">房屋类型</div></td>
      <td><form id="form4" name="form1" method="post" action="">
        <label>
        <input type="text" name="style" id="style"  value="<%=bhouse.getStyle()%>"/>
        </label>
      </form></td>
    </tr>
    <tr>
      <td><div align="center">是否退房</div></td>
      <td><form id="form5" name="retur" method="post" action="">
        <label>
        <input type="text" name="retur" id="retur" value="<%=bhouse.getRetur()%>"/>
        </label>
      </form></td>
    </tr>
    <tr>
      <td colspan="2">
        <label>
          <input name="button" type="submit" id="button" value="提交" />
          </label>
        <label></label>
        <label></label>
        <label></label>
        <label></label>
      </td>
    </tr>
    <%}} %>
  </table>
  </form>
</div>
</body>
</html>
