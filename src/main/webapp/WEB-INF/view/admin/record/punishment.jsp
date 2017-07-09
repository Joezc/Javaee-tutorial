<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/view/admin/nav.jsp"></jsp:include>
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header">业务信息管理</h1>
        </div>
        <div class="panel-heading">
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        业务信息
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>事件编号</th>
                                    <th>事件名称</th>
                                    <th>事件类别</th>
                                    <th>办理部门</th>
                                    <th>处罚类别</th>
                                    <th>处罚标准</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="punish" items="${punishList}">
                                    <tr>
                                        <td>${punish.itemid}</td>
                                        <td>${punish.itemname}</td>
                                        <td>${punish.itemcate}</td>
                                        <td>${punish.department}</td>
                                        <td>${punish.punishtype}</td>
                                        <td>${punish.punishstandard}</td>
                                        <td>
                                            <!-- 这里没改 -->
                                            <a href="${pageContext.request.contextPath}/punish.do/punish_update.view?itemid=${punish.itemid}">修改</a>
                                        </td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/punish.do/delete?itemid=${punish.itemid}"
                                               onclick="return confirm('是否要删除该处罚信息')">删除</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>

                            <a href="${pageContext.request.contextPath}/punish.do/punish_add.view"  class="btn btn-primary" role="button"> 添加处罚记录</a>

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

