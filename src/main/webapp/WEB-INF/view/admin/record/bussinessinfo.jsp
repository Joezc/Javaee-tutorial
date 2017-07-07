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
                                    <th>案件流水号</th>
                                    <th>用户名</th>
                                    <th>裁量编号</th>
                                    <th>案件标题</th>
                                    <th>当事人</th>
                                    <th>案件来源</th>
                                    <th>案件承办人</th>
                                    <th>立案时间</th>
                                    <th>案情描述</th>
                                    <th>处罚依据</th>
                                    <th>立案附件上传</th>
                                    <th>案件类型</th>
                                    <th>部门编号</th>
                                    <th>当前状态</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="record" items="${bussinessList}">
                                    <tr>
                                        <td>${record.casenumber}</td>
                                        <td>${record.userid}</td>
                                        <td>${record.cutnumber}</td>
                                        <td>${record.casetitle}</td>
                                        <td>${record.parties}</td>
                                        <td>${record.casesource}</td>
                                        <td>${record.casename}</td>
                                        <td>${record.recordtime}</td>
                                        <td>${record.crimereports}</td>
                                        <td>${record.according}</td>
                                        <td>${record.fileupload}</td>
                                        <td>${record.casemold}</td>
                                        <td>${record.dpno}</td>
                                        <td>${record.currentstauis}</td>
                                        <td>
                                            <!-- 这里没改 -->
                                            <a href="${pageContext.request.contextPath}/buss.do/buss_update.view?casenumber=${record.casenumber}">修改</a>
                                        </td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/buss.do/delete?casenumber=${record.casenumber}"
                                               onclick="return confirm('是否要删除该案件信息')">删除</a>
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

