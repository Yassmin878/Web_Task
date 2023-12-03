package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Employee;
import repo.EmploeeDeo;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/signup")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private EmploeeDeo employeedeo= new EmploeeDeo();
    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    RequestDispatcher dis= request.getRequestDispatcher("/WEB-INF/views/employee_Registration.jsp");
        dis.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String first_name=request.getParameter("first_name");
	String last_name=request.getParameter("last_name");
	String country=request.getParameter("country");
	String password=request.getParameter("password");
	String phone_number=request.getParameter("phone_number");
	String email=request.getParameter("email");
	
	Employee emp=new Employee(first_name,last_name,country,password,phone_number,email);
//	emp.setFirst_name(first_name);
//	emp.setCountry(country)
	try {
		employeedeo.registerEmployee(emp);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	if(emp.getPassword().equals(emp.)) {
//		
//	}
	
	 RequestDispatcher dis= request.getRequestDispatcher("/WEB-INF/views/empDetails.jsp");
     dis.forward(request, response);	
	
	
	}

}
