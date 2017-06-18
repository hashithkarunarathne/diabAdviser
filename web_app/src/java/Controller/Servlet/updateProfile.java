/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hashith
 */
@WebServlet(name = "updateProfile", urlPatterns = {"/updateProfile"})
public class updateProfile extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            String first_name = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String mob = request.getParameter("mobile");
            System.out.println(request.getParameter("hospital"));
            int hospitalId = Integer.parseInt(request.getParameter("hospital"));
            int bankId = Integer.parseInt(request.getParameter("bank"));
            double tip_payment = Double.parseDouble(request.getParameter("tip"));
            String acc_name = request.getParameter("accname");
            String acc_num = request.getParameter("accnum");
            String c_pass = request.getParameter("c_pass");

            Model.DB.User u = (Model.DB.User) request.getSession().getAttribute("user");

            if (c_pass.equals(u.getPassword())) {
                new Controller.actions.setDetails().upDateDoctorDetails(u.getIduser(), first_name, lastname, mob, tip_payment, hospitalId, bankId, acc_name, Long.parseLong(acc_num));
                response.sendRedirect("editProfile.jsp?msg=ok");
            } else {
                request.setAttribute("f_name", u.getDoctor().getFirstName());
                request.setAttribute("l_name", u.getDoctor().getLastName());
                request.setAttribute("email", u.getEmal());
                request.setAttribute("mob", u.getDoctor().getMobile());
                request.setAttribute("acc_name", u.getDoctor().getAccountName());
                request.setAttribute("acc_num", u.getDoctor().getAccountNumber());
                request.setAttribute("tip_payment", u.getDoctor().getTipPayment());
                request.getRequestDispatcher("editProfile.jsp").forward(request, response);
            }
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
