<%@page import="com.px.bean.Complaint"%>
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
	top:8px;
	width:751px;
	height:1791px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
-->
</style>
</head>

<body>
<form id="form5" name="form5" method="post" action="updateComplaintServlet">
<table>
  <%List<Complaint> complaints = (List<Complaint>)request.getAttribute("complaints"); %>
  <%
  if(complaints !=null){
	     for(int i=0;i<complaints.size();i++){
	    	 Complaint complaint=complaints.get(i);
  %>

  <table width="750" height="329" border="0" bgcolor="#FFFFCC">
    <tr>
      <td colspan="4" bgcolor="#FFCCFF"><div align="center" class="STYLE1">投诉</div></td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">编号</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form1" name="cono" method="post" action="">
        <label>
          <input type="text" name="cono" id="cono" value="<%=complaint.getCono()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">用户编号</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form2" name="form1" method="post" action="">
        <label>
        <input type="text" name="uno" id="uno"  value="<%=complaint.getUno()%>" readOnly=true/>
        </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">用户姓名</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form3" name="form1" method="post" action="">
        <label>
        <input type="text" name="name" id="name"value="<%=complaint.getName()%>" readOnly=true/>
        </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">投诉原因</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form4" name="form1" method="post" action="">
        <label>
        <input type="text" name="content" id="content" value="<%=complaint.getContent()%>"/>
        </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFCCFF"><div align="center">投诉时间</div></td>
      <td colspan="3" bgcolor="#FFCCFF"><form id="form5" name="form1" method="post" action="">
        <label></label>
        <input type="text" name="time" id="time"value="<%=complaint.getTime()%>" />
      </td>
    </tr>
    <tr>
      <td><form id="form6" name="form6" method="post"action="servlet/addComplaintservlet?name=lmy">
        <label>
          <input type="submit" name="button" id="button" value="提交" />
          </label>
      </td>
      <td>&nbsp;</td>
      <td><form id="form8" name="form8" method="post" action="servlet/listComplaintservlet?name=lmy">
        <label></label>
        <label></label>
      </td>
      <td><form id="form10" name="form10" method="post" action="">
        <label></label>
      </td>
    </tr>
    <tr>
      <td><form id="form7" name="form7" method="post" action="servlet/updateComplaintservlet?name=lmy">
        <label></label>
        <label></label>
      </td>
      <td><form id="form11" name="form11" method="post" action="">
      </td>
      <td>
        <label></label>
      </td>
      <td>&nbsp;</td>
    </tr>
  </table>
</div>
<%}}%>
</table>
  </form>
</body>
</html>
