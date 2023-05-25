package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

	// 오라클과 연결할 수 있는 필드
	// 필드
	static String driverClass = "oracle.jdbc.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String username = "c##mydb";
	static String password = "mydb";
	
	public static void main(String[] args) {
		// JDBC(java database connectivity)
		Connection conn = null;		
		
		try {
			Class.forName(driverClass);
			System.out.println("Oracle 드라이버 로딩");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connertion 객체 생성: " + conn);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
