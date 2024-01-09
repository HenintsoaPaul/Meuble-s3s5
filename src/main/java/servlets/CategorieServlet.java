/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;

/**
 *
 * @author tsoa
 */
public class CategorieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse reponse)
        throws ServletException, IOException{
        
        Connection connection = null;
        String error = "";
        
        try {
            
        }
        catch (Exception e) {
            error = e.getMessage();
        }
        finally {
            if (connection != null) {
                try {
                    connection.close();
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
