package com.EEE;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class index2
 */
@WebServlet("/index2")
public class index2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		 try {
	           
	            int n = Integer.parseInt(request.getParameter("n"));
	            String[] xValuesStr = request.getParameter("xValues").split(" ");
	            String[] yValuesStr = request.getParameter("yValues").split(" ");

	            
	            int[] arrX = new int[n];
	            int[] arrY = new int[n];

	            for (int i = 0; i < n; i++) {
	                arrX[i] = Integer.parseInt(xValuesStr[i].trim());
	                arrY[i] = Integer.parseInt(yValuesStr[i].trim());
	            }

	            Correlation correlation = new Correlation(n);
	            correlation.inputXValues(arrX);
	            correlation.inputYValues(arrY);

	          
	            double correlationCoefficient = correlation.calculateCorrelationCoefficient();
	            String lineEquation = correlation.getStraightLineEquation();

	         
	            request.setAttribute("correlationCoefficient", correlationCoefficient);
	            request.setAttribute("lineEquation", lineEquation);

	            RequestDispatcher dispatcher = request.getRequestDispatcher("result2.jsp");
	            dispatcher.forward(request, response);

	        } catch (Exception e) {
	            
	            request.setAttribute("error", "Error in correlation calculation: " + e.getMessage());
	            RequestDispatcher dispatcher = request.getRequestDispatcher("C&R.jsp");
	            dispatcher.forward(request, response);
	        }
	        }
	    }
	


