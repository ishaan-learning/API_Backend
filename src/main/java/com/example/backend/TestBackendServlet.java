package com.example.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;  // Fix 1: Import ServletException
import jakarta.servlet.annotation.WebServlet;  // Fix 2: Import WebServlet
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/sayHelloApi")
public class TestBackendServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws IOException {
        response.setContentType("application/json");
        response.getWriter().println("{ \"message\": \"Hello from Backend API!\" }");
    }
}

