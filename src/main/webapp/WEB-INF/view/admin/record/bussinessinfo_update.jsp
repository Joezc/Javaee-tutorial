<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/view/admin/nav.jsp"></jsp:include>

<!-- Page Content -->
<div id="page-wrapper">
    <div class="container-fluid">
        <div>
            <h1 class="page-header">案件信息修改</h1>
        </div>
        <div class="panel-heading">
        </div>
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        案件信息
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <form action="${pageContext.request.contextPath}/buss.do/update" method="get">
                                <%-- <label>部门</label>
                                <select onchange="test(this)" class="form-control" name="Dpname">
                                    <option>-请选择-</option>
                                    <c:forEach var="dpname" items="${dpnameList}">
                                        <option>${dpname}</option>
                                    </c:forEach>
                                </select>
                                --%>
                                <label>案件流水号</label>
                                <input class="form-control" name="casenumber" value="${bussiness.casenumber}" readonly>
                                <label>用户名</label>
                                <input class="form-control" name="userid" value="${bussiness.userid}">
                                <label>裁量编号</label>
                                <input class="form-control" name="cutnumber" value="${bussiness.cutnumber}">
                                <label>案件标题</label>
                                <input class="form-control" name="casetitle" value="${bussiness.casetitle}">
                                <label>当事人</label>
                                <input class="form-control" name="parties" value="${bussiness.parties}">
                                <label>案件来源</label>
                                <input class="form-control" name="casesource" value="${bussiness.casesource}">
                                <label>案件承办人</label>
                                <input class="form-control" name="casename" value="${bussiness.casename}">
                                <label>立案时间</label>
                                <input class="form-control" name="recordtime" value="${bussiness.recordtime}">
                                <label>案情描述</label>
                                <input class="form-control" name="crimereports" value="${bussiness.crimereports}">
                                <label>处罚依据</label>
                                <input class="form-control" name="according" value="${bussiness.according}">
                                <label>立案附件上传</label>
                                <input class="form-control" name="fileupload" value="${bussiness.fileupload}">
                                <label>案件类型</label>
                                <input class="form-control" name="casemold" value="${bussiness.casemold}">
                                <label>部门编号</label>
                                <input class="form-control" name="dpno" value="${bussiness.dpno}">
                                <label>当前状态</label>
                                <input class="form-control" name="currentstauis" value="${bussiness.currentstauis}">
                                <!-- <input class="form-control" name="state"> -->
                                <%-- <label>目前状态</label>
                                <select class="form-control" name="year">
                                    <c:forEach var="term" items="${stateList}">
                                        <option value="${state.val}">${state.text}</option>
                                    </c:forEach>
                                </select> --%>
                                <%--<select class="form-control" name="departmentName">--%>
                                <%--<c:forEach var="speciality" items="${speclities}">--%>
                                <%--<option>${speciality}</option>--%>
                                <%--</c:forEach>--%>
                                <%--</select>--%>
                                <label></label>
                                <button type="submit"
                                        class="btn btn-primary form-control">更新
                                </button>
                            </form>
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
<script>


    var deptAndSpec = ${deptAndSpecJson}

        function setSpec(dept) {
            setSelectOption('spec', deptAndSpec[dept], '-请选择-');
        }

    /*
     * 说明：将传入的选项值加入到指定的下拉列表中
     * @param {String || Object]} selectObj 目标下拉选框的名称或对象，必须
     */
    function removeOptions(selectObj) {
        if (typeof selectObj != 'object') {
            selectObj = document.getElementById(selectObj);
        }

        // 原有选项计数
        var len = selectObj.options.length;

        for (var i = 0; i < len; i++) {
            // 移除当前选项
            selectObj.options[0] = null;
        }
    }

    /*
     * 说明：设置传入的选项值到指定的下拉列表中
     *
     * @param {String || Object]} selectObj 目标下拉选框的名称或对象，必须
     * @param {Array} optionList 选项值设置 格式：[{txt:'北京', val:'010'}, {txt:'上海', val:'020'}] ，必须
     * @param {String} firstOption 第一个选项值，如：“请选择”，可选，值为空
     * @param {String} selected 默认选中值，可选
     */
    function setSelectOption(selectObj, optionList, firstOption, selected) {
        if (typeof selectObj != 'object') {
            selectObj = document.getElementById(selectObj);
        }

        // 清空选项
        removeOptions(selectObj);

        // 选项计数
        var start = 0;

        // 如果需要添加第一个选项
        if (firstOption) {
            selectObj.options[0] = new Option(firstOption);

            // 选项计数从 1 开始
            start++;
        }

        var len = optionList.length;

        for (var i = 0; i < len; i++) {
            // 设置 option
            selectObj.options[start] = new Option(optionList[i]);

            // 选中项
            if (selected == optionList[i]) {
                selectObj.options[start].selected = true;
            }

            // 计数加 1
            start++;
        }

    }
    function test(btn) {
        setSpec(btn.options[btn.selectedIndex].text);
    }

</script>
<jsp:include page="/bottom.jsp"></jsp:include>
