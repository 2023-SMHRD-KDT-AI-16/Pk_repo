package user_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

import user_DTO.DTO;

public class DAO {
   private Connection conn;
   private PreparedStatement psmt;
   private ResultSet rs;
   Scanner sc = new Scanner(System.in);


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

   // 삭제 메소드

   public int delete(String delete_member) {

      getConn();

      try {

         // sql통과 통로
         String sql = "delete from member where ID = ?";
         psmt = conn.prepareStatement(sql);

         // ?채우기 - ?가 없으면 생략
         psmt.setString(1, delete_member);
         // sql통과 하세요!
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

      getConn(); // 연결먼저 해주고 나서

      // sql 통로 뚫어주고(conn.prepareStatement)
      String sql = "insert into member values(?,?,?)";

      try {
         psmt = conn.prepareStatement(sql);
         // ?채우기
         psmt.setString(1, dto.getId());
         psmt.setString(2, dto.getPassword());
         psmt.setString(3, dto.getNickname());

         // sql통과시키기
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
      String sql = "select * from member where id=? and pw =?";
      try {
         getConn();
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         psmt.setString(2, pw);
         rs = psmt.executeQuery();
         if (rs.next()) {
            return true;
         }
         return false;

      } catch (SQLException e) {
         System.out.println("login 오류");
      } finally {
         allClose();
      }

      return false;

   }

}