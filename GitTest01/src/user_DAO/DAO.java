package user_DAO;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class DAO {
		private Connection conn ;
		   private PreparedStatement psmt;
		   private ResultSet rs;
		   private void getConn( ) {
			      try {
			         Class.forName("oracle.jdbc.driver.OracleDrive");
			         String user = "mp_21K_bigdata22_p1_3";
			         String pw = "smhrd3";
			         String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:xe";

			         if(conn != null) {System.out.println("연결성공");}                     
			         conn= DriverManager.getConnection(url,user,pw);
			         if( conn != null ) {
			            System.out.println("연결 성공");
			         }else {
			            System.out.println("연결 실패");
			         }
			      } catch (ClassNotFoundException | SQLException e) {
			         e.printStackTrace();
			      }
			      
			    		  
			   }
		   //close 하는 메소드
		   private void allClose() {
		      try {
		         if(rs!= null)rs.close();
		         if(psmt != null)psmt.close();
		         if(conn!= null) conn.close();
		      } catch (SQLException e) {
		         e.printStackTrace();
		      }
		      
		   }
		   

}
