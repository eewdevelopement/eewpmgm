<%@page import="com.eew.service.DatabaseMaster"%>
<%@page import="java.util.List"%>
<%@page import="com.eew.pojo.TblGuide"%>
<div class="">
    <div class="page-title">
        <div class="title_left">
            <h3>NO OF GUIDE</h3>
        </div>
    </div>
    <div class="clearfix"></div>
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
                <div class="x_title">
                    <!--                    <h2>Form Design <small>different form elements</small></h2>-->
                    <div class="clearfix"></div>
                </div>
                <div class="x_content">
                    <br />
                    <table border="1" style="border-collapse: collapse;width: 100%;font-family: verdana;font-size: 13px;">
                        <tr id="tr" style="text-align: center">
                            <th id="th">Full Name</th>
                            <th id="th">Contact No</th>
                            <th id="th">Landline no</th>
                            <th id="th">Email_Id</th>
                            <th id="th">Password</th>
                            <th id="th">Security Question</th>
                            <th id="th">Answer</th>
                            <th id="th">Brach Name</th>
                            <th id="th">Max Group</th>
                            <th id="th">From Duration</th>
                            <th id="th">To Duration</th>
                        </tr>
                        <%
                            List<TblGuide> list = DatabaseMaster.listEntity(new TblGuide());
                            for (TblGuide guide : list) {
                        %>
                        <tr id="tr"  style="text-align: center">
                            <td> <%= guide.getFullName()%></td>
                            <td><%=guide.getContactNo()%></td>
                            <td><%=guide.getLandLineNo()%></td>
                            <td><%=guide.getEmailId()%></td>
                            <td><%=guide.getPassword()%></td>
                            <td><%=guide.getSecurityQuestion()%></td>
                            <td><%=guide.getAnswer()%></td>
                            <td><%=guide.getBranchName()%></td>
                            <td><%=guide.getMaxGroup()%></td>
                            <td><%=guide.getFromDuration()%></td>
                            <td><%=guide.getToDuration()%></td>
                        </tr>
                        <% }%>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>