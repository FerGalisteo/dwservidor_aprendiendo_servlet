package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Saluda
 */
public class SumaNum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SumaNum() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String n1 = request.getParameter("nombre");
		String n2 = request.getParameter("apellido");
		
		
		Integer resultado = Integer.parseInt(n1)+Integer.parseInt(n2);
		out.print("<h1>GET</h1>");
		out.print("El resultado es " + resultado + "!");

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		procesaFormularioPOST(request, response);
	}

	public void procesaFormularioPOST(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		out.print("<h1>POST</h1>");
		out.print("Hola, " + nombre + " " + apellido + "!");
		out.close();
	}

}
