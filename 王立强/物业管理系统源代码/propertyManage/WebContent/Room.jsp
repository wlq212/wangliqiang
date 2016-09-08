<%@page import="com.px.bean.Room"%>
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
<form method="post" action="updateRoomServlet">
  <table width="1041" height="393" border="0">
    <%List<Room> rooms = (List<Room>)request.getAttribute("rooms"); %>
  <%
  if(rooms !=null){
	     for(int i=0;i<rooms.size();i++){
	    	Room room=rooms.get(i);
  %>
    <tr>
      <td colspan="7"><div align="center"><span class="STYLE1">房间表</span></div></td>
    </tr>
    <tr>
      <td width="180"><div align="center">房间号</div></td>
      <td width="324"><form id="form1" name="form1" method="post" action="">
        <label>
          <input type="text" name="rno" id="rno" value="<%=room.getRno()%>" readOnly=true/>
          </label>
      </td>
      <td width="182"><div align="center">房间设施</div></td>
      <td width="325"><form id="form2" name="form2" method="post" action="">
        <label>
          <input type="text" name="facility" id="facility" value="<%=room.getFacility()%>"/>
          </label>
      </td>
    </tr>
    <tr>
      <td height="51"><div align="center">面积</div></td>
      <td><form id="form3" name="form3" method="post" action="">
        <label>
          <input type="text" name="area" id="area" value="<%=room.getArea()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">用户编号</div></td>
      <td><form id="form4" name="form4" method="post" action="">
        <label>
          <input type="text" name="uno" id="uno" value="<%=room.getUno()%>" />
          </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">用户名字</div></td>
      <td><form id="form5" name="form5" method="post" action="">
        <label>
          <input type="text" name="name" id="name" value="<%=room.getName()%>" />
          </label>
      </td>
      <td><div align="center">小区编号</div></td>
      <td><form id="form6" name="form6" method="post" action="">
        <label>
          <input type="text" name="vno" id="vno" value="<%=room.getVno()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">小区名字</div></td>
      <td><form id="form7" name="form7" method="post" action="">
        <label>
          <input type="text" name="namee" id="namee" value="<%=room.getNamee()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">楼栋号</div></td>
      <td><form id="form8" name="form8" method="post" action="">
        <label>
          <input type="text" name="bno" id="bno" value="<%=room.getBno()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td height="37"><div align="center">楼栋名</div></td>
      <td><form id="form9" name="form9" method="post" action="">
        <label>
          <input type="text" name="nname" id="nname" value="<%=room.getNname()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">是否在入住</div></td>
      <td><form id="form10" name="form10" method="post" action="">
        <label>
          <input type="text" name="live" id="live" value="<%=room.getLive()%>" readOnly=true/>
          </label>
      </td>
    </tr>
  </table>
  <table width="1042" border="0">
    <tr>
      <td><label>
        <div align="center">
          <input type="submit" value="提交" />
        </div>
      </label>
        <div align="center">&nbsp;</div></td>
    </tr>
    <%}}%>
  </table>
  </form>
</div>
</body>
</html>

