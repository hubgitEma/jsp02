
package com.emergentes.jsp02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "procesa", urlPatterns = {"/procesa"})
public class procesa extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre=request.getParameter("nombre");
        String telefono=request.getParameter("telefono");
        String email=request.getParameter("email");
        
        registro reg=new registro();
        
        reg.setNombre(nombre);
        reg.setTelefono(telefono);
        reg.setEmail(email);
    
        request.setAttribute("registro", reg);
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }
}
