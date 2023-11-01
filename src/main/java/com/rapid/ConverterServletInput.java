package com.rapid;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ConverterServletInput extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String nrRoniString = req.getParameter("nrRoni");
		
		if(nrRoniString != null) {
			int ron = Integer.parseInt(req.getParameter("nrRoni"));
			
			int result = ron/5;
			
			req.setAttribute("nrRoni", ron);
			req.setAttribute("convertedResult", result);
		}
		
		req.getRequestDispatcher("ConvertedSum.jsp").forward(req, res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("ConverterServletInput.jsp").forward(req, res);
	}
}
