package com.curso.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/saludo")
public class SaludoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) throws ServletException, IOException {
		
		//mostrar html saludo
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // para escribir html en body respuesta
		out.println("<h1> Esto es un saludo </h1>");
		out.flush();
		out.close();
		
	}



}
