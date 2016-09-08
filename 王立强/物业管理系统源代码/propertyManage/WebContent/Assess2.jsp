<%@page import="com.px.bean.Assess"%>
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
	left:149px;
	top:5px;
	width:866px;
	height:430px;
	z-index:1;
	background-color: #FFCCFF;
}
.STYLE1 {font-size: 40px}
-->
</style>
</head>

<body>
<div id="apDiv1">
<form id="form10" name="form10" method="post" action="updateAssessServlet">
  <table width="864" height="415" border="0">
  <%List<Assess> assesss = (List<Assess>)request.getAttribute("assesss"); %>
 <%
  if(assesss !=null){
	     for(int i=0;i<assesss.size();i++){
	    	 Assess assess = assesss.get(i);
  %>
    <tr>
      <td colspan="4"><div align="center"><span class="STYLE1">员工考核信息</span></div></td>
    </tr>
    <tr>
      <td width="184" height="61"><div align="center">编号</div></td>
      <td colspan="3"><form id="form1" name="ano" method="post" action="">
        <label>
        <input type="text" name="ano" id="ano" value="<%=assess.getAno()%>" readOnly=true/>
        </label>
      </form>      </td>
    </tr>
    <tr>
      <td><div align="center">考核内容</div></td>
      <td colspan="3"><form id="form2" name="content" method="post" action="">
        <label>
        <input type="text" name="content" id="content" value="<%=assess.getContent()%>" readOnly=true>
        </label>
      </form></td>
    </tr>
    <tr>
      <td><div align="center">考核时间</div></td>
      <td width="225"><form id="form3" name="time" method="post" action="">
        <label>
        <input type="text" name="time" id="time" value="<%=assess.getTime()%>"/ readOnly=true>
        </label>
      </form></td>
      <td width="218"><div align="center">考核编号</div></td>
      <td width="207"><form id="form6" name="sno" method="post" action="">
        <label>
        <input type="text" name="sno" id="sno6" value="<%=assess.getSno()%>" readOnly=true/>
        </label>
      </form></td>
    </tr>
    <tr>
      <td height="119"><div align="center">考官姓名</div></td>
      <td><form id="form4" name="name" method="post" action="">
        <label>
        <input type="text" name="name" id="name" value="<%=assess.getName()%>" readOnly=true/>
        </label>
      </form></td>
      <td><form id="form9" name="form9" method="post" action="">
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label><br>
        </label>
      </form>      </td>
      <td><form id="form7" name="form9" method="post" action="">
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label><br>
        <br>
        </label>
      </form>        <label></label></td>
    </tr>
    <tr>
      <td><div align="center">考核等级</div></td>
      <td><form id="form5" name="rank" method="post" action="">
        <label>
        <input type="text" name="rank" id="rank" value="<%=assess.getRank()%>" readOnly=true/>
        </label>
      </form></td>
      <td>
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label></label>
        <label> <br>
        </label>
      </td>
    </tr>
    <%}} %>
  </table>
      </form>
</div>
</body>
</html>

