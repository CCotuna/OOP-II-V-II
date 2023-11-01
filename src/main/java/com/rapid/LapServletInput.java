package com.rapid;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LapServletInput extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String lapBrand = req.getParameter("brand");
		
		
		if(lapBrand != null) {
			int brandLength = lapBrand.length();
			req.setAttribute("lapBrandLength", brandLength);
			
			String odd = "impar";
			String even = "par";
			
			if(brandLength % 2 == 0) {
				req.setAttribute("oddEven", even);
			}else {
				req.setAttribute("oddEven", odd);
			}
		}
		
		req.setAttribute("lapBrandName", lapBrand);
		req.getRequestDispatcher("LapServletInput.jsp").forward(req, res);
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("LapServletInput.jsp").forward(req, res);
	}
}
