/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main.servlet;

import com.main.pojo.TblGuide;
import com.main.service.databaseMaster;
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
@WebServlet(name = "AddGuideServlet", urlPatterns = {"/AddGuideServlet"})
public class AddGuideServlet extends HttpServlet {
   

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
            /* TODO output your page here. You may use following sample code. */
            TblGuide guide = new TblGuide();
            
            String name = request.getParameter("full-name");
            guide.setFullName(name);
            String contact = request.getParameter("contact-no");
            guide.setContactNo(contact);
            String landlineno = request.getParameter("land-line-no");
            guide.setLandLineNo(landlineno);
            String email = request.getParameter("email-id");
            guide.setEmailId(email);
            String password = request.getParameter("password");
            guide.setPassword(password);
            String securityquestion = request.getParameter("security_question");
            guide.setSecurityQuestion(securityquestion);
            String answer = request.getParameter("answer");
            guide.setAnswer(answer);
            String brancname = request.getParameter("brach_name");
            guide.setBranchName(brancname);
            int maxg = Integer.parseInt(request.getParameter("max_group"));
            guide.setMaxGroup(maxg);
            String fromduration = request.getParameter("from_duration");
            guide.setFromDuration(fromduration);
            String toduration = request.getParameter("to-duration");
            guide.setToDuration(toduration);
            databaseMaster.saveEntity(guide);
            
            
        
       }
        catch(Exception e){
            System.out.println("e = " + e.getMessage());
        }
        finally {
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
