<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java"
         isELIgnored="false" %>
<%--<jsp:forward page="/emps" ></jsp:forward>--%>
<!DOCTYPE html>
<html lang="en">

<head>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap Login Form Template</title>

    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.css">
    <link rel="stylesheet" href="${APP_PATH }/static/css/font-awesome.min.css">
    <link rel="stylesheet" href="${APP_PATH }/static/css/form-elements.css">
    <link rel="stylesheet" href="${APP_PATH }/static/css/style.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="${APP_PATH }/static/ico/favicon.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="${APP_PATH }/static/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="${APP_PATH }/static/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="${APP_PATH }/static/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="${APP_PATH }/static/ico/apple-touch-icon-57-precomposed.png">

</head>

<body>

<!-- Top content -->
<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text">
                    <h1><strong>Bootstrap</strong> Login Form</h1>
                    <div class="description">
                        <p>
                            This is a free responsive login form made with Bootstrap.
                            Download it on <a href="http://azmind.com"><strong>AZMIND</strong></a>, customize and use it as you like!
                        </p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3 form-box">
                    <div class="form-top">
                        <div class="form-top-left">
                            <h3>Login to our site</h3>
                            <p>Enter your username and password to log on:</p>
                        </div>
                        <div class="form-top-right">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>
                    <div class="form-bottom">
                        <form role="form" action="" method="post" class="login-form">
                            <div class="form-group">
                                <label class="sr-only" for="admin-name">Username</label>
                                <input type="text" name="admin-name" placeholder="Username..." class="form-username form-control" id="admin-name">
                            </div>
                            <div class="form-group">
                                <label class="sr-only" for="admin-password">Password</label>
                                <input type="password" name="admin-password" placeholder="Password..." class="form-password form-control" id="admin-password">
                            </div>
                            <button type="button" class="btn" id="login-btn">Sign in!</button>
                        </form>
                    </div>
                </div>
            </div>
            <%--<div class="row">--%>
                <%--<div class="col-sm-6 col-sm-offset-3 social-login">--%>
                    <%--<h3>...or login with:</h3>--%>
                    <%--<div class="social-login-buttons">--%>
                        <%--<a class="btn btn-link-1 btn-link-1-facebook" href="#">--%>
                            <%--<i class="fa fa-facebook"></i> Facebook--%>
                        <%--</a>--%>
                        <%--<a class="btn btn-link-1 btn-link-1-twitter" href="#">--%>
                            <%--<i class="fa fa-twitter"></i> Twitter--%>
                        <%--</a>--%>
                        <%--<a class="btn btn-link-1 btn-link-1-google-plus" href="#">--%>
                            <%--<i class="fa fa-google-plus"></i> Google Plus--%>
                        <%--</a>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        </div>
    </div>

</div>


    <!-- Javascript -->
    <script src="${APP_PATH }/static/js/jquery-3.2.1.min.js"></script>
    <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
    <script src="${APP_PATH }/static/js/jquery.backstretch.js"></script>
    <script src="${APP_PATH }/static/js/scripts.js"></script>

    <!--[if lt IE 10]>
    <script src="${APP_PATH }/static/js/placeholder.js"></script>
    <[endif]-->
<script>
    $("#login-btn").click(function () {
        //用户验证
        var admName = $("#admin-name").val();
        var admPwd = $("#admin-password").val();
        $.ajax({
            url:"${APP_PATH }/admincheck",
            data:{admName:admName,admPwd:admPwd},
            type:"POST",
            success:function(result){
                if(result.code==100){
                    $(location).prop('href', "${APP_PATH }/views/msg.jsp");
                }else {
                    alert("用户名或密码错误");
                }
            }
        });
    });


</script>

</body>

</html>