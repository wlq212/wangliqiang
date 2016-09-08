<%@page import="com.px.bean.Train"%>
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
<form method="post" action="updateTrainServlet">
  <table width="1041" height="296" border="0">
  <%List<Train> trains = (List<Train>)request.getAttribute("trains"); %>
  <%
  if(trains !=null){
	     for(int i=0;i<trains.size();i++){
	    	 Train train=trains.get(i);
  %>
    <tr>
      <td colspan="7"><div align="center"><span class="STYLE1">培训表</span></div></td>
    </tr>
    <tr>
      <td width="180" height="59"><div align="center">编号</div></td>
      <td><form id="form1" name="form1" method="post" action="">
          <label>
          <input type="text" name="tno" id="tno" value="<%=train.getTno()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">培训内容</div></td>
      <td><form id="form2" name="form2" method="post" action="">
        <label>
          <input type="text" name="content" id="content" value="<%=train.getContent()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td height="51"><div align="center">培训时间</div></td>
      <td width="324"><form id="content" name="content" method="post" action="">
        <label>
        <input type="text" name="time" id="time" value="<%=train.getTime()%>" readOnly=true/>
        </label>
      </td>
      <td width="182"><div align="center">员工编号</div></td>
      <td width="325"><form id="begintime" name="begintime" method="post" action="">
        <label>
          <input type="text" name="sno" id="sno" value="<%=train.getSno()%>" readOnly=true/>
          </label>
     </td>
    </tr>
    <tr>
      <td><div align="center">姓名</div></td>
      <td><form id="form5" name="form5" method="post" action="">
        <label>
          <input name="time" type="name" id="name" maxlength="100" value="<%=train.getName()%>" readOnly=true/>
          </label>
      </td>
      <td><div align="center">表现情况</div></td>
      <td><form id="form6" name="form6" method="post" action="">
        <label>
          <input type="text" name="behave" id="behave" value="<%=train.getBehave()%>" readOnly=true/>
          </label>
      </td>
    </tr>
    <tr>
      <td colspan="4">      
        <div align="center"></div>        </td>
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
