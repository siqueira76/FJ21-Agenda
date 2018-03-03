package br.com.caelum.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc")
public class ContollerServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "br"
		
		super.service(arg0, arg1);
	}
	

}
