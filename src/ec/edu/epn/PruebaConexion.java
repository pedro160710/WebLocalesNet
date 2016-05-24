
package ec.edu.epn;
import java.sql.*;

public class PruebaConexion {

	public static void main(String[] args) {
		try {
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    System.out.println("Registro exitoso");

		} catch (Exception e) {

		    System.out.println(e.toString());

		}
		Connection con = null;
		//...

		try {

		    con = DriverManager.getConnection(
		            "jdbc:mysql://localhost/localesnet?"
		            + "user=root&password=pwd");

		    // Otros y operaciones sobre la base de datos...

		} catch (SQLException ex) {

		    // Mantener el control sobre el tipo de error
		    System.out.println("SQLException: " + ex.getMessage());
		    
		}
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
