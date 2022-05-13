package com.mosad.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calculatorSubtract", urlPatterns = { "/calculoter/subtract" })
public class CalculatorSubtractServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int n1 = Integer.parseInt(request.getParameter("n1"));
			int n2 = Integer.parseInt(request.getParameter("n2"));
			response.getWriter().println("<h1 style='color: green'>" + (n1 - n2) + "</h1>");
		} catch (Exception e) {
			response.getWriter().println("<h1 style='color: red'>Please pass valid values</h1>");
		}
	}

}