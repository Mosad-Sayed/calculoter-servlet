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
			String n1 = request.getParameter("n1");
			String n2 = request.getParameter("n2");
			int number1 = Integer.parseInt(n1);
			int number2 = Integer.parseInt(n2);
			response.getWriter().println(number1 - number2);
		} catch (Exception e) {
			response.getWriter().println("please pass valid values");
		}
	}

}