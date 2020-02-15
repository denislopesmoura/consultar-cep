/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Denis Moura
 */
@MultipartConfig
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class CepServlet extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        
        PrintWriter pw = response.getWriter();
        pw.print(String.format("<root><method>GET</method><name>%s</name><idade>%s</idade></root>",nome,idade));
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String idade = request.getParameter("idade");
        
        PrintWriter pw = response.getWriter();
        pw.print(String.format("<root><method>POST</method><name>%s</name><idade>%s</idade></root>",nome,idade));
        
    }

 

}
