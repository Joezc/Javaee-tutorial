<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/view/admin/nav.jsp"></jsp:include>
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header">用户信息管理</h1>
        </div>
        <div class="panel-heading">
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        用户信息
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>用户名</th>
                                    <th>角色id</th>
                                    <th>部门编号</th>
                                    <th>行政级别编号</th>
                                    <th>密码</th>
                                    <th>电子邮件</th>
                                    <th>联系人</th>
                                    <th>手机号码</th>
                                    <th>座机</th>
                                    <th>身份证号码</th>
                                    <th>真实姓名</th>
                                    <th>通讯地址</th>
                                    <th>市信息管理中心电话</th>
                                    <th>科室</th>
                                    <th>附件备注</th>
                                    <th></th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="user" items="${UsermanageList}">
                                    <tr>
                                        <td>${user.userid}</td>
                                        <td>${user.roleid}</td>
                                        <td>${user.dpno}</td>
                                        <td>${user.levelno}</td>
                                        <td>${user.password}</td>
                                        <td>${user.cpassword}</td>
                                        <td>${user.email}</td>
                                        <td>${user.people}</td>
                                        <td>${user.cellphone}</td>
                                        <td>${user.mobilephone}</td>
                                        <td>${user.idcardno}</td>
                                        <td>${user.usrname}</td>
                                        <td>${user.address}</td>
                                        <td>${user.phone}</td>
                                        <td>${user.department}</td>
                                        <td>${user.beizhu}</td>
                                        <td>
                                            <!-- 这里没改 -->
                                            <a href="${pageContext.request.contextPath}/usermanage.do/user_update.view?userid=${user.userid}">修改</a>
                                            <a href="${pageContext.request.contextPath}/usermanage.do/delete?userid=${user.userid}"
                                               onclick="return confirm('是否要删除该用户信息')">删除</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <a href="${pageContext.request.contextPath}/usermanage.do/user_add.view" class="btn btn-primary" role="button">添加用户</a>
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
    </div>

    <!-- /.container-fluid -->
</div>
</div>
<!-- /#page-wrapper -->
</div>
<!-- /#wrapper -->

<jsp:include page="/bottom.jsp"></jsp:include>

