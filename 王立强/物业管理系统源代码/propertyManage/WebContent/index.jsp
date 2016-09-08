<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title></title>
</head>
<body>
<style>
.scroll_div {width:600px; height:420px;margin:0 auto; overflow: hidden; white-space: nowrap; background:#ffffff;}
.scroll_div img {width:420px;height:400px;border: 0;margin: auto 8px; border:1px #efefef solid;}
#scroll_begin, #scroll_end, #scroll_begin ul, #scroll_end ul, #scroll_begin ul li, #scroll_end ul li{display:inline;}
</style>
<script language="javascript">
function ScrollImgLeft(){
var speed=20
var scroll_begin = document.getElementById("scroll_begin");
var scroll_end = document.getElementById("scroll_end");
var scroll_div = document.getElementById("scroll_div");
scroll_end.innerHTML=scroll_begin.innerHTML
function Marquee(){
    if(scroll_end.offsetWidth-scroll_div.scrollLeft<=0)
      scroll_div.scrollLeft-=scroll_begin.offsetWidth
    else
      scroll_div.scrollLeft++
}
var MyMar=setInterval(Marquee,speed)
scroll_div.onmouseover=function() {clearInterval(MyMar)}
scroll_div.onmouseout=function() {MyMar=setInterval(Marquee,speed)}
}
</script>
<br>
<h2 align="center">公司图片</h2>
<br>
<br>
<div style="text-align:center">
<div class="sqBorder">
    <!--#####滚动区域#####-->
    <div id="scroll_div" class="scroll_div">
      <div id="scroll_begin">
        <ul>
          <li><a href=""><img  src="psb.jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (2).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (4).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (5).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (6).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (7).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (8).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (9).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (10).jpg" width="400" height="400" /></a></li>
          <li><a href=""><img  src="psb (13).jpg" width="400" height="400" /></a></li>
        </ul>
      </div>
      <div id="scroll_end"></div>
    </div>
    <!--#####滚动区域#####-->
</div>
<script type="text/javascript">ScrollImgLeft();</script>
</div>
<!--//向左滚动代码结束-->
</body></html></td>
	  </tr>
	</table>