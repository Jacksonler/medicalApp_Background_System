<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>myframe.jsp</title>
</head>
<frameset rows="80,*">
        <frame src="top.jsp" name="top" scrolling="no">
        <frameset cols="140,*">
             <frame src="left.jsp" name="left" scrolling="no">
             <frame src="right.jsp" name="right" scrolling="auto">
        </frameset>
    </frameset>
</html>