<div class="">
    <div class="page-title">
        <div class="title_left">
            <h3>Manage Project Group</h3>
        </div>
    </div>
    <div class="clearfix"></div>
    <div class="clearfix"></div>
    <form id="demo-form2" data-parsley-validate class="form-horizontal form-label-left" method="post" action="./AddProjectgroupServlet" >
        <div class="row">
            <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                    <div class="x_title">
                        <h2>PROJECT GROUP</h2>
                        <div class="clearfix"></div>
                    </div>
                    <div class="x_content">
                        <br />
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="group_code">Group Code <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="text" id="group_code" required="required" class="form-control col-md-7 col-xs-12" name="group_code"  maxlength="11">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="brach_name">Brach Name <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="text" id="brach_name" name="brach_name" required="required" class="form-control col-md-7 col-xs-12" maxlength="10">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="groupP_student" class="control-label col-md-3 col-sm-3 col-xs-12">Group Student</label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input id="groupP_student" class="form-control col-md-7 col-xs-12" type="number" name="groupP_student" maxlength="15">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Project Title <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input id="project_title" class="date-picker form-control col-md-7 col-xs-12" required="required" name="project_title" type="text" maxlength="20">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="project_domain">Project Domain <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="text" id="project_domain" required="required" name="project_domain" class="form-control col-md-7 col-xs-12" maxlength="15">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="group username">Group Username <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input type="text" id="group_username" name="group username" required="required" class="form-control col-md-7 col-xs-12"  maxlength="5">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="group password" class="control-label col-md-3 col-sm-3 col-xs-12">Group Password <span class="required">*</span></label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input id="group password" class="form-control col-md-7 col-xs-12" required="required" type="password" name="group password" maxlength="30">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-md-3 col-sm-3 col-xs-12">Project Language <span class="required">*</span>
                            </label>
                            <div class="col-md-6 col-sm-6 col-xs-12">
                                <input id="project_language" class="date-picker form-control col-md-7 col-xs-12" required="required" name="project_language" maxlength="30" type="text" >
                            </div>
                        </div>

                        <div class="clearfix"></div>
                        <div class="ln_solid"></div>
                        <div class="form-group">
                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                <button type="submit" class="btn btn-success">Submit</button>
                                <button type="submit" class="btn btn-primary">Cancel</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </form>
</div>