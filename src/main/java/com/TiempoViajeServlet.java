package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class TiempoViajeServlet
 */
public class TiempoViajeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TiempoViajeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		Integer n1 = Integer.parseInt(request.getParameter("n1"));
		Integer n2 = Integer.parseInt(request.getParameter("n2"));
		Double resultado = (double) (n1)/n2;
		
		out.print("<h1>GET TIEMPO DE VIAJE</h1>");
		if(resultado>=1) {
		out.print("El tiempo que tardaremos en recorrer "+n1 +"kms yendo a una velocidad de "+ n2 + "km/h será de " + resultado +" horas");
		}else {
			resultado = (Double)resultado*60;
			out.print("El tiempo que tardaremos en recorrer "+n1 +"kms yendo a una velocidad de "+ n2 + "km/h será de " + resultado +" minutos");
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
