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
                                    <th>业务编号</th>
                                    <th>业务开始日期</th>
                                    <th>业务实际结束日期</th>
                                    <th>业务参与人员</th>
                                    <th>过程描述</th>
                                    <th>结果描述</th>
                                    <th>附件</th>
                                    <th>是否结案</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="bussiness" items="${bussinessList}">
                                    <tr>
                                        <td>${bussiness.bunumber}</td>
                                        <td>${bussiness.bustime}</td>
                                        <td>${bussiness.buotime}</td>
                                        <td>${bussiness.bupname}</td>
                                        <td>${bussiness.bupdesc}</td>
                                        <td>${bussiness.buodesc}</td>
                                        <td>${bussiness.bupupload}</td>
                                        <td>${bussiness.casewhether}</td>
                                        <td>
                                        <!-- 这里没改 -->
                                            <a href="${pageContext.request.contextPath}/student.do/student_update.view?studentId=${student.studentId}">修改</a>
                                        </td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/student.do/delete?studentId=${student.studentId}"
                                               onclick="return confirm('是否要删除该学生信息')">删除</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <a href="${pageContext.request.contextPath}/buss.do/buss_add.view" class="btn btn-primary" role="button">添加业务</a>
                            <a href="${pageContext.request.contextPath}/buss.do/buss_update.view" class="btn btn-primary" role="button">修改业务</a>
                            
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

