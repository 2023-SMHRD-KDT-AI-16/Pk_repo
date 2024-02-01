package user_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import user_DTO.MenuDTO;

public class DAO {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	// 연결메소드
	public void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "mp_21K_bigdata22_p1_3";
			String pw = "smhrd3";
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1523:xe";
			
			conn = DriverManager.getConnection(url, user, pw);

			if (conn != null) {

				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// CLOSE 메소드
	private void allClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<MenuDTO> sandwichList(String 샌드위치) {
		
		ArrayList<MenuDTO> menuList = new ArrayList<MenuDTO>();
		
		String sql = "select 재료 from 재료 where  요리명 = '샌드위치'";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				String 요리명 = rs.getString(1);
				String 빵 = rs.getString(2);
				String 재료 = rs.getString(3);
				
				MenuDTO mdto = new MenuDTO(요리명, 빵, 재료);
				
				menuList.add(mdto);
			}
			return menuList;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			allClose();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 //PICKACARD
	   
	 //랜덤 재료 출력 메소드
//	  private static void pickacard() {
//		   //pizzatime pzt 는 재료들이 들어간곳 나중에 수정
//	      pizzatime pzt = new pizzatime();
//	      ArrayList<String> list = new ArrayList<String>();
//	      int count = pzt.ingredients.length; // 재료
//	      int count2 = pzt.sauce.length; // 소스
//	      int count3 = pzt.pizza.length; // 도우
//	      int a[] = new int[count];
//	      int b[] = new int[count2];
//	      int c[] = new int[count3];
//	      Random r = new Random();
//	      // 재료랜덤출력
//	      for (int i = 0; i < count; i++) {
//	         a[i] = r.nextInt(pzt.ingredients.length);
//	         for (int j = 0; j < i; j++) {
//	            if (a[i] == a[j]) {
//	               i--; // 중복방지
//	            }
//	         }
//	      }
//	      // 출력갯수 조절
//	      for (int i = 0; i < 2; i++) {
//	         System.out.println(pzt.ingredients[a[i]]);
//	         list.add(pzt.ingredients[a[i]]); // arraylist에 넣어주기
//
//	      }
//	      // 소스
//	      for (int i = 0; i < count; i++) {
//	         a[i] = r.nextInt(pzt.sauce.length);
//	         for (int j = 0; j < i; j++) {
//	            if (a[i] == a[j]) {
//	               i--; // 중복방지
//	            }
//	         }
//	      }
//	      // 출력갯수 조절
//	      for (int i = 0; i < 5; i++) {
//	         System.out.println(pzt.sauce[a[i]]);
//	         list.add(pzt.sauce[a[i]]); // arraylist에 넣어주기
//
//	      }
//
//	      System.out.println(list); // 배열출력
//
//	   }
	
	
	
	
	
}
