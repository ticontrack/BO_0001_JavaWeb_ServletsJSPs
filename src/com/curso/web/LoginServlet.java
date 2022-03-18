package com.curso.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.modelo.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet({ "/loginServlet", "/login" })
@WebServlet(urlPatterns = { "/loginServlet", "/login" }, loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("...... se instancio el Servlet Login");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// syso
		System.out.println("...... destruyento el Servlet Login");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Lee parametro de envio
		// Convertir y valida
		// llama a la lógica de negocio
		// prepara los datos de la vista que se va ha generar
		// despacha la petición al JPS que genera el html de salida
		
		String msg = null;
		
		//1. leer param
		String nombre = request.getParameter("paramName"); // si no existe devuelve null
		String clave = request.getParameter("paramPwd");
		
		
		if( (nombre == null || nombre.trim().length() == 0 )
			||
			(clave == null || clave.trim().length() == 0 )){

			msg = "Debe indicar un nombre o clave";
		}
		
		if(msg == null) {
			//llamar a un servico que diga si estoy logeado
			
			Usuario usuario = new Usuario(nombre, "gestor");
			
			// despachar  a JSP OK
			System.out.println("Te has logeado como " + nombre);
			
			// ir a inicio.jsp
			
			RequestDispatcher rd = request.getRequestDispatcher("inicio.jsp");
		  
			// rd.include(request, response);
		    
			request.setAttribute("usuario", usuario);
		    rd.forward(request, response);
		    
		    //redirect
			
		}else {
			
			// MOSTAR ERROR AL USARIO
			System.out.println("Error " + msg);
			//ir a login.jsp y mostrar mensaje
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			request.setAttribute("error", msg);
			rd.forward(request, response);
			
			
		}
		
		
		

	}// fin doPost

}
