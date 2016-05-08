/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eew.servlet;

import com.eew.pojo.TblHod;
import com.eew.service.DatabaseMaster;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author minu
 */
@WebServlet(name = "AddHodServlet", urlPatterns = {"/AddHodServlet"})
public class AddHodServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            TblHod hod = new TblHod();
            String name = request.getParameter("txtname");
            hod.setFullName(name);
            String cont = request.getParameter("txtcont");
            hod.setContactNo(cont);
            String landline = request.getParameter("txtlandline");
            hod.setLandLineNo(landline);
            String email = request.getParameter("txtemail");
            hod.setEmailId(email);
            String pwd = request.getParameter("txtpwd");
            hod.setPassword(pwd);
            String que = request.getParameter("txtque");
            hod.setSecurityQuestion(que);
            String ans = request.getParameter("txtans");
            hod.setAnswer(ans);
            String branch = request.getParameter("txtbranch");
            hod.setBrachName(branch);
            String frmdur = request.getParameter("txtfrm");
            hod.setFromDuration(frmdur);
            String todur = request.getParameter("txtto");
            hod.setToDuration(todur);
            DatabaseMaster.saveEntity(hod);
            response.sendRedirect("home.jsp?pageinclude=view_hod");
        } catch (Exception e) {
            response.sendRedirect("home.jsp?pageinclude=error");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
