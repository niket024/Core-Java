

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TwoWheeler
 */
@WebServlet("/TwoWheeler")
public class TwoWheelerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TwoWheelerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Vehicle vehicle = new TwoWheeler();
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h3>Cost:"+vehicle.getCost()+"</h3>");
		printWriter.println("<h3>Cost:"+vehicle.getSpeed()+"</h3>");
	}

}
