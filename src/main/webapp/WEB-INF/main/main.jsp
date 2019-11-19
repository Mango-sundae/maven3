<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>主页</title>
</head>

<frameset rows="70,*,24" cols="*" framespacing="0" frameborder="no" border="0">
  <frame src="${pageContext.request.contextPath}/main/top" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" />
  <frameset cols="186,*">
     <frame src="${pageContext.request.contextPath}/main/left" name="leftFrame" id="leftFrame" />
     <frame src="${pageContext.request.contextPath}/main/center" name="mainFrame" id="mainFrame" />
  </frameset>
  
  <frame src="${pageContext.request.contextPath}/main/down" name="bottomFrame" scrolling="no" noresize="noresize" id="bottomFrame" />
</frameset>
<noframes><body>
</body>
</noframes></html>
