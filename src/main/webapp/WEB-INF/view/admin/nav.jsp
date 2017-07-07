<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>网上政务大厅行政处罚系统</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/bower_components/bootstrap/dist/css/bootstrap.min.css"
          rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="${pageContext.request.contextPath}/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css"
          rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="${pageContext.request.contextPath}/bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- custom CSS -->
    <link href="${pageContext.request.contextPath}/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- custom Fonts -->
    <link href="${pageContext.request.contextPath}/bower_components/font-awesome/css/font-awesome.min.css"
          rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you util the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">网上政务大厅行政处罚系统</a>
        </div>
        <!-- /.navbar-header -->

        <ul class="nav navbar-top-links navbar-right">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="${pageContext.request.contextPath}/account.do/profile.view"><i
                            class="fa fa-user fa-fw"></i> 用户设置</a>
                    </li>

                    <li class="divider"></li>
                    <li><a href="${pageContext.request.contextPath}/logout"><i
                            class="fa fa-sign-out fa-fw"></i> 退出</a>
                    </li>
                </ul>
                <!-- /.dropdown-user -->
            </li>
            <!-- /.dropdown -->
        </ul>
        <!-- /.navbar-top-links -->

        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">

                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> 案件立案管理 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">

                            <li>
                                <a href="${pageContext.request.contextPath}/record.do/record.view"> 我的立案</a>
                                <!--  连接到admin/recordinfo.jsp -->
                            </li>

                            <li>
                                <a href="#"> 我的立案管理 <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/record.do/record.view">个人立案</a>
                                        <!--  连接到admin/recordinfo.jsp -->
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/record.do/record.view">企业立案</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/record.do/record_search.view">查询案件</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/record.do/record_update.view">修改案件</a>
                                    </li>
                                </ul>
                            </li>

                            <li>
                                <a href="#">调查取证管理<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                </ul>
                            </li>

                            <li>
                                <a href="#">案件审查管理<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>

                            <li>
                                <a href="#">告知决定管理<span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>

                            <li>
                                <a href="#"> 案件送达管理 <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> 案件处理管理 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">

                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i> 案件执行管理 <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>

                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i> 案件存档管理 <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>

                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i> 案件听证管理 <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>


                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i> 复议诉讼管理 <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>

                            <li>
                                <a href="#"><i class="fa fa-wrench fa-fw"></i> 结束案件查询 <span class="fa arrow"></span></a>
                                <ul class="nav nav-third-level">
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss.view">业务管理</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_add.view">新增业务</a>
                                    </li>
                                    <li>
                                        <a href="${pageContext.request.contextPath}/buss.do/buss_update.view">修改业务</a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </li>

                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> 处罚库管理 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <%--  <a href="${pageContext.request.contextPath}/role.do/role.view"><i class="fa fa-book fa-fw"></i>
                                 处罚库管理</a> --%>

                            <li>
                                <a href="${pageContext.request.contextPath}/punish.do/punish.view"> 处罚库查询</a>
                                <!--  连接到admin/punishment.jsp -->
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/punish.do/punish_add.view"> 添加自由裁量</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/punish.do/punish_update.view"> 修改自由裁量</a>
                            </li>
                        </ul>
                    </li>


                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> 系统管理 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <%--  <a href="${pageContext.request.contextPath}/role.do/role.view"><i class="fa fa-book fa-fw"></i>
                                 处罚库管理</a> --%>
                            <li>
                                <a href="${pageContext.request.contextPath}/usermanage.do/usermanage.view">用户管理</a>
                                <%--<a href="#"><i class="fa fa-wrench fa-fw"></i> 用户管理 <span class="fa arrow"></span></a>--%>
                                <%--<ul class="nav nav-third-level">--%>
                                    <%--<li>--%>
                                        <%--<a href="${pageContext.request.contextPath}/usermanage.do/usermanage.view">用户信息维护</a>--%>
                                    <%--</li>--%>
                                    <%--<li>--%>
                                        <%--<a href="${pageContext.request.contextPath}/usermanage.do/usersetrole.view">用户设置角色</a>--%>
                                    <%--</li>--%>
                                <%--</ul>--%>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/role.do/role.view">角色管理</a>
                            </li>
                            <%--<li>--%>
                                <%--<a href="${pageContext.request.contextPath}/rolemanage.do/permission.view"> 权限管理</a>--%>
                                <%--<!--  连接到admin/permission.jsp -->--%>
                            <%--</li>--%>
                            <%--<li>--%>
                                <%--<a href="#"><i class="fa fa-wrench fa-fw"></i> 行政级别管理 <span class="fa arrow"></span></a>--%>
                                <%--<ul class="nav nav-third-level">--%>
                                    <%--<li>--%>
                                        <%--<a href="${pageContext.request.contextPath}/xzlevel.do/xzlevel.view">级别维护</a>--%>
                                    <%--</li>--%>
                                    <%--<li>--%>
                                        <%--<a href="${pageContext.request.contextPath}/xzlevel.do/leveldetail.view">级别查询</a>--%>
                                    <%--</li>--%>
                                <%--</ul>--%>
                            <%--</li>--%>

                        </ul>
                    </li>

                    <%-- <li>
                        <a href="${pageContext.request.contextPath}/role.do/role.view"><i class="fa fa-book fa-fw"></i>
                            系统管理 </a>
                    </li> --%>
                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> 统计信息 <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <!-- <li>
                                <a href="/"> </a>
                            </li> -->
                            <li>
                                <a href="${pageContext.request.contextPath}/xzlevel.do/tongji.view"> 立案信息统计</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/xzlevel.do/tongji.view"> 案件审查信息统计</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/xzlevel.do/tongji.view"> 案件送达信息统计</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/xzlevel.do/tongji.view"> 案件执行信息统计</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/xzlevel.do/tongji.view"> 案件存档信息统计</a>
                            </li>
                        </ul>
                        <!-- /.nav-second-level -->
                    </li>


                    <li>
                        <a href="${pageContext.request.contextPath}/main.do/admin"><i class="fa fa-book fa-fw"></i> 控制面板</a>
                    </li>
                    <%--<li>--%>
                        <%--<a href="${pageContext.request.contextPath}/user.do/user.view"><i class="fa fa-book fa-fw"></i>--%>
                            <%--用户管理</a>--%>
                    <%--</li>--%>
                    <li>
                        <a href="#"><i class="fa fa-wrench fa-fw"></i> 学院管理<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="/"> 整体概况</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/dept.do/dept.view"> 系部设置</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/spec.do/spec.view"> 专业设置</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/clazz.do/clazz.view"> 班级管理</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/course.do/course.view"> 添加课程</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/section.do/section.view"> 课程安排</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/student.do/student.view"> 学生管理</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/orderbook.do/orderbook_review.view/">
                                    秘书审核</a>
                            </li>

                        </ul>
                        <!-- /.nav-second-level -->
                    </li>

                </ul>
            </div>
            <!-- /.sidebar-collapse -->
        </div>
        <!-- /.navbar-static-side -->
    </nav>
</div>