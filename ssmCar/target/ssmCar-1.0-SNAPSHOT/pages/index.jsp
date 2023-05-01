<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>停车场管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/layui.css" media="all">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/darksnow.css">
</head>
<body>

<div class="main">
    <div class="title">
        <a href="${pageContext.request.contextPath}/pages/index.jsp">
            <li class="layui-nav-item">
                <p>停车场管理系统</p>
            </li>
        </a>
    </div>
    <ul class="layui-nav list_box">
        <!-- style="float: right;margin-right: 100px" -->
        <li class="layui-nav-item">
            <a href="javascript:;" style="font-size: 20px;color: #fff">当前用户：${sessionScope.user.userName}<img
                    src="${pageContext.request.contextPath}/images/darksnow.jpg" class="layui-nav-img">${login.userName}</a>
            <dl class="layui-nav-child">
                <dd><a href="${pageContext.request.contextPath}/pages/login.jspin.jsp">退出登录</a></dd>
            </dl>
        </li>
    </ul>
</div>

<script src="${pageContext.request.contextPath}/pages/layui.jsyui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    layui.use('element', function () {
        var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块

        //监听导航点击
        element.on('nav(demo)', function (elem) {
            //console.log(elem)
            layer.msg(elem.text());
        });
    });
</script>

<div style="height: 619px;background-color: #ecf0f5">
    <div class="list-group" style="padding: 20px 0px 0px 40px;width: 400px;float: left;">
        <button type="button" class="list-group-item list-group-item-action active" disabled>系统菜单</button>
        <button type="button" class="list-group-item list-group-item-action"
                onclick='location.href="${pageContext.request.contextPath}/userManagerFindAll"'>用户管理
        </button>
        <button type="button" class="list-group-item list-group-item-action"
                onclick='location.href="${pageContext.request.contextPath}/typeManagerFindAll"'>车辆类型管理
        </button>
        <button type="button" class="list-group-item list-group-item-action"
                onclick='location.href="${pageContext.request.contextPath}/areamanager/findAll"'>停车区域管理
        </button>
        <button type="button" class="list-group-item list-group-item-action"
                onclick='location.href="${pageContext.request.contextPath}/spacemanager/findAll"'>车位管理
        </button>
        <button type="button" class="list-group-item list-group-item-action"
                onclick='location.href="${pageContext.request.contextPath}/stopmanager/findAll"'>停车管理
        </button>
    </div>


    <div style="float: left;margin: 100px 300px">
        <h1>欢迎使用停车管理系统!</h1>
    </div>
</div>
<div style="height: 70px;padding: 25px 0px">
    <div style="margin: 0px auto;width: 410px;height: 20px;">
        <strong>Copyright &copy; 2019-11-11 <a
                href="${pageContext.request.contextPath}/bakeIndex">停车场管理系统</a>.
        </strong> All rights reserved.
    </div>
</div>

</body>
</html>