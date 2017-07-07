<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/view/admin/nav.jsp"></jsp:include>
<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header">立案信息统计查询</h1>
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
                        <form class="form-inline"  action="${pageContext.request.contextPath}/xzlevel.do/search" method="get">
                            <div class="form-group">
                                <label>案件开始时间</label>
                                <input class="form-control" name="starttime">
                            </div>
                            <div class="form-group">
                                <label>案件结束时间</label>
                                <input class="form-control" name="endtime">
                            </div>
                            <div class="form-group">
                                <label>办理部门</label>
                                <input class="form-control" name="dpname">
                            </div>
                            <button type="submit" class="btn btn-default">提交</button>
                        </form>

                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>开始时间</th>
                                    <th>结束时间</th>
                                    <th>办理单位</th>
                                    <th>办案总数</th>
                                    <th>办结总数</th>
                                    <th>百分比</th>
                                </tr>
                                </thead>
                                <tbody>
                                <%--<c:forEach var="user" items="${UsermanageList}">--%>
                                    <%--<tr>--%>
                                        <%--<td>${user.userid}</td>--%>
                                        <%--<td>${user.roleid}</td>--%>
                                        <%--<td>${user.dpno}</td>--%>
                                        <%--<td>${user.levelno}</td>--%>
                                        <%--<td>${user.password}</td>--%>
                                        <%--<td>${user.cpassword}</td>--%>
                                    <%--</tr>--%>
                                <%--</c:forEach>--%>
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

