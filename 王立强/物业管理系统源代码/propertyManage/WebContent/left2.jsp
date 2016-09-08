<%@page import="com.px.bean.Stuff"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>菜单</title>
<meta http-equiv="content-type" content="text/html;charset=gb2312">
<!--把下面代码加到<head>与</head>之间-->
<style type="text/css">
<!--
a{color:#333; text-decoration:none;}
a:hover{color:#FF0033;}
body{font-family:"宋体"; font-size:12px; margin:0; padding:0;}
ul{list-style-type:none; margin:0; padding:0;}
li{margin:0; padding:0;}
.leftmenu{background:#EEF2FB;height:auto;margin:0 auto; width:182px;border:1px solid #73C2FF;}
.lmenub{background:url(http://www.zzsky.cn/effect/images/200912211600/m1.gif)  no-repeat left;height:25px; line-height:25px;color:#4B6486; font-size:14px; font-weight:700;text-align:left; text-indent:19px; cursor:pointer;}
.lmenua{background:url(http://www.zzsky.cn/effect/images/200912211600/m2.gif) no-repeat;17px;height:25px; line-height:25px;color:#4B6486; font-size:14px; font-weight:700;text-align:left; text-indent:19px; cursor:pointer;}
.lmenuc{border-bottom:1px solid #A1B7CE; background:url(http://www.zzsky.cn/effect/images/200912211600/bg.gif) repeat-x left;font-size:12px;height:22px;line-height:22px;cursor:pointer; text-indent:20px; color:#222; font-weight:700;}
.lmenud{font-size:12px;height:22px;line-height:22px;background:#E5F5FF;text-indent:10px;border-top: 1px solid #fff;border-bottom: 1px solid #A9DAFF; font-weight:normal;cursor:pointer; text-indent:20px;}
.pclist{height:200px; overflow-y:scroll; background:#fff; width:164px; padding:5px 2px 5px 17px;}
.pclist li{background:url(http://www.zzsky.cn/effect/images/200912211600/dot.png) no-repeat 0 5px;height:22px; line-height:22px; font-size:12px; padding-left:17px;}
.pclist .active{background:#FFFFCC; height:15px; border:1px solid #CEB70D; padding:1px 3px;}
-->
</style>
<script language="javascript">
var number=2;
function LMYC(obj) {
var lbmc
var treePic
    for (i=1;i<=number;i++) {
        lbmc = document.getElementById('LM' + i);
        treePic = document.getElementById('treePic'+i);
        treePic.className = 'lmenub';
        lbmc.style.display = 'none';
    }
}
function ShowFLT(i) {
    lbmc = document.getElementById('LM' + i);
    treePic = document.getElementById('treePic' + i)
    if (lbmc.style.display == 'none') {
        LMYC();
        treePic.className = 'lmenua';
        lbmc.style.display = '';
    }
    else {
        treePic.className = 'lmenub';
        lbmc.style.display = 'none';
    }
	
}
var n=2;
function LMYCB(obj) {
var lbmcb
var treePicb
    for (i=1;i<=n;i++) {
        lbmcb = document.getElementById('LMb' + i);
        treePicb = document.getElementById('treePicb'+i);
        treePicb.className = 'lmenud';
        lbmcb.style.display = 'none';
    }
}
function ShowFLTb(i) {
    lbmcb = document.getElementById('LMb' + i);
    treePicb = document.getElementById('treePicb' + i)
    if (lbmcb.style.display == 'none') {
        LMYCB();
        treePicb.className = 'lmenuc';
        lbmcb.style.display = '';
    }
    else {
        treePicb.className = 'lmenud';
        lbmcb.style.display = 'none';
    }
	
}
function checkTdBg(obj){
    var obj_td = document.getElementsByTagName('span');
    for( var int_i = 0 ; int_i < obj_td.length ; int_i ++ ){
        if( obj_td[int_i] == obj ){
            obj_td[int_i].className = 'active';
        }
        else{
            obj_td[int_i].className = '';
        }
    }
}
</script>
</head>
<body>
<!--把下面代码加到<body>与</body>之间-->
<div class="leftmenu" style="width: 150px; height:688px ">
	<div class="lmenua" id="treePic1" onClick="javascript:ShowFLT(1)" >
	  <div align="left">房产信息</div>
	</div>
	<div id="LM1">
<div id="LMb1" class="pclist" style="width: 135px; height:70px ">
			<ul>
				<li><span onclick='checkTdBg(this);'><a href="listVillageServlet1" target="I2">小区信息</a></span></li>
				<li><span onclick='checkTdBg(this);'><a href="listBuildingServlet1" target="I2">楼栋信息</a></span></li> 
				<li><span onclick='checkTdBg(this);'><a href="listRoomServlet1" target="I2">房间信息</a></span></li>
		  </ul>
	  </div>
	</div>
    
    <div class="lmenua" id="treePic2" onClick="javascript:ShowFLT(2)">
	  <div align="left">员工信息</div>
	</div>
	<div id="LM2">
<div id="LMb2" class="pclist" style="width: 135px; height:130px ">
  <ul><li><span onclick='checkTdBg(this);'><a href="selectStuffServlet2?sname=${stuff.getSname()}" target="I2">基本信息</a></span></li> 
	    <li><span onclick='checkTdBg(this);'><a href="selectContractServlet2?sname=${stuff.getSname()}" target="I2">合同信息</a></span></li>
          <li><span onclick='checkTdBg(this);'><a href="selectAssessServlet2?sname=${stuff.getSname()}" target="I2">岗位考核</a></span></li>
          <li><span onclick='checkTdBg(this);'><a href="selectTrainServlet2?sname=${stuff.getSname()}" target="I2">在职培训</a></span></li>
          <li><span onclick='checkTdBg(this);'><a href="selectLeaveServlet2?sname=${stuff.getSname()}" target="I2">离职信息</a></span></li>
		  </ul>
	  </div>
	</div>    

    
</div>
</body>
</html>