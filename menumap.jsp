<%@page import="java.util.HashMap"%>
<%

    HashMap<String, String> menuMap = new HashMap<String, String>();
    menuMap.put("dashboard", "dashboard.jsp");

    menuMap.put("add_hod", "hod/add_hod.jsp");
    menuMap.put("view_hod", "hod/view_hod.jsp");

    menuMap.put("add_groupstudent", "groupstudent/add_groupstudent.jsp");
    menuMap.put("view_groupstudent", "groupstudent/view_groupstudent.jsp");

    menuMap.put("add_guide", "guide/add_guide.jsp");
    menuMap.put("view_guide", "guide/view_guide.jsp");

    menuMap.put("add_projectgroup", "projectgroup/add_projectgroup.jsp");
    menuMap.put("view_projectgroup", "projectgroup/view_projectgroup.jsp");

    menuMap.put("add_projectselection", "hod/add_projectselection.jsp");
    menuMap.put("view_projectselection", "hod/view_projectselection.jsp");

%>