package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.Employee;

public class EmploeeDeo 
{
//	INSERT INTO `employees`.`employee` (`id`, `first_name`, `last_name`, `country`, `password`, `phone_number`, `email`) VALUES ('2', 'yomna', 'ali', 'Egypt', '123', '123', 'yassmin888@gmail.com');

    public int registerEmployee(Employee employee) throws ClassNotFoundException {
  
        int result = 0;
      

//        Class.forName("com.mysql.cj.jdbc.Driver"); 
//        Class.forName("com.mysql.jdbc.Driver");  
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
           
            System.out.println( e.getMessage()); 
           
        }

//        System.out.println("Connection created"); 
        
        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/employees", "root", "Yassmin@123");
        		

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee" +
                    "  (id, first_name, last_name, country, password, phone_number, email) VALUES " +
                    " (?, ?, ?, ?, ?,?,?);")) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, employee.getFirst_name());
            preparedStatement.setString(3, employee.getLast_name());
            preparedStatement.setString(4, employee.getCountry());
            preparedStatement.setString(5, employee.getPassword());
            preparedStatement.setString(6, employee.getPhone_number());
            preparedStatement.setString(7, employee.getEmail());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
           
//        	  System.out.println("Connection in catch"); 
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
