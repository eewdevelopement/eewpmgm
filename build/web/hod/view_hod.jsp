<%@page import="com.eew.service.DatabaseMaster"%>
<%@page import="java.util.List"%>
<%@page import="com.main.pojo.TblHod"%>
<div class="">
    <div class="page-title">
        <div class="title_left">
            <h3>NO OF HOD</h3>
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
                            <th id="th">Name</th>
                            <th id="th">Contact No</th>
                            <th id="th">Landline no</th>
                            <th id="th">Email_Id</th>
                            <th id="th">Branch</th>
                            <th id="th">From Duration</th>
                            <th id="th">To Duration</th>
                        </tr>
                        <%
                            List<TblHod> list = DatabaseMaster.listEntity(new TblHod());
                            for (TblHod hod : list) {
                        %>
                        <tr id="tr"  style="text-align: center">
                            <td> <%= hod.getFullName()%></td>
                            <td><%=hod.getContactNo()%></td>
                            <td><%=hod.getLandLineNo()%></td>
                            <td><%=hod.getEmailId()%></td>
                            <td><%=hod.getBrachName()%></td>
                            <td><%=hod.getFromDuration()%></td>
                            <td><%=hod.getToDuration()%></td>
                        </tr>
                        <% }%>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>