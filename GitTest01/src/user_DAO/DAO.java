package user_DAO;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import user_DTO.DTO;

public class DAO {

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	Scanner sc = new Scanner(System.in);
	DTO dto = new DTO(null, null, null);
	// 경과 시간구하는 메소드
	public void elapse_time(Long time1, Long time2) {
		long elapsetime = time2 - time1;
		int second = (int) elapsetime / 1000;
		int millis = (int) elapsetime % 1000;
		double test = second + ((double) millis / 1000);
		System.out.println(test);

	}

	public long nowtime() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp.getTime();
	}

	// 연결메소드
	public void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String user = "mp_21K_bigdata22_p1_3";
			String pw = "smhrd3";
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1523:xe";
			
			conn = DriverManager.getConnection(url, user, pw);

			if (conn != null) {

				//System.out.println("연결성공");
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

	// 삭제 메소드

	public int delete(String delete_member) {

		getConn();

		try {

			String sql = "delete from member where ID = ?";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, delete_member);

			int row = psmt.executeUpdate();
			if (row > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}

			return row;

		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		} finally {
			allClose();

		}

	}

	// 아이디중복확인

	public boolean checkId(String id) {

		getConn();
		String sql = "SELECT COUNT(ID) FROM member WHERE ID = ?";
		try {

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			rs.next();
			if (rs.getInt(1) == 1) {
				System.out.println("아이디 중복");
				return true;
			}

		} catch (SQLException e) {

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			allClose();
		}
		return false;
	}

	// 회원가입

	public int joinmember(DTO dto) {

		getConn();

		String sql = "insert into member values(?,?,?)";

		try {
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPassword());
			psmt.setString(3, dto.getNickname());

			int row = psmt.executeUpdate();
			return row;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally {
			allClose();
		}

	}

	// 로그인
	public boolean login(String id, String pw) {
		System.out.println("hi");
		String sql = "select * from member where id=? and pw =?";
		try {
			getConn();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.println("로그인 성공!");
				return false;
			}
			System.out.println("로그인 실패!");
			return true;
			

		} catch (SQLException e) {
			System.out.println("login 오류");
		} finally {
			allClose();
		}

		return false;

	}

	
	
	//카운트다운 기능
	 // 카운트다운
	   private static void countdown() {
	      try {
	         for (int i = 10; i > 0; i--) {
	            System.out.println(i + "초 남았습니다.");

	            // 1초 대기
	            Thread.sleep(1000);
	         }
	      } catch (InterruptedException e) {

	         e.printStackTrace();
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

	   
	   
	   
	   
	//BGM 메소드
	   
	   private static void bgm_on() {
		      /* 음악주소 */
		      File bgm = new File("D:/down/노래이름.wav");

		      try {
		         AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(bgm);
		         Clip clip = AudioSystem.getClip();

		         clip.open(audioInputStream);

		         clip.start();

//		          재생 시간동안 기다리기 (10초)
//		            Thread.sleep(10000);
//
//		            clip.stop();
//		            clip.close();

		      } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {
		         e.printStackTrace();

		      }

	
	
	
	
	   }	
}