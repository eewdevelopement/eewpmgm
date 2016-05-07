<%@include file="menumap.jsp" %>
<%    Object object = request.getParameter("pageinclude");
    String pageinclude = "dashboard.jsp";
    if (object == null) {
        pageinclude = "dashboard.jsp";
    } else {
        pageinclude = menuMap.get(object.toString().toLowerCase());
    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <%@include file="header.jsp" %>
    </head>
    <body class="nav-md">
        <div class="container body">
            <div class="main_container">
                <div class="col-md-3 left_col">
                    <%@include file="navleft.jsp" %>
                </div>

                <!-- top navigation -->
                <div class="top_nav">
                    <%@include file="navtop.jsp" %>
                </div>
                <!-- /top navigation -->


                <!-- page content -->
                <div class="right_col" role="main">
                    <br />
                    <%--<%@include file="dashboard.jsp" %>--%>
                    <jsp:include page="<%=pageinclude%>" flush="true" />
                </div>
                <!-- /page content -->

                <!-- footer content -->
                <footer>
                    <div class="pull-right">
                        Footer of product
                    </div>
                    <div class="clearfix"></div>
                </footer>
                <!-- /footer content -->
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
