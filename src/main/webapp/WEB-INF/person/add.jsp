<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>无标题文档</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE4 {
	font-size: 12px;
	color: #1F4A65;
	font-weight: bold;
}

a:link {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;

}
a:visited {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;
}
a:hover {
	font-size: 12px;
	color: #FF0000;
	text-decoration: underline;
}
a:active {
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.STYLE7 {font-size: 12}

-->
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/My97DatePicker/WdatePicker.js"></script>
<script>
var  highlightcolor='#eafcd5';
//此处clickcolor只能用win系统颜色代码才能成功,如果用#xxxxxx的代码就不行,还没搞清楚为什么:(
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}

function  clickto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=clickcolor&&source.id!="nc")
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=clickcolor;
}
else
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>
<script>
	function addDataOfPerson() {
		$.ajax({
			url:"${pageContext.request.contextPath}/addDataOfPerson",
			type:"post",
			data:$("#personForm").serialize(),
			dataType:"json",
			cache:false,
			success:function(data){
				if (data.status==200) {
					alert(data.msg);
					window.location="${pageContext.request.contextPath}/show"
				}
				alert(data.msg);
				$("#personForm")[0].reset();
			}
		})
	}
</script>
</head>

<body>
<table width="100%" border="0"  bgcolor="#E7FAD0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15" height="30"><img src="images/tab_03.gif" width="15" height="30" /></td>
        <td width="1101" background="images/tab_05.gif"><img src="images/311.gif" width="16" height="16" /> <span class="STYLE4">添加人员</span></td>
        <td width="281" background="images/tab_05.gif"><table border="0" align="right" cellpadding="0" cellspacing="0">
            
        </table></td>
        <td width="14"><img src="images/tab_07.gif" width="14" height="30" /></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td>
	    <form id="personForm" action="${pageContext.request.contextPath}/addPerson" method="post">
			 <table align="center">
				<tr>
					<td align="right">姓名:</td>
					<td><input type="text" name="pName"/></td>
				</tr>
				<tr>
					<td align="right">性别:</td>
					<td>
					   <input type="radio" name="pGender" value="男" checked/>男
					   <input type="radio" name="pGender" value="女"/>女
					</td>
				</tr>
				<tr>
					<td align="right">年龄:</td>
					<td><input type="text" name="pAge"/></td>
				</tr>
				<tr>
					<td align="right">出生日期:</td>
					<td>
					   <input type="text" name="pBirthday" id="pBirthday"  onfocus="WdatePicker({el:'pBirthday'})" readonly="readonly"/>
					   
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="button" value="注册" onclick="addDataOfPerson();"/></td>
				</tr>
			 </table>
		 </form>
	</td>
  </tr>
</table>
</body>
</html>
    