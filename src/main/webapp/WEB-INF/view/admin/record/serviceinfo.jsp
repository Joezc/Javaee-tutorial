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
                                    <th>当前业务编号</th>
                                    <th>案件流水号</th>
                                    <th>开始日期</th>
                                    <th>实际结束日期</th>
                                    <th>参与人员</th>
                                    <th>过程描述</th>
                                    <th>结果描述</th>
                                    <th>过程附件上传</th>
                                    <th>是否结案</th>
                                    <th>阶段</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="service" items="${serviceList}">
                                    <tr>
                                        <td>${service.bunumber}</td>
                                        <td>${service.casenumber}</td>
                                        <td>${service.bustime}</td>
                                        <td>${service.buotime}</td>
                                        <td>${service.bupname}</td>
                                        <td>${service.bupdesc}</td>
                                        <td>${service.buodesc}</td>
                                        <td>${service.bupupload}</td>
                                        <td>${service.casewhether}</td>
                                        <td>${type}</td>
                                        <td>
                                            <!-- 这里没改 -->
                                            <a href="${pageContext.request.contextPath}/service.do/service_update.view?bunumber=${service.bunumber}">修改</a>
                                        </td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/service.do/delete?bunumber=${service.bunumber}"
                                               onclick="return confirm('是否要删除该业务信息')">删除</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>

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

