
package com.databank.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.databank.authentication.Validator;
import javax.servlet.http.HttpSession;


/**
 *
 * @author ayprograms
 */
@WebServlet(name = "regController", urlPatterns = {"/regController"})
public class regController extends HttpServlet {

    private static final long serialVersionUID = -7060758261496829905L;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
       //instatiate session variable
        
        HttpSession session = request.getSession();
        
        //instantiate the validator object for server side validation of input fields.
        Validator validate = new Validator();
        
        //assign validator bean data to session scope
         session.setAttribute("formHandler", validate);
         
        //get registration data from the registration form
         
         String firstname =  request.getParameter("firstname");
         String lastname  = request.getParameter("lastname");
         String email = request.getParameter("email");
         String username = request.getParameter("username");
         String password1 = request.getParameter("password1");
         String password2 = request.getParameter("password2");
         String location = request.getParameter("location");
         
         
         //perform server side validattion of form data
         
         
         if(validate.vRegistration(firstname, lastname, email, username, password1, password2, location)){
             
             
             //check if username or email already exist in the system
             
             
             
             
             
             
             
             
         }
        
         else{ 
           
           
           //reload page with old data
           
             request.getRequestDispatcher("registration.jsp").forward(request, response); 
        
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
