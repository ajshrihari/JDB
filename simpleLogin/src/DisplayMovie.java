

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.webkit.BackForwardList;

/**
 * Servlet implementation class DisplayMovie
 */
@WebServlet("/DisplayMovie")
public class DisplayMovie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayMovie() {
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
		try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Ajay\\Internship\\Spring stuff\\simpleLogin\\testjava.db");
            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
		String num = request.getParameter("num");
		//String password = request.getParameter("password");
		if (num=="1"){
			statement.execute("UPDATE TABLE movies set number=number-1 where name='Batman'");
		}
		if (num=="2"){
			statement.execute("UPDATE TABLE movies set number=number-1 where name='Iron Man'");
		}
		if (num=="3"){
			statement.execute("UPDATE TABLE movies set number=number-1 where name='Spiderman'");
		}
		
		else {
			response.sendRedirect("error.jsp");

		}
		

        statement.close();
        conn.close();
	}catch (SQLException e) {
        System.out.println("Something went wrong: " + e.getMessage());
    }

	}
}
