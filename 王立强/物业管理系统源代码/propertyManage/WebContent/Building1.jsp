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
<script type="text/javascript">
  function check(){
	  
	  var bno = document.getElementById("bno").value;
	  var name = document.getElementById("name").value;
	  var style = document.getElementById("style").value;
	  var height = document.getElementById("height").value;
	  var uno = document.getElementById("uno").value;
	  var admini = document.getElementById("admini").value;
	  var num = document.getElementById("num").value;
	  var vno = document.getElementById("vno").value;
	  var namee = document.getElementById("namee").value;
	  
	  if(bno == null || bno == "" ){
		  //alert("用户名不能为空！");
		  alert("楼栋编号不能为空");
		  return false;
	  }else
	  if(name == null || name == "" ){
		  //alert("用户名不能为空！");
		  alert("楼栋名不能为空");
		  return false;
	  }else
	  if(style == null || style == "" ){
		  //alert("用户名不能为空！");
		  alert("楼栋类型不能为空");
		  return false;
	  }else
	  if(height == null || height == "" ){
		  //alert("用户名不能为空！");
		  alert("楼栋高度不能为空");
		  return false;
	  }else
	  if(uno == null || uno == "" ){
		  //alert("用户名不能为空！");
		  alert("楼栋长编号不能为空");
		  return false;
	  }else
	  if(admini == null || admini == "" ){
		  //alert("用户名不能为空！");
		  alert("姓名不能为空");
		  return false;
	  }else
		  if(num == null || num == "" ){
			  //alert("用户名不能为空！");
			  alert("户数不能为空");
			  return false;
	  }else
		  if(vno == null || vno == "" ){
		     //alert("用户名不能为空！");
				  alert("小区编号不能为空");
				  return false;
			  }else
				  if(namee == null || namee == "" ){
					  //alert("用户名不能为空！");
					  alert("小区名字不能为空");
					  return false;
				  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form id="form10" name="form10" method="post" action="addBuildingServlet" onsubmit="return check()">
  <table width="789" border="0">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="4"><div align="center"><span class="STYLE1">楼栋</span></div></td>
    </tr>
    
    <tr>
      <td width="144" bgcolor="#CCFF99"><div align="center">楼栋编号      </div></td>
      <td width="234" bgcolor="#CCFF99">        <form id="form1" name="form1" method="post" action="">
          <label></label>
          
          <label>
          &nbsp; 
          <div align="center">
            <input type="text" name="bno" id="bno" />
          </div>
          </label>
        </td><td width="120" bgcolor="#CCFF99"><div align="center"></div></td>
      <td width="261" bgcolor="#CCFF99"><div align="center"></div></td>
    </tr>
    <tr>
      <td bgcolor="#CCFF99"><div align="center">楼层名</div></td>
      <td bgcolor="#CCFF99"><form id="form2" name="name" method="post" action="">
        <label></label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="name" id="name" />
          </div>
      </td>
      <td bgcolor="#CCFF99"><div align="center">楼栋长编号</div></td>
      <td bgcolor="#CCFF99"><form id="form7" name="form1" method="post" action="">
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="uno" id="uno" />
          </label>
        </div>
      </td>
    </tr>
    <tr>
      <td bgcolor="#CCFF99"><div align="center">楼栋类型</div></td>
      <td bgcolor="#CCFF99"><form id="form3" name="form1" method="post" action="">
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="style" id="style" />
        </div>
        </label>
      </td>
      <td bgcolor="#CCFF99"><div align="center">姓名</div></td>
      <td bgcolor="#CCFF99"><form id="form8" name="form1" method="post" action="">
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="admini" id="admini" />
        </div>
        </label>
     </td>
    </tr>
    <tr>
      <td bgcolor="#CCFF99"><div align="center">户数</div></td>
      <td bgcolor="#CCFF99">        <form id="form4" name="form1" method="post" action="">
          <label></label>
          <div align="center">
            <input type="text" name="num" id="num" />
            </div>楼栋高度</div></td>
      <td bgcolor="#CCFF99">        <form id="form9" name="form1" method="post" action="">
          <label>
          <div align="center">
            <input type="text" name="height" id="height" />
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
          <input type="text" name="vno" id="vno" />
          </div>
      </td>
      <td bgcolor="#CCFF99">&nbsp;</td>
      <td bgcolor="#CCFF99"><div align="center"></div></td>
    </tr>
    <tr>
      <td height="41" bgcolor="#CCFF99"><div align="center">小区名字</div></td>
      <td bgcolor="#CCFF99"><form id="form6" name="form1" method="post" action="">
        <label>
          
        
        &nbsp;&nbsp;&nbsp;    &nbsp;&nbsp;&nbsp;&nbsp; 
        <div align="center">
          <input type="text" name="namee" id="namee" />
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
            <td><font color="red" size="2" id="error">${error}</font></td>
            <td><label></label></td>
            <td><label></label></td>
            <td><label></label></td>
          </tr>
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
