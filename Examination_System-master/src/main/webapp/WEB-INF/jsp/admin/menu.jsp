<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked" id="nav">
        <li><a href="/admin/showCourse">课程管理<span class="badge pull-right">${countCourse}</span></a></li>
        <li><a href="/admin/showStudent">学生管理<span class="badge pull-right">${countStudent}</span></a></li>
        <li><a href="/admin/showTeacher">教师管理<span class="badge pull-right">${countTeacher}</span></a></li>
        <li><a href="/admin/userPasswordRset">账号密码重置<sapn class="glyphicon glyphicon-repeat pull-right" /></a></li>
        <li><a href="/admin/passwordRset">修改密码<sapn class="glyphicon glyphicon-pencil pull-right" /></a></li>
        <li class="disabled"><a href="##">Responsive</a></li>
    </ul>
</div>