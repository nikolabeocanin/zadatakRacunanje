package servlet;


import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

/**
 * Servlet implementation class math
 */
@WebServlet("/math")
public class Math extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Math() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a=0;
		int b=0;
		int c=0;
		
		boolean signal = false;
		
		String parametarA = request.getParameter("a");
		String parametarB = request.getParameter("b");
		
		
		
		
		try {
			if (parametarA.isEmpty()) {
				throw new Exception("insert number");
			}
			a = Integer.parseInt(parametarA);
			
		}catch(Exception e) {
			signal=true;
			request.setAttribute("errorA", "A is not number!");
		}
		
		
	
		try {
			if (parametarB.isEmpty()) {
				throw new Exception("insert number");
			}
			b = Integer.parseInt(parametarB);
			
		}catch(Exception e) {
			signal=true;
			request.setAttribute("errorB", "B is not number!");
		}
		
       if(!signal) {
	        if(request.getParameter("plus") != null) {
		c = a+b;
	    }
	    else if (request.getParameter("minus") != null) {
		   c = a-b;
	    }
   }
   else {
	request.setAttribute("errorC", "Invalid values, cannot calculate!");
}

request.setAttribute("parametarA", parametarA);
request.setAttribute("parametarB", parametarB);
request.setAttribute("parametarC", c);




RequestDispatcher rd = request.getRequestDispatcher("math.jsp");
rd.forward(request, response);


}
}

