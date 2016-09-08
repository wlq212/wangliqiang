<%@page import="com.px.bean.Building"%>
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
	left:167px;
	top:20px;
	width:794px;
	height:350px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
#apDiv2 {
	position:absolute;
	width:1px;
	height:1px;
	z-index:1;
}
#apDiv3 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:2;
	left: -200px;
	top: 18px;
}
#apDiv4 {
	position:absolute;
	width:1px;
	height:50px;
	z-index:2;
}
#apDiv5 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:2;
	left: -200px;
	top: 227px;
}
-->
</style>
</head>

<body>
<div id="apDiv1">
<form id="form10" name="form10" method="post" action="updateBuildingServlet">
  <table width="789" border="0">
  <%List<Building> buildings = (List<Building>)request.getAttribute("buildings"); %>
 <%
  if(buildings !=null){
	     for(int i=0;i<buildings.size();i++){
	    	 Building building = buildings.get(i);
  %>
    <tr>
      <td colspan="4"><div align="center"><span class="STYLE1">楼栋</span></div></td>
    </tr>
    
    <tr>
      <td width="144" bgcolor="#CCFF99"><div align="center">编号      </div></td>
      <td width="234" bgcolor="#CCFF99">        <form id="form1" name="form1" method="post" action="">
          <label></label>
          
          <label>
          &nbsp; 
          <div align="center">
            <input type="text" name="bno" id="bno" value="<%=building.getBno()%>" readOnly=true/>
          </div>
          </label>
       </td><td width="120" bgcolor="#CCFF99"><div align="center"></div></td>
      <td width="261" bgcolor="#CCFF99"><div align="center"></div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF99"><div align="center">楼层名称</div></td>
      <td bgcolor="#CCFF99"><form id="form2" name="name" method="post" action="">
        <label></label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="name" id="name" value="<%=building.getName()%>" readOnly=true/>
          </div>
      </td>
      <td bgcolor="#CCFF99"><div align="center">用户编号</div></td>
      <td bgcolor="#CCFF99"><form id="form7" name="form1" method="post" action="">
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="uno" id="uno" value="<%=building.getUno()%>"/>
          </label>
        </div>
    </td>
    </tr>
    <tr>
      <td bgcolor="#CCFF99"><div align="center">楼层类型</div></td>
      <td bgcolor="#CCFF99"><form id="form3" name="form1" method="post" action="">
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="stytle" id="stytle" value="<%=building.getStyle()%>" readOnly=true/>
        </div>
        </label>
      </td>
      <td bgcolor="#CCFF99"><div align="center">宿管姓名</div></td>
      <td bgcolor="#CCFF99"><form id="form8" name="form1" method="post" action="">
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="admini" id="admini" value="<%=building.getAdmini()%>"/>
        </div>
        </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#CCFF99"><div align="center">楼层户数</div></td>
      <td bgcolor="#CCFF99">        <form id="form4" name="form1" method="post" action="">
          <label></label>
          <div align="center">
            <input type="text" name="num" id="num" value="<%=building.getNum()%>"/>
            </div>
        </td><td bgcolor="#CCFF99"><div align="center">楼层高度</div></td>
      <td bgcolor="#CCFF99">        <form id="form9" name="form1" method="post" action="">
          <label>
          <div align="center">
            <input type="text" name="height" id="height" value="<%=building.getHeight()%>" readOnly=true/>
          </div>
          </label>
      </td>
    </tr>
    <tr>
      <td bgcolor="#CCFF99"><div align="center">小区编号</div></td>
      <td bgcolor="#CCFF99"><form id="form5" name="form1" method="post" action="">
        <label></label>
        &nbsp;&nbsp;&nbsp;&nbsp;   &nbsp;  &nbsp;
        <div align="center">
          <input type="text" name="vno" id="vno" value="<%=building.getVno()%>" readOnly=true/>
          </div>
     </td>
      <td bgcolor="#CCFF99">&nbsp;</td>
      <td bgcolor="#CCFF99"><div align="center"></div></td>
    </tr>
    <tr>
      <td height="41" bgcolor="#CCFF99"><div align="center">小区名称</div></td>
      <td bgcolor="#CCFF99"><form id="form6" name="form1" method="post" action="">
        <label>
          
        
        &nbsp;&nbsp;&nbsp;    &nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="namee" id="namee" value="<%=building.getNamee()%>" readOnly=true/>
        </div>
        </label>
            </td>
      <td bgcolor="#CCFF99">&nbsp;</td>
      <td bgcolor="#CCFF99">&nbsp;</td>
    </tr>
  </table>
  <div id="apDiv2">
      <div id="apDiv4">
        <table width="198" border="0">
          <tr>
            <td><label>
              <input type="submit" name="button" id="button" value="提交" action="servlet/listBuildingservlet?name=lmy"/>
            </label></td>
            <td><label></label></td>
            <td><label></label></td>
            <td><label></label></td>
          </tr>
           <%}} %>
        </table>
        <label></label>
        <table width="366" border="0">
          <tr>
            <td width="43"><label></label></td>
            <td width="313"><label></label></td>
          </tr>
        </table>
        <label></label>
        <label>        </label>  
        <label></label>
      </div>
    </form>
  </div>
</div>
</body>
</html>
