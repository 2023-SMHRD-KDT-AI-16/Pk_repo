package user_DAO;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.sql.Timestamp;

	public class DAO {
		private Connection conn ;
		   private PreparedStatement psmt;
		   private ResultSet rs;
	
	//경과 시간구하는 메소드
		public void elapse_time(Long time1, Long time2) {
			long elapsetime=time2-time1;
			int second = (int)elapsetime/1000;
			int millis = (int)elapsetime%1000;
			double test = second+((double)millis/1000);
			System.out.println(test);
			 
		}
		
		public long nowtime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp.getTime();
		}
		   
		   //동적로딩
		   private void getConn( ) {
			      try {
			         Class.forName("oracle.jdbc.driver.OracleDrive");
			         String user = "mp_21K_bigdata22_p1_3";
			         String pw = "smhrd3";
			         String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:xe";

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


}
