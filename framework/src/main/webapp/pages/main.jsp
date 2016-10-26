<%--
  Created by IntelliJ IDEA.
  User: lhh
  Date: 2016/9/24
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="<%=path %>/css/main.css">
</head>

<body>
<div class="main_page">
    <div class="main_top">
        <div class="top_left">
           <img  style="margin-top: 10px" src="<%=path %>/images/2.png" alt="LOG" />
        </div>
        <div class="top_center">
        <div class="top_title">
            		<!--  <span style={font-size:30px;text-color:white}>后台管理系统</span>-->
            	</div>
           		<ul>
                    <li><a id="m_menu_0" href="javascript:void(0)" onclick="changeMenu('ba2bbaa7-2ac7-11e1-9f22-5b2091759898',0)" class="a_select">系统管理</a></li>
                    <li><a id="m_menu_1" href="javascript:void(0)" onclick="changeMenu('de173e65-2aca-11e1-9f22-5b2091759898',1)">内容管理</a></li>
                </ul>
        </div>
        <div class="top_right">
              <input type="button" class="exit" value="注销" onclick="logout()"/>
        </div>
    </div>
    <div class="main_content">
        <div class="main_left">
        </div>
        <div class="main_right">
        
        <div class="info_content" id="info_content">
                   <!--<iframe id="iframeContent" name="iframeContent" width=100% height=580 frameborder=0 scrolling=auto src="<%=path%>/auth/searchAllUser.action"></iframe>  --> 
                </div>
        </div>
    </div>
    <div class="main_footer">
            <span>@版权所有：北京邮电大学</span>
    </div>
</div>
</body>
</html>
