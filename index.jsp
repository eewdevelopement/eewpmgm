<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>EEW-PRODUCT</title>
        <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
        <!-- Custom Theme Style -->
        <link href="css/custom.css" rel="stylesheet">
    </head>

    <body style="background:#F7F7F7;">
        <div class="">
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>

            <div id="wrapper">
                <div id="login" class=" form">
                    <section class="login_content">
                        <form name="loginfrm" action="./LoginServlet" method="post" >
                             <%                                            if (request.getParameter("flage") != null) {
                                                if (request.getParameter("flage").equals("false")) {
                                        %>
                                        <div><h1>INVALID DEATIL!!!!!!!!</h1></div>
                                         <%                                            }
                                            }
                                        %>
                            <h1>Login Form</h1>
                            <div>
                                <input type="text" autofocus="" class="form-control" placeholder="Username" required="" name="name" />
                            </div>
                            <div>
                                <input type="password" class="form-control" placeholder="Password" required="" name="password" />
                            </div>
                            <div>
                                 <button type="submit" class="btn btn-success">Submit</button>
                                <a class="reset_pass" href="#">Lost your password?</a>
                            </div>
                            <div class="clearfix"></div>
                            
                        </form>
                    </section>
                </div>
<!--                <div id="register" class=" form">
                    <section class="login_content">
                        <form>
                            <h1>Create Account</h1>
                            <div>
                                <input type="text" class="form-control" placeholder="Username" required="" />
                            </div>
                            <div>
                                <input type="email" class="form-control" placeholder="Email" required="" />
                            </div>
                            <div>
                                <input type="password" class="form-control" placeholder="Password" required="" />
                            </div>
                            <div>
                                <a class="btn btn-default submit" href="dashboard.jsp">Submit</a>
                            </div>
                            <div class="clearfix"></div>
                            <div class="separator">

                                <p class="change_link">Already a member ?
                                    <a href="#tologin" class="to_register"> Log in </a>
                                </p>
                                <div class="clearfix"></div>
                                <br />
                                <div>
                                    <h1><i class="fa fa-paw" style="font-size: 26px;"></i> Gentelella Alela!</h1>
                                    <p>�2015 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                                </div>
                            </div>
                        </form>
                    </section>
                </div>-->
            </div>
        </div>
    </body>
</html>