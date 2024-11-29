package com.EEE;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
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
		       
		        int intervals = Integer.parseInt(request.getParameter("intervals"));
		        int start = Integer.parseInt(request.getParameter("start"));
		        int length = Integer.parseInt(request.getParameter("length"));
		        
		     
		        if (intervals <= 0 || length <= 0) {
		            throw new IllegalArgumentException("Intervals and length must be positive.");
		        }
		        
		       
		        String[] freqValues = request.getParameter("frequencies").split(" ");
		        int[] frequencies = new int[freqValues.length];
		        
		        for (int i = 0; i < freqValues.length; i++) {
		            frequencies[i] = Integer.parseInt(freqValues[i].trim());
		            if (frequencies[i] < 0) {
		                throw new IllegalArgumentException("Frequencies must be non-negative.");
		            }
		        }

		       
		        Statistics_Class stats = new Statistics_Class(intervals, start, length);
		        stats.set_frequency(frequencies); 
		        
		        
		        double mean = stats.calculate_mean();
		        double variance = stats.calculate_Variance(mean);
		        double mode = stats.calculate_mode();
		        double median = stats.calculate_median();
		        
		        
		        request.setAttribute("mean", mean);
		        request.setAttribute("variance", variance);
		        request.setAttribute("mode", mode);
		        request.setAttribute("median", median);
		        
		        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		        dispatcher.forward(request, response);

		    } catch (IllegalArgumentException e) {
		         
		        request.setAttribute("error", "Invalid input: " + e.getMessage());
		        RequestDispatcher dispatcher = request.getRequestDispatcher("E3.jsp");
		        dispatcher.forward(request, response);
		    }
	}
	}


