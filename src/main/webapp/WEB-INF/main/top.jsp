<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<style>
   *{padding 0px;margin 0px;}
   a{font-size:12px;text-decoration: none;}
</style>

</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed;">
  <tr>
    <td height="9" style="line-height:9px; background-image:url(${pageContext.request.contextPath}/images/main_04.gif)"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="97" height="9" background="${pageContext.request.contextPath}/images/main_01.gif">&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="47" background="${pageContext.request.contextPath}/images/main_09.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="38" height="47" background="${pageContext.request.contextPath}/images/main_06.gif">&nbsp;</td>
        <td width="59"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="29" background="${pageContext.request.contextPath}/images/main_07.gif">&nbsp;</td>
          </tr>
          <tr>
            <td height="18" background="${pageContext.request.contextPath}/images/main_14.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed;">
              <tr>
                <td  style="width:1px;">&nbsp;</td>
                <td ><span class="STYLE1">${sessionScope.activeUser.username}</span></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="155" background="${pageContext.request.contextPath}/images/main_08.gif">&nbsp;</td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="23" valign="bottom"><a href="">个人信息</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/exitSystem">退出系统</a></td>
          </tr>
        </table></td>
        <td width="200" background="${pageContext.request.contextPath}/images/main_11.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="11%" height="23">&nbsp;</td>
            <td width="89%" valign="bottom"><span class="STYLE1" style="font-size:12px;">日期：2008年7月22日 星期二</span></td>
          </tr>
        </table></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="5" style="line-height:5px; background-image:url(${pageContext.request.contextPath}/images/main_18.gif)"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="180" background="${pageContext.request.contextPath}/images/main_16.gif"  style="line-height:5px;">&nbsp;</td>
        <td>&nbsp;</td>
      </tr>
    </table></td>
  </tr>
</table>

<map name="Map" id="Map"><area shape="rect" coords="3,1,49,22" href="#" /><area shape="rect" coords="52,2,95,21" href="#" /><area shape="rect" coords="102,2,144,21" href="#" /><area shape="rect" coords="150,1,197,22" href="#" /><area shape="rect" coords="210,2,304,20" href="#" /><area shape="rect" coords="314,1,361,23" href="#" /></map></body>
</html>
