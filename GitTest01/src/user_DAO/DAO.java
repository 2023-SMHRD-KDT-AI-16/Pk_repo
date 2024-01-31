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
			      
			      psmt = conn.prepareStatement(sql);
			    		  int row = psmt.executeUpdate( );
			    		  if(row >0) {System.out.println("성공!");}
			    		  
			   }
		   //select - psmt.executeQuery()
		   //rs.next( )
		   //rs.getString( ), rs.getInt( )
	
}
