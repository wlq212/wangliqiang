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
	left:132px;
	top:25px;
	width:867px;
	height:1686px;
	z-index:1;
}
.STYLE1 {font-size: 40px}
#apDiv2 {
	position:absolute;
	width:800px;
	height:50px;
	z-index:1;
}
-->
</style>
<script type="text/javascript">
  function check(){
	  
	  var rno = document.getElementById("rno").value;
	  var facility = document.getElementById("facility").value;
	  var area = document.getElementById("area").value;
	  var uno = document.getElementById("uno").value;
	  var nname = document.getElementById("nname").value;
	  var vno = document.getElementById("vno").value;
	  var name = document.getElementById("name").value;
	  var bno = document.getElementById("bno").value;
	  var namee = document.getElementById("namee").value;
	  var live = document.getElementById("live").value;
	  if(rno == null || rno == "" ){
		  //alert("用户名不能为空！");
		  alert("房间号不能为空");
		  return false;
	  }else
	  if(facility == null || facility == "" ){
		  //alert("用户名不能为空！");
		  alert("房间设施不能为空");
		  return false;
	  }else
	  if(area == null || area == "" ){
		  //alert("用户名不能为空！");
		  alert("房间面积不能为空");
		  return false;
	  }else
	  if(uno == null || uno == "" ){
		  //alert("用户名不能为空！");
		  alert("用户编号不能为空");
		  return false;
	  }else
	  if(nname == null || nname == "" ){
		  //alert("用户名不能为空！");
		  alert("名字不能为空");
		  return false;
	  }else
	  if(vno == null || vno == "" ){
		  //alert("用户名不能为空！");
		  alert("小区编号不能为空");
		  return false;
	  }else
		  if(name == null || name == "" ){
			  //alert("用户名不能为空！");
			  alert("小区名不能为空");
			  return false;
		  }else
			  if(bno == null || bno == "" ){
				  //alert("用户名不能为空！");
				  alert("楼栋编号不能为空");
				  return false;
			  }else
				  if(namee == null || namee == "" ){
					  //alert("用户名不能为空！");
					  alert("楼栋名不能为空");
					  return false;
				  }else
					  if(live == null || live == "" ){
						  //alert("用户名不能为空！");
						  alert("是否入住不能为空");
						  return false;
					  }
	  return true;
  }
</script>
</head>

<body>
<div id="apDiv1">
<form id="form6" name="form6" method="post" action="addRoomServlet" onsubmit="return check()">
  <table width="866" border="0">
  <%String error = (String)request.getAttribute("error"); %>
    <tr>
      <td colspan="3"><div align="center"><span class="STYLE1">房间信息</span></div></td>
    </tr>
    <tr>
      <td width="196"><div align="center">房间设施</div></td>
      <td colspan="2"><form id="form1" name="form1" method="post" action="">
        <label>
          <div align="center">
            <input type="text" name="facility" id="facility" />
          </div>
        </label>
      </td>
    </tr>
    <tr>
      <td><div align="center">房间号</div></td>
      <td colspan="2"><div align="center">
        <input type="text" name="rno" id="rno" />
      </div></td>
    </tr>
    <tr>
      <td><div align="center">房间面积</div></td>
      <td colspan="2"><div align="center">
        <input type="text" name="area" id="area" />
      </div></td>
    </tr>
    <tr>
      <td><div align="center">小区编号</div></td>
      <td colspan="2"><div align="center">
        <input type="text" name="vno" id="vno" />
      </div></td>
    </tr>
    <tr>
      <td><div align="center">小区名</div></td>
      <td colspan="2"><div align="center">
        <input type="text" name="name" id="name" />
      </div></td>
    </tr>
    <tr>
      <td><div align="center">楼层编号</div></td>
      <td colspan="2"><div align="center">
        <input type="text" name="bno" id="bno" />
      </div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">楼层名</div></td>
      <td width="657"><div align="center">
        <input type="text" name="namee" id="namee" />
      </div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">用户编号</div></td>
      <td><div align="center">
        <input type="text" name="uno" id="uno" />
      </div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">名字</div></td>
      <td><div align="center">
        <input type="text" name="nname" id="nname" />
      </div></td>
    </tr>
    <tr>
      <td colspan="2"><div align="center">是否入住</div></td>
      <td><form id="form2" name="form2" method="post" action="">
        <label>
          <div align="center">
            <input type="text" name="live" id="live"  />
            </div>
        </label>
        <label>
        <div align="center"></div>
        </label>
        <div align="center"></div>
         </td>
    </tr>
      <tr>
        <td width="111">
          <label>
            <input type="submit" name="button4" id="button4" value="提交" />
            </label>
        </td>
      </tr>
      <tr>
      <td><font color="red" size="2" id="error">${error}</font></td>
      </tr>
    </table>
            </form>
    <form name="form9" method="post" action="">
      <label></label>
    </form>
  </div>
</body>
</html>
