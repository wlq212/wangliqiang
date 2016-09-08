<%@page import="com.px.bean.Village"%>
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
	left:156px;
	top:12px;
	width:843px;
	height:914px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
-->
</style>
</head>

<body>
<div id="apDiv1">
<form id="form5" name="form5" method="post" action="updateVillageServlet">
  <table width="835" height="332" border="0">
  <%List<Village> villages = (List<Village>)request.getAttribute("villages"); %>
  <%
  if(villages !=null){
	     for(int i=0;i<villages.size();i++){
	    	 Village village=villages.get(i);
  %>
    <tr>
      <td height="92" colspan="4" bgcolor="#CCFF99"><div align="center"><span class="STYLE1">小区</span></div></td>
    </tr>
    <tr>
      <td width="116" height="34" bgcolor="#CCFF99" ><div align="center">编号</div></td>
      <td width="402" bgcolor="#CCFF99"><form id="form1" name="form1" method="post" action="">
        <label>
        <input type="text" name="vno" id="vno" value="<%=village.getSno()%>" readOnly=true />
        </label>
     </td>
      <td width="125" bgcolor="#CCFF99"><div align="center">小区户数</div></td>
      <td width="162" bgcolor="#CCFF99"><input type="text" name="num" id="num" value="<%=village.getNum()%>" readOnly=true/></td>
    </tr>
    <tr>
      <td height="41" bgcolor="#CCFF99"><div align="center">小区名称</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="name" id="name" value="<%=village.getName()%>" readOnly=true/></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form id="form2" name="form2" method="post" action="servlet/listVillageservlet?name=lmy">
        <label></label>
           </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">&nbsp;</td>
    </tr>
    <tr>
      <td height="44" bgcolor="#CCFF99"><div align="center">小区具体介绍</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="introduce" id="introduce" value="<%=village.getIntroduce()%>"/></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form id="form3" name="form3" method="post" action="servlet/deleteVillageservlet?name=lmy">
        <label></label>
          </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">&nbsp;</td>
    </tr>
    <tr>
      <td height="56" bgcolor="#CCFF99"><div align="center">管理员编号</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="sno" id="sno" value="<%=village.getSno()%>"/></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form id="form4" name="form4" method="post" action="">
        <label></label>
           </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99"><form name="form6" method="post"action="servlet/updateVillageservlet?name=lmy">
        <label></label>
           </td>
    </tr>
    <tr>
      <td height="47" bgcolor="#CCFF99"><div align="center">管理员姓名</div></td>
      <td bgcolor="#CCFF99"><input type="text" name="admini" id="admini" value="<%=village.getAdmini()%>"/></td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">
        
        <label>
          <input type="submit" name="button4" id="button4" value="提交" />
          </label>
          </td>
      <td bordercolor="#FFFFFF" bgcolor="#CCFF99">&nbsp;</td>
    </tr>
    <%}} %>
  </table>
  </form>  
</div>
</body>
</html>