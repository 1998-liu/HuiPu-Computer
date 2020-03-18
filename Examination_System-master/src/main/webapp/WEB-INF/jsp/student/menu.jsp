<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="col-md-2">
    <ul class="nav nav-pills nav-stacked" id="nav">
        <li><a href="/student/showCourse" >所有课程<span class="badge pull-right">${countAllCourse}</span></a></li>
        <li><a href="/student/selectedCourse">已选课程<span class="badge pull-right">${countSelectedCourse}</span></a></li>
        <li><a href="/student/overCourse">已修课程<span class="badge pull-right">${countOverCourse}</span></a></li>
        <li><a href="/student/passwordRset">修改密码<sapn class="glyphicon glyphicon-pencil pull-right" /></a></li>
        <li class="disabled"><a href="##">Responsive</a></li>
    </ul>
</div>