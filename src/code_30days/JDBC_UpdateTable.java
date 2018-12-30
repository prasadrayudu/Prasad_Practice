package code_30days;
/* import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
*/
import java.sql.*;

public class JDBC_UpdateTable {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DB_USER = "OracleEdu";
	private static final String DB_PASSWORD = "Rayudu@46";
	////private static final DateFormat dateFormat = new SimpleDateFormat(
	//		"yyyy/MM/dd HH:mm:ss");

	public static void main(String[] argv) {

		try {

			UpdateRecordintoDbtable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void UpdateRecordintoDbtable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String UpdateTableSQL = "UPDATE STUDENT"
				+ " SET STDNAME = 'RAYUDU'"
				+ " WHERE STDID = '322028'";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(UpdateTableSQL);

			// execute UPDATE SQL stetement
			statement.executeUpdate(UpdateTableSQL);

			System.out.println("Record is UPDATED into STUDENT table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                               DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}



}