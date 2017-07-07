<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/view/admin/nav.jsp"></jsp:include>
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header">立案信息查询</h1>
        </div>
        <div class="panel-heading">
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        立案信息
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>案件流水号</th>
                                    <th>案件标题</th>
                                    <th>当事人</th>
                                    <th>案件类型</th>
                                    <th>接受部门</th>
                                    <th>已完成步骤</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="record" items="${recordList}">
                                    <tr>
                                        <td>${record.casenumber}</td>
                                        <td>${record.casetitle}</td>
                                        <td>${record.parties}</td>
                                        <td>${record.casemold}</td>
                                        <td>${record.dpno}</td>
                                        <td>${record.currentstauis}</td>
                                        <td>
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
                            <%-- <a href="${pageContext.request.contextPath}/record.do/record_add.view" class="btn btn-primary" role="button">添加立案</a>
                            <a href="${pageContext.request.contextPath}/record.do/record_update.view" class="btn btn-primary" role="button">修改立案</a>
                             --%>
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

