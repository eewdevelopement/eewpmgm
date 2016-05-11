<%@page import="com.eew.service.DatabaseMaster"%>
<%@page import="java.util.List"%>
<%@page import="com.eew.pojo.TblGuide"%>
<!-- page content -->
<div class="">
    <div class="page-title">
        <div class="title_left">
            <h3>
                Tables
                <small>
                    Some examples to get you started
                </small>
            </h3>
        </div>

        <div class="title_right">
            <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">Go!</button>
                    </span>
                </div>
            </div>
        </div>
    </div>

    <div class="clearfix"></div>

    <div class="row">
        <div class="clearfix"></div>
        <div class="col-md-12 col-sm-12 col-xs-12">
            <div class="x_panel">
                <div class="x_title">
                    <h2>Table design <small>Custom design</small></h2>
                    <div class="clearfix"></div>
                </div>

                <div class="x_content">
                    <div class="table-responsive">
                        <table class="table table-striped jambo_table bulk_action">
                            <thead>
                                <tr class="headings">
                                    <th><input type="checkbox" id="check-all" class="flat"></th>
                                    <th  class="column-title">Full Name</th>
                                    <th  class="column-title">Contact No</th>
                                    <th  class="column-title">Email_Id</th>
                                    <th  class="column-title">Password</th>
                                    <th  class="column-title">Brach Name</th>
                                    <th  class="column-title">Max Group</th>
                                    <th  class="column-title">From</th>
                                    <th  class="column-title">To</th>
                                    <th class="column-title no-link last"><span class="nobr">Action</span></th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    List<TblGuide> list = DatabaseMaster.listEntity(new TblGuide());
                                    for (TblGuide guide : list) {
                                %>
                                <tr class="even pointer">
                                    <td class="a-center "><input type="checkbox" class="flat" name="table_records"></td>
                                    <td> <%= guide.getFullName()%></td>
                                    <td><%=guide.getContactNo()%></td>
                                    <td><%=guide.getEmailId()%></td>
                                    <td><%=guide.getPassword()%></td>
                                    <td><%=guide.getBranchName()%></td>
                                    <td><%=guide.getMaxGroup()%></td>
                                    <td><%=guide.getFromDuration()%></td>
                                    <td><%=guide.getToDuration()%></td>
                                    <td class=" last">
                                        <a href="#">View</a>
                                        &nbsp;|&nbsp;
                                        <a href="#">Edit</a>
                                        &nbsp;|&nbsp;
                                        <a href="#">Delete</a>
                                    </td>
                                </tr>
                                <% }%>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>