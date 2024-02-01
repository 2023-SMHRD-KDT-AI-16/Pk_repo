package user_VIEW;

import java.util.ArrayList;
import java.util.Scanner;

import user_DAO.DAO;
import user_DTO.DTO;
import user_DTO.MenuDTO;
import user_DTO.ScoreDTO;

public class View {

   public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      String nickname = null;
	      DAO dao = new DAO();
	      String input_id = null;
	      String input_pw = null;
	      double elapsetime =0;
	      long millis = System.currentTimeMillis();
	      int count = 0;
	      long time1 = 0;
	      long time2 = 0;
	      int logcheck = 0;

	      dao.typing_bgm_on();
	      //고든램지 쿠킹클래스, 초상화 출력
	      String asciiArt= dao.grasciiArt();
	      for (int i = 0; i < asciiArt.length(); i++) {
	          System.out.print(asciiArt.charAt(i));
	          try {
	              Thread.sleep(1);
	          } catch (InterruptedException e) {
	              e.printStackTrace();
	          }
	      }
	     
	      System.out.println();
	      System.out.println("                                                    <고든램지의 요리교실>");
	      
	      
	      boolean mainrun = true;
	      while (mainrun) {

	         System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	         System.out.println();
	 		System.out.println("");
	 		System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
	 		System.out.println("              |　　　고든램지의 요리교실　　　　　　　　　　　                                                         　[－][口][×] |   | ");
	 		System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
	 		System.out.println("              |　　            ꙳꒰ ੭⑅•͈ ·̮ •͈꒱੭ ☀︎ 고든램지의 요리교실에 오신것을 환영합니다 !  숫자를 입력해주세요.                                       |");                    
	 		System.out.println("              |　       　　　　　　　   　　　　　　　　　　　　　　　                                                             | ");               
	 		System.out.println("              |　　   　＿＿＿＿＿＿  　　　＿＿＿＿＿＿　　　　＿＿＿＿＿＿　      　＿＿＿＿＿＿      ＿＿＿＿＿＿     　              |");
	 		System.out.println("              | 　　  　｜[1]로그인   |　  　｜[2]회원가입 ｜ 　   |[3]게임시작  |　      |[4]랭킹조회   |    |[5]종료     |                    | ");
	 		System.out.println("              |　　　  　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣￣　       ￣￣￣￣￣￣      ￣￣￣￣￣￣   　                 |");
	 		System.out.println("              ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");

	        
	         // 사용자 번호 선택
	         System.out.print("번호를 입력해주세요 :  ");
	         int input_main_num = sc.nextInt();

	         if (input_main_num == 1) { // 로그인
	             System.out.println("=========================================================================");
	             

	             while (true) {
	                System.out.println("  <로그인>");
	                System.out.print("ID : ");
	                input_id = sc.next();
	                System.out.print("PW : ");
	                input_pw = sc.next();
	                nickname = dao.login(input_id, input_pw);
	                
	                if (nickname != null) { //로그인 성공시
//	                	System.out.println(nickname);
	                   break;

	                }

	                if (nickname ==null) { //로그인 실패시 기회 3번
	                   count++;
	                   if (count > 2) {
	                   System.out.println("로그인 기회가 모두 소진되었습니다!");
	                   mainrun = false;
	                   break;
	                }
	                System.out.println("로그인 기회"+ count + "/3");
	                }
	              
	            }
	             
	             //로그인한 상태
	             if (nickname != null) {
	            	 while(true) {
	            	 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	    	         System.out.println();
	    	 		System.out.println("");
	    	 		System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
	    	 		System.out.println("              |　　　고든램지의 요리교실　　　　　　　　　　　                                        　                 [－][口][×] |   | ");
	    	 		System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
	    	 		System.out.println("              |　　                 ꙳꒰ ੭⑅•͈ ·̮ •͈꒱੭ ☀︎ "+nickname+"님 환영합니다 !  숫자를 입력해주세요.                                      |");                    
	    	 		System.out.println("              |　       　　　　　　　   　　　　　　　　　　　　　　　                                                            | ");               
	    	 		System.out.println("              |　　   　             ＿＿＿＿＿＿  　　　　＿＿＿＿＿＿　      　＿＿＿＿＿＿      ＿＿＿＿＿＿     　                |");
	    	 		System.out.println("              | 　　                ｜[1]로그아웃  |　 　　  |[2]게임시작  |　      |[3]랭킹조회  |     |[4]종료     |                      | ");
	    	 		System.out.println("              |　　　              　￣￣￣￣￣￣　　　 　　￣￣￣￣￣￣　       ￣￣￣￣￣￣      ￣￣￣￣￣￣   　                  |");
	    	 		System.out.println("              ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
	    	 		
	    	 		System.out.print("번호를 입력해주세요 :  ");
	   	         int input_login_main_num = sc.nextInt();
	   	         
	   	         if(input_login_main_num==1) {//로그아웃
	   	        	 input_id=null;
	   	        	System.out.println("                 ┌───────────────┐   ");
		            System.out.println("                    로그아웃합니다....        ");
		            System.out.println("                 └───────────────┘  ");
		            System.out.println("                        ᕱ ᕱ ||       ");
		            System.out.println("                       ( ･ω･ ||         ");
		            System.out.println("                     　 /　つΦ          ");
	   	        	 break;
	   	         }else if(input_login_main_num==2) { //게임시작
	   	        	System.out.println();
		        	System.out.println();
		            System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		            System.out.println();
		        	System.out.println();
		            System.out.println("    |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|                ");
		            System.out.println("                      _______ _______ __   __ _______   _______ _______ _______ ______ _______   ");
		            System.out.println("                     |       |   _   |  |_|  |       | |       |       |   _   |    _ |       |  ");
		            System.out.println("                     |    ___|  |_|  |       |    ___| |  _____|_     _|  |_|  |   | ||_     _|  ");
		            System.out.println("                     |   | __|       |       |   |___  | |_____  |   | |       |   |_||_|   |    ");
		            System.out.println("                     |   ||  |       |       |    ___| |_____  | |   | |       |    __  |   |    ");
		            System.out.println("                     |   |_| |   _   | ||_|| |   |___   _____| | |   | |   _   |   |  | |   |    ");
		            System.out.println("                     |_______|__| |__|_|   |_|_______| |_______| |___| |__| |__|___|  |_|___|    ");
		            System.out.println("    |＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿|                ");
		            System.out.println("                                               |    |                       ");
		            System.out.println("                                               |(•◡•)|                       ");
		            System.out.println();
		            System.out.println();
		            System.out.println();
		            System.out.println();
		            
		            
		            while(true) {
		            System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
		        	System.out.println("              |　고든램지의 요리교실　　　　　　　　　　　　　　　     [－][口][×] |");
		        	System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
		        	System.out.println("              |　메뉴를 선택하면 게임이 시작됩니다　~　　　　                         |");
		        	System.out.println("              |  보기의 메뉴 중 5개를 골라 골라~~                                 |");
		        	System.out.println("              |  짧은시간안에 높은 점수 달성하기!　(✿˵•́ᴗ•̀˵)  　　　　　　　           |");
		        	System.out.println("              |　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿　　　　＿＿＿＿＿　　　  |");
		        	System.out.println("              | 　  　｜[1]샌드위치  |　  　｜[2]피자  ｜ 　  |[3]나베   |　 　　 |"); 
		        	System.out.println("              |　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣　　　　￣￣￣￣￣　　　  |");
		        	System.out.println("              ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣  ");
		        	System.out.println();
		            System.out.print("번호를 입력해주세요 :");
		            int input_num_menu = sc.nextInt(); // 사용자가 선택한 메뉴

		            if (input_num_menu == 1) { // 샌드위치 선택시

		            	 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣶⣶⣶⠿⠿⠿⠿⠿⠿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠿⠿⠿⠿⠿⢶⣶⣶⣦⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⣠⣾⡿⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠛⠛⠿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⣠⠲⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡋⢹⡆⠀⠀⠀⢠⡀⠀⠀⠀⠀⠙⢿⣷⣄⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⢰⣿⠁⠀⠀⠀⠸⠇⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠋⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠻⣿⣦⡀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣷⡀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠘⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣧⣀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠘⢿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠆⠀⠀⠀⠀⠀⠀⠀⣸⣿⢸⣿⣿⣦⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⣨⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠃⢸⣿⠋⣿⣇      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⢀⣾⡿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣶⣶⡿⠿⠛⠁⠀⣼⣿⠀⢸⣿      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⣼⡟⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⢠⣾⡟⣿⠉⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⣿⠉⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⣀⣼⡿⠃⠀⣿⡏      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⢻⣷⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡏⠀⠀⣤⣶⣾⢿⣿⡀⢀⣾⡿⠁      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⣴⡿⠛⢰⣿⠃⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⣿⣀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⣿⣀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⣿⡏⠀⠀⣿⣷⣿⠟⠁⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⢸⣿⠁⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⢀⣿⡇⠀⠀⣿⡏⠁⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⢸⣿⡀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠁⠀⢸⣿⠀⠀⠀⢻⣷⣦⡀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⢀⣴⡿⠃⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⢸⣿⠀⠀⠀⠀⢨⣿⠃⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⢠⣿⠏⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣾⡿⠀⠀⠀⢠⣿⠏⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⣿⣏⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡿⠀⠀⣿⡇⠀⠀⠀⠈⣿⡇⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⢸⣿⡄⠀⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⣿⡇⠀⠀⢀⣼⡿⠁⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠻⣿⣄⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⠃⠀⠀⣿⣟⠁⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠘⢿⣧⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡇⠀⢸⣿⠀⠀⠀⣼⣿⣧⡀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠘⣿⣾⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣼⣿⠀⢀⣾⡿⣿⣿⣷⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠈⣿⡇⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⢔⢏⣿⣏⣠⣿⠟⠀⣿⣿⣿⡇⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⣿⡇⠀⠀⠸⣁⣼⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡉⣹⠀⠀⠀⠀⠀⠀⢀⡀⣸⣿⠀⠁⣿⡿⠛⠁⠀⠀⣿⣿⣿⡇⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⡄⠀⠈⠀⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠤⡀⠀⠀⠉⠁⠀⠀⠀⠀⠀⢐⠋⠀⣿⡇⠀⢠⣿⡇⠀⠀⢀⣼⣿⣿⣿⡇⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠸⣿⣦⣤⣤⣤⣤⣤⣄⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠚⠁⠀⠀⠀⠀⢀⠤⡄⠀⠀⠈⠧⠀⣿⡇⠀⢸⣿⣀⣀⣴⣾⣿⣿⣿⡿⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠘⢿⣯⡉⠉⠉⡉⡛⠛⠛⠛⠛⠛⠛⠿⠿⠿⠿⠿⠿⢿⣿⣶⣶⣶⣶⣶⣶⣶⣶⣦⣤⣤⣤⣤⣤⣼⣶⣃⣀⣀⣀⡀⢰⣿⠇⠀⢸⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠈⠻⣷⣄⣠⡙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⡛⠟⠛⠛⠛⠛⠿⠿⠿⠀⠀⣾⣿⣿⣿⡿⠟⠋⠁⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⢿⣿⣿⣿⣿⡿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣤⣤⣤⣤⣤⣤⣤⣤⣤⣄⣀⣀⣀⣀⣋⣘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⢀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⣉⣩⣿⣿⣿⣿⠏⠉⠉⠉⠛⠛⠛⠛⠛⣻⣿⠟⠻⠿⠿⠿⠿⠿⠿⢿⣶⣶⣶⣿⡇⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⢿⣶⣤⣀⠀⠀⠀⣠⣾⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣀⣀⣀⣀⣀⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⠿⠿⠿⠿⠛⠋⠁⠀⠀⠀⠈⠙⠻⢿⣶⣾⠟⠁⠉⠉⠉⠉⠉⠉⠉⠉⠉⠛⠛⠛⠛⠛⠛⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
		                  System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		                  System.out.println();
		                 
		                  
		                  
		                  ArrayList<MenuDTO> mdto = dao.sandwichList();
		               int[] rdnum = dao.Randomnum();
		               System.out.println("  ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
		               System.out.print("              ");
		               for (int i = 0; i < 10; i++) {
		                  int index = rdnum[i];
		                  System.out.print(mdto.get(index).get재료() + "  \t");
		               }
		               System.out.println();
		               System.out.println("  ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞ ╯");
		              	System.out.println("  O");
		              	System.out.println("  °");
		              	System.out.println("  /}__/}");
		              	System.out.println("  ( • ▼•)");
		              	System.out.println("다섯가지 재료를 골라줘 !");
		              	System.out.println();
		               

		               time1 = dao.nowtime(); // time1 게임시작 시간
		               dao.bgm_on();
		               String[] inputString = new String[5];
		               for (int i = 0; i < inputString.length; i++) {
		                  System.out.print(i + 1 + "번째 재료 : ");
		                  inputString[i] = sc.next();

		               }
		               time2 = dao.nowtime();// 게임 끝날때 시간
		               dao.bgm_off();

		               elapsetime =dao.elapse_time(time1, time2); // 경과 시간 출력
		              
		              
		                   double time = elapsetime;
		                   int score = dao.sumscore(inputString, mdto);
		                   String id = input_id;
		                   System.out.println();
		                   System.out.println();
		                   System.out.println("  ꒰⚘݄꒱₊_____________________________________________");
			                  System.out.println("݄⿴݃*₊↷  닉네임 : " + nickname + "  점수 : " + score + "  시간: " + time);
			                  ScoreDTO sdto = new ScoreDTO(nickname, score, time, id);
			                  System.out.println();
		                   
		                   int row = dao.save(sdto);
		                   
		                   System.out.println("   [1]다시 게임하기     [2]메인화면으로");
		                   System.out.print("번호를 입력해주세요 : ");
		                  int inputreplay =  sc.nextInt();
		                  if(inputreplay ==2) {
		                	 break;
		                  }
		                

		            } else if (input_num_menu == 2) { // 피자 선택시
		               System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⡀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠄⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠂⠤⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠠⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠐⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡎⠀⢀⣴⢖⡲⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢃⣀⣈⣉⣉⡙⠓⠧⣝⡳⢦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⡿⣿⡿⣿⣿⣄⠀⠻⣤⢸⡘⠿⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⡀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⣯⣿⣼⡿⠋⢹⣯⡷⣾⣷⠀⠈⠓⠮⣳⡤⣍⠛⡶⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢄⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⣿⣟⡗⠛⠺⣿⢷⣿⣳⣏⣿⣾⠂⠀⠀⠀⠀⠉⠉⠛⠲⢧⣜⡹⣒⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠡⡄⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁⠈⢯⣽⣿⣶⣾⣟⣯⣧⢀⣸⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⢮⣜⡓⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠈⠻⠷⣯⣼⣿⣾⡽⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠈⠙⢶⡙⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠄⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⠛⢿⣻⡿⣷⣦⡀⠙⢶⡱⡄⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣶⣶⣤⡀⠀⠀⠀⠀⠀⢠⣾⠟⣯⣿⣠⣼⢿⡝⠋⢻⣿⣆⠀⠻⣽⡀⠀⠀⠀⣠⡤⢦⠤⣄⠱⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣘⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⡿⠛⠛⠻⣿⣿⣦⣤⣄⡀⠀⢼⣿⣟⣿⡳⠛⣿⢿⣶⢶⡿⣯⡿⠀⠀⠙⠇⠀⣠⢞⡣⣙⠦⣙⠬⢻⡄        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣟⣯⠟⢉⣿⣿⣷⣄⠀⠀⠀⠀⠘⣿⣿⣦⡀⠀⠀⢿⣿⡿⠿⣿⣿⣧⠘⣿⣾⣽⣦⣴⣿⣻⣾⣩⣿⡷⠃⠀⠀⠀⠀⣼⢣⠚⣔⠣⣎⠥⣋⠥⡇        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⢠⣿⣟⣷⣯⣿⣟⡿⣯⣋⣀⣿⣧⠀⠀⣶⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠈⣿⣿⡇⠀⠙⠾⠷⢾⡯⠷⠿⠛⠁⠀⠀⠀⠀⠀⣰⢋⡖⡹⢌⠳⣌⢎⢥⢋⡇        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⡠⢺⣿⢾⣦⣀⣼⣾⣯⣽⣟⣿⣭⡏⠀⣼⣿⣿⠉⠀⠀⠀⢠⣶⣶⣦⣤⣴⣾⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⢴⣋⠮⠴⣙⠬⣓⢬⢪⠜⣪⠇        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⡰⠁⠈⢿⣯⣾⣟⣿⡉⠉⣻⣽⡾⠟⠁⠀⠹⣿⣿⣄⣀⣠⣴⣿⣿⠟⠿⠿⠟⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⢖⡺⡙⢯⡙⢦⠣⡜⡜⣱⢊⡵⢊⢦⢣⡙⢶⠀        ");
		               System.out.println( "    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⡔⠀⠀⠀⠀⠈⠑⠛⠾⠿⠟⠛⠉⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⢴⢺⡙⡜⣢⠵⡙⢦⡙⢦⡙⢦⡙⣤⠳⡌⣭⢢⣳⠜⠁⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⢲⣋⠯⣙⠜⣢⢍⠦⣃⢳⢂⢧⡙⢦⡙⢦⡙⢦⣱⡦⠷⠚⠋⠁⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⢣⢍⡣⢜⠲⣉⢮⡑⠮⡜⡱⣊⢭⠢⣝⣢⠽⠖⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⢖⡻⣙⠖⡶⠦⣤⢤⠴⣫⠵⣉⢦⠹⣌⠳⣡⠖⣩⠖⣭⠶⠕⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println( "    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣴⢲⠒⡖⣶⠚⡝⢢⢣⡖⢩⠚⣴⠙⣤⠋⡜⡆⢳⠘⡆⡏⣴⢫⣴⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println( "    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⡺⢍⡲⣉⢮⠱⣌⢣⠧⣩⠖⣸⡉⠶⣡⠓⣍⠮⣑⠮⣡⢏⠶⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println( "    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⣬⠱⢎⡱⢜⠢⢏⠴⣃⢮⡵⠮⢵⣘⢣⠥⣋⢆⡳⢡⣞⠍⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println( "    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⢸⣄⡀⠀⠀⠀⠀⣀⡤⡞⣍⠺⣄⣛⠬⣜⢪⡙⡜⢪⡼⠃⠀⠀⠀⠉⠺⠶⣱⣊⣴⠷⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠈⣧⠹⡖⢶⢲⡛⢥⡓⡼⠒⠋⠁⠈⠓⠮⠦⠷⠝⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println( "    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⢸⡱⢎⢣⠖⣩⠖⣹⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println( "    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⢿⣌⠣⢞⡡⢞⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⠣⣛⣦⣙⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("     ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ⠀⠀⠀⢀⡀⢉⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
		               System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		               System.out.println();
		               
		               
		               ArrayList<MenuDTO> mdto = dao.pizzaList();
		               int[] rdnum = dao.Randomnum();
		               System.out.println("  ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
		               System.out.print("              ");
		               for (int i = 0; i < 10; i++) {
		                  int index = rdnum[i];
		                  System.out.print(mdto.get(index).get재료() + "  \t");
		               }
		               System.out.println();
		               System.out.println("  ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞ ╯");
		              	System.out.println("  O");
		              	System.out.println("  °");
		              	System.out.println("  /}__/}");
		              	System.out.println("  ( • ▼•)");
		              	System.out.println("다섯가지 재료를 골라줘 !");
		              	System.out.println();

		               time1 = dao.nowtime(); // time1 게임시작 시간
		               dao.bgm_on();
		               String[] inputString = new String[5];
		               for (int i = 0; i < inputString.length; i++) {
		                  System.out.print(i + 1 + "번째 재료 : ");
		                  inputString[i] = sc.next();

		               }
		               time2 = dao.nowtime();// 게임 끝날때 시간
		               dao.bgm_off();

		               elapsetime =dao.elapse_time(time1, time2); // 경과 시간 출력
		               
		               
		                   double time = elapsetime;
		                   int score = dao.sumscore(inputString, mdto);
		                   String id = input_id;
		                   
		                   System.out.println();
		                   System.out.println("  ꒰⚘݄꒱₊_____________________________________________");
			                  System.out.println("݄⿴݃*₊↷  닉네임 : " + nickname + "  점수 : " + score + "  시간: " + time);
			                  ScoreDTO sdto = new ScoreDTO(nickname, score, time, id);
		                   System.out.println();
		                   
		                   int row = dao.save(sdto);


		                   System.out.println("   [1]다시 게임하기     [2]메인화면으로");
		                   System.out.print("번호를 입력해주세요 : ");
			                  int inputreplay =  sc.nextInt();
			                  if(inputreplay ==2) {
			                	 break;
			                  }
		            } else if (input_num_menu == 3) { // 나베 선택시
		            	 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣴⣴⣖⣶⣴⣦⣦⢤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⣋⡭⢿⣿⣿⣿⣿⣾⣿⣻⣿⣿⣻⣽⣷⣿⣿⢷⠲⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢶⣿⡯⠖⡏⠁⠀⢸⣿⣿⣿⡏⡽⣿⣿⣿⣡⣿⢟⣿⡿⡿⢫⠓⠦⣌⡓⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡵⠞⠁⠀⠀⠃⠀⠀⠸⣿⣿⣿⡿⣷⣿⣽⢣⣿⣿⣼⣿⡼⠁⢸⠀⠀⠂⠙⢶⣾⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⢻⡟⣩⠗⠲⢤⠀⠀⠀⠀⠀⠀⣿⣿⣿⢾⣿⠇⣸⢟⣿⣿⣿⠟⠀⠀⢀⣴⠖⢚⣉⠉⠻⡿⣏⣳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⣩⣿⡶⡇⣔⠃⡬⠧⣄⠀⠀⠀⠀⣸⠟⠾⠿⠿⣤⣷⣾⣿⣿⠏⠀⠀⠀⢸⠁⢜⣁⡀⣇⣠⡗⠈⢳⡌⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣏⡰⠳⣄⢀⣰⠃⠓⢈⡇⠀⠀⠀⠧⣙⣛⣛⡩⠝⠋⠉⢉⡻⢦⠀⠀⠀⢨⠞⢡⠔⠲⣤⠜⢋⡉⠙⢻⣎⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⢰⠏⡾⡁⡷⡀⣐⢦⠀⠈⣢⠤⠞⡇⠀⠀⠀⠀⠀⠀⠸⣠⠒⠚⠉⢁⡠⠋⠀⢀⣴⣻⣄⠑⠤⡜⢡⠞⠁⢨⠆⣸⠛⣆⢳⡀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⢠⠏⣼⠁⠀⣇⡀⠀⣠⠷⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⢀⣏⣄⣻⠈⠉⠒⣧⡀⠑⢚⣡⠴⠋⢀⣸⠞⠋⠉⠙⠢⡀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⡾⢰⠋⠉⠉⣉⣉⣉⡉⠉⠉⠉⠉⠉⠁⠀⢀⠴⠚⠉⢉⠛⢯⣟⠫⠭⣉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⡩⠛⠉⠉⠉⠉⠉⠒⡄⠀⠹⡄⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣠⣤⣤⣤⣤⠇⡞⠀⠀⣴⣿⣿⣿⣿⡆⠀⠀⠀⠀⡀⢰⠃⡤⢤⡠⡏⠀⠀⢹⠲⡀⠈⠑⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⢀⡤⠒⠒⠦⠇⠀⠀⢱⣤⡀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⣿⠿⢿⠀⡇⠀⣀⣻⣿⣿⣿⣿⡇⣀⣀⡀⠀⡇⡇⠀⣉⣮⠤⠚⠛⠷⢎⡻⢡⠤⣄⠘⡄⠀⠀⠀⠀⢀⣠⠤⡤⠞⠋⣉⡦⠴⠟⠒⠒⢦⠀⠀⠀⢰⣿⣿⡇              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⡗⠀⢸⠀⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡇⠸⡼⠋⠀⠀⠀⣠⡤⡤⣭⣌⠛⠁⢰⡁⠀⠀⠀⡔⠉⠀⠀⠈⢆⠞⠁⠀⠀⠀⠀⠀⠘⡆⠀⠀⣨⣿⣿⡇              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⡿⠀⢸⡈⡿⣿⣯⣿⣿⣿⣿⣿⣿⣷⣿⣿⡿⡇⢰⠃⠀⣠⡶⠚⠁⠀⠀⠀⢀⡙⢦⡀⠈⢦⠀⠀⠣⣀⣀⠤⢚⣟⠤⣄⠀⠀⠀⠀⢀⡴⠃⠀⢸⡁⣿⣿⡇              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣿⣿⣿⣿⣿⠁⣇⠙⠛⠟⣿⣿⣿⣿⣿⡝⠋⠉⠀⡇⠀⢣⡘⢾⠁⠀⠓⠸⠗⠠⠈⠁⠈⡯⠇⠈⡆⢰⠀⣠⠴⠚⢉⠀⣀⡾⠤⠤⠤⠾⢥⣀⣀⣀⣠⣿⣿⣿⡇              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠈⠛⠛⠛⠛⣇⢹⡀⠀⠀⢿⣿⣾⣿⣿⠇⠀⠀⠀⡇⠀⠀⠉⠺⡄⠤⠴⠆⣄⡀⢾⡶⣰⡳⢀⡜⠀⠀⢰⡁⠀⢀⡤⠚⠁⠀⠀⠀⠀⠀⢸⢃⡟⠛⠛⠛⠛⠋⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠸⡌⣇⣀⡀⣀⠙⠛⠛⢁⣀⣀⣀⣀⢃⠀⠀⠀⠀⠈⠓⠤⠤⠩⠭⠴⠚⠓⢚⣁⣀⠀⢀⣀⣉⣉⣉⣀⢀⡀⡀⠀⠀⠀⣀⣟⣼⠁⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⢳⡘⣏⠁⢤⡶⠯⣭⣟⢮⣻⣿⢿⡏⠃⠀⣀⣀⣀⡤⠖⠛⣲⠤⠤⢄⡀⠀⠀⠀⠀⠰⣽⠟⠛⢿⡿⠋⠙⢳⡠⠀⢠⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⢳⡘⣦⠘⣞⠭⠮⢋⡬⢽⢲⡎⡇⢠⠏⢀⢠⠞⠉⢭⠉⠠⠀⠀⠀⡉⢳⠀⠀⠀⢀⣧⠔⢲⠞⠉⢹⠋⠉⠙⣦⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠈⠳⣌⢧⣧⣻⠭⢂⣯⢽⣪⢳⡇⠘⢆⡀⠿⡐⠐⠊⣁⠀⣹⠢⠊⠙⠛⢤⣀⠀⢸⣇⠀⢈⡷⠒⠺⣤⣀⣴⠿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣯⡉⢯⡺⠵⣢⡞⡇⠀⡞⢀⢦⢳⢠⠏⠀⢀⣤⠤⢧⡄⡄⢠⢸⠂⢸⡟⠉⠹⡄⠀⢀⣿⡾⣻⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢧⡽⢧⡉⠉⠉⠁⡇⠀⠙⠦⠼⡶⠚⠃⡒⠉⡄⠀⠀⠈⠳⡮⠋⠀⠘⢧⣀⣀⡾⣻⢿⣻⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠦⣝⠳⢤⣀⠁⠀⠀⠀⠀⡇⠀⢆⠃⣢⣀⡇⢀⢸⡼⠁⠀⠀⢀⢀⣫⣽⣿⡥⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠲⢬⣙⠲⠤⣤⣀⣉⠓⠋⠉⠀⠀⠉⠉⢉⣀⣀⡤⠴⣾⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠒⠲⠤⠭⣍⣉⣉⣉⣉⣉⣉⣩⠤⠴⠒⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
		                 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		                 System.out.println();
		               
		                 
		               ArrayList<MenuDTO> mdto = dao.nabeList();
		               int[] rdnum = dao.Randomnum();
		               
		               System.out.println("  ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
		               System.out.print("              ");
		               for (int i = 0; i < 10; i++) {
		                  int index = rdnum[i];
		                  System.out.print(mdto.get(index).get재료() + "  \t");
		               }
		               System.out.println();
		               System.out.println("  ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞ ╯");
		              	System.out.println("  O");
		              	System.out.println("  °");
		              	System.out.println("  /}__/}");
		              	System.out.println("  ( • ▼•)");
		              	System.out.println("다섯가지 재료를 골라줘 !");
		              	System.out.println();

		               time1 = dao.nowtime(); // time1 게임시작 시간
		               dao.bgm_on();
		               String[] inputString = new String[5];
		               for (int i = 0; i < inputString.length; i++) {
		                  System.out.print(i + 1 + "번째 재료 : ");
		                  inputString[i] = sc.next();

		               }
		               time2 = dao.nowtime();// 게임 끝날때 시간
		               dao.bgm_off();
		               elapsetime =dao.elapse_time(time1, time2); 
		               
		               
		                  double time = elapsetime;
		                  int score = dao.sumscore(inputString, mdto);
		                  String id = input_id;
		                  
		                  System.out.println();
		                  System.out.println("  ꒰⚘݄꒱₊_____________________________________________");
		                  System.out.println("݄⿴݃*₊↷  닉네임 : " + nickname + "  점수 : " + score + "  시간: " + time);
		                  System.out.println();
		                  ScoreDTO sdto = new ScoreDTO(nickname, score, time, id);
		                  
		                  int row = dao.save(sdto);
		                  System.out.println("   [1]다시 게임하기     [2]메인화면으로");
		                 System.out.print("번호를 입력해주세요 : ");
		                  
		                  int inputreplay =  sc.nextInt();
		                  if(inputreplay ==2) break;
		                	 
		                  
		            } else {
		               System.out.println("잘못된 입력입니다.");
		            }
		            
		           
		            	
		            }
		            
		            
	   	         }else if(input_login_main_num==3) {//랭킹조회
	   	        	 while(true) {
	   	        	System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
		        	 
		        	 System.out.println();
		        	 System.out.println();
		        	    System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
		        		System.out.println("              |　고든램지의 요리교실　　　　　　　　　　　　　　　     [－][口][×] |");
		        		System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
		        		System.out.println("              |　         TOP 5 랭킹을 조회합니다  ദ്ദിᐢ._.ᐢ₎ 　　　               |");
		        		System.out.println("              |                                                        |");
		        		System.out.println("              |　　   　＿＿＿＿＿＿＿＿＿　　　　　　＿＿＿＿＿＿＿＿＿　　　|");
		        		System.out.println("              | 　　   ｜[1]전체 TOP5     |　 　 　 |[2]나의 TOP5     |　   |");
		        		System.out.println("              |　　　   ￣￣￣￣￣￣￣￣￣　　　　　　￣￣￣￣￣￣￣￣￣　　  |");
		        		System.out.println("              ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣  ");
		        		System.out.println();
		        		System.out.println();
		        		
		            System.out.print("번호를 입력해주세요 :");
		            int input_rank_num = sc.nextInt();

		            if (input_rank_num == 1) { // top5 랭킹 조회
		               ArrayList<ScoreDTO> dto = dao.Select();
		               System.out.println("                 ████████╗ ██████╗ ██████╗     ███████╗██╗██╗   ██╗███████╗ ");
		               System.out.println("                 ╚══██╔══╝██╔═══██╗██╔══██╗    ██╔════╝██║██║   ██║██╔════╝ ");
		               System.out.println("                    ██║   ██║   ██║██████╔╝    █████╗  ██║██║   ██║█████╗   ");
		               System.out.println("                    ██║   ██║   ██║██╔═══╝     ██╔══╝  ██║╚██╗ ██╔╝██╔══╝   ");
		               System.out.println("                    ██║   ╚██████╔╝██║         ██║     ██║ ╚████╔╝ ███████╗ ");
		               System.out.println("                    ╚═╝    ╚═════╝ ╚═╝         ╚═╝     ╚═╝  ╚═══╝  ╚══════╝ ");
		               System.out.println();
		               System.out.println();
		               System.out.println("                                ･ ﾟ ₊ ﾟ+ ♡ ♡ ᕬ ᕬ ♡ ♡ ･₊ + . ﾟ   ");
		               System.out.println("                                 + ･ﾟ + ♡ ( ⌯′-′⌯) ♡ + ･₊ ﾟ .･    ");
		               System.out.println(
		                     "              ┏━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ U U━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┓                ");
		               for (int i = 0; i < dto.size(); i++) {
		                  System.out.print("                  "+(i + 1) + "등 닉네임 : " + dto.get(i).getNickname());
		                  System.out.print("/ 점수 : " + dto.get(i).getScore());
		                  System.out.println("/ 시간 : " + dto.get(i).getTime());
		                  System.out.println("                     ✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧");
		               }
		               System.out
		                     .println("               ┗━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┛");
		               System.out.println();
		               
		              
		            } else if (input_rank_num == 2) { // 나의 랭킹 조회

		             
		               ArrayList<ScoreDTO> dto = dao.SelectMyScore(input_id);
		               System.out.println();
		               System.out.println("                                ･ ﾟ ₊ ﾟ+ ♡ ♡ ᕬ ᕬ ♡ ♡ ･₊ + . ﾟ   ");
		               System.out.println("                                 + ･ﾟ + ♡ ( ⌯′-′⌯) ♡ + ･₊ ﾟ .･    ");
		               System.out.println(
		                     "              ┏━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ U U━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┓                ");
		               for (int i = 0; i < dto.size(); i++) {
		                  System.out.print("                  "+(i + 1) + "등 닉네임 : " + dto.get(i).getNickname());
		                  System.out.print("/ 점수 : " + dto.get(i).getScore());
		                  System.out.println("/ 시간 : " + dto.get(i).getTime());
		                  System.out.println("              ------------------------------------------------");
		               }
		               System.out.println("               ┗━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┛");
		               System.out.println();
		            }
		            
		            System.out.println("   [1]뒤로가기    [2]메인화면으로");
	                 System.out.print("번호를 입력해주세요 : ");
	                  
	                  int inputreplay =  sc.nextInt();
	                  if(inputreplay ==2) break;
	   	        	 
	   	        	 }
	   	         }else if(input_login_main_num==4) {//종료
	   	        	 System.out.println("                 ┌───────────────┐   ");
	 	            System.out.println("                      종료합니다....        ");
	 	            System.out.println("                  └───────────────┘  ");
	 	            System.out.println("                        ᕱ ᕱ ||       ");
	 	            System.out.println("                       ( ･ω･ ||         ");
	 	            System.out.println("                     　 /　つΦ          ");
	 	            mainrun = false;
	 	            break;
	   	         }else {
	   	        	System.out.println(">>잘못된 입력입니다.");
	   	         }
	   	         
	            	 }
	             }

	         } else if (input_main_num == 2) {

	             System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	            System.out.println();
	            System.out.println("   ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ╮");
	            System.out.println("           ♡ 회원가입 ♡");
	            System.out.println("   ╰ ◟◞ ͜ ◟ ͜ ◟◞ ͜ ◟ ͜ ◟◞◟◞╯ ");
	            System.out.println("   ⠀⠀⠀⠀O                 ");
	            System.out.println("   ⠀⠀⠀⠀⠀°                ");
	            System.out.println("   〃o　 ()＿()          ");
	            System.out.println("   ‎⊂⌒（ ´ ^ ﻌ ^）      ");
	            System.out.println("   ヽ_っ＿/￣￣￣/        ");
	            System.out.println("   　 　 ＼/＿＿＿/      ");
	            while (true) {
	               System.out.print("ID를 입력하세요 :");
	               String join_id = sc.next();
	               if (dao.checkId(join_id) == false) {
	                  System.out.print("비밀번호를 입력하세요 :");
	                  String join_pw = sc.next();

	                  System.out.print("닉네임을 입력하세요 :");
	                  String join_nick = sc.next();

	                  // insert문

	                  DTO pdto = new DTO(join_id, join_pw, join_nick);

	                  int row = dao.joinmember(pdto);

	                  if (row > 0) {
	                     System.out.println("회원가입 성공!");
	                     break;
	                  } else {
	                     System.out.println("회원가입 실패!");
	                  }

	               } else {
	                  System.out.println("앗! id가중복되었습니다. 다시 입력해주세요~");
	               }
	            }
	         } else if (input_main_num == 3) {// 게임시작

	            
	        	System.out.println();
	        	System.out.println();
	            System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	            System.out.println();
	        	System.out.println();
	            System.out.println("    |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|                ");
	            System.out.println("                      _______ _______ __   __ _______   _______ _______ _______ ______ _______   ");
	            System.out.println("                     |       |   _   |  |_|  |       | |       |       |   _   |    _ |       |  ");
	            System.out.println("                     |    ___|  |_|  |       |    ___| |  _____|_     _|  |_|  |   | ||_     _|  ");
	            System.out.println("                     |   | __|       |       |   |___  | |_____  |   | |       |   |_||_|   |    ");
	            System.out.println("                     |   ||  |       |       |    ___| |_____  | |   | |       |    __  |   |    ");
	            System.out.println("                     |   |_| |   _   | ||_|| |   |___   _____| | |   | |   _   |   |  | |   |    ");
	            System.out.println("                     |_______|__| |__|_|   |_|_______| |_______| |___| |__| |__|___|  |_|___|    ");
	            System.out.println("    |＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿|                ");
	            System.out.println("                                               |    |                       ");
	            System.out.println("                                               |(•◡•)|                       ");
	            System.out.println();
	            System.out.println();
	            System.out.println();
	            System.out.println();
	            while(true) {
	            System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
	        	System.out.println("              |　고든램지의 요리교실　　　　　　　　　　　　　　　     [－][口][×] |");
	        	System.out.println("              |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|");
	        	System.out.println("              |　메뉴를 선택하면 게임이 시작됩니다　~　　　　                         |");
	        	System.out.println("              |  보기의 메뉴 중 5개를 골라 골라~~                                 |");
	        	System.out.println("              |  짧은시간안에 높은 점수 달성하기!　(✿˵•́ᴗ•̀˵)  　　　　　　　           |");
	        	System.out.println("              |　　　　＿＿＿＿＿＿　　　　＿＿＿＿＿　　　　＿＿＿＿＿　　　  |");
	        	System.out.println("              | 　　  ｜[1]샌드위치 |　  　｜[2]피자  ｜ 　   |[3]나베   |　 　　 |");
	        	System.out.println("              |　　　　￣￣￣￣￣￣　　　　￣￣￣￣￣　　　　￣￣￣￣￣　　　  |");
	        	System.out.println("              ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣  ");
	        	System.out.println();
	            System.out.print("번호를 입력해주세요 :");
	            int input_num_menu = sc.nextInt(); // 사용자가 선택한 메뉴

	            if (input_num_menu == 1) { // 샌드위치 선택시

	            	 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣶⣶⣶⠿⠿⠿⠿⠿⠿⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠛⠿⠿⠿⠿⠿⢶⣶⣶⣦⣤⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⣠⣾⡿⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠛⠛⠿⣷⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⣴⡿⠋⠀⠀⠀⠀⠀⠀⣠⠲⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡋⢹⡆⠀⠀⠀⢠⡀⠀⠀⠀⠀⠙⢿⣷⣄⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⢰⣿⠁⠀⠀⠀⠸⠇⠀⠀⠈⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠋⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠻⣿⣦⡀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣷⡀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠘⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣧⣀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠘⢿⣷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠆⠀⠀⠀⠀⠀⠀⠀⣸⣿⢸⣿⣿⣦⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⣨⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⠃⢸⣿⠋⣿⣇      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⢀⣾⡿⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣿⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣶⣶⡿⠿⠛⠁⠀⣼⣿⠀⢸⣿      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⣼⡟⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⢠⣾⡟⣿⠉⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡟⣿⠉⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⣀⣼⡿⠃⠀⣿⡏      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⢻⣷⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡏⠀⠀⣤⣶⣾⢿⣿⡀⢀⣾⡿⠁      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⣴⡿⠛⢰⣿⠃⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⣿⣀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⣿⣀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⣿⡏⠀⠀⣿⣷⣿⠟⠁⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⢸⣿⠁⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠙⠻⠿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠿⣿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⢀⣿⡇⠀⠀⣿⡏⠁⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⢸⣿⡀⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠛⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠁⠀⢸⣿⠀⠀⠀⢻⣷⣦⡀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⢀⣴⡿⠃⠀⣾⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⢸⣿⠀⠀⠀⠀⢨⣿⠃⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⢠⣿⠏⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣾⡿⠀⠀⠀⢠⣿⠏⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⣿⣏⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡿⠀⠀⣿⡇⠀⠀⠀⠈⣿⡇⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⢸⣿⡄⠀⠀⢠⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⣿⡇⠀⠀⢀⣼⡿⠁⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠻⣿⣄⠀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⢸⣿⠃⠀⠀⣿⣟⠁⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠘⢿⣧⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡇⠀⢸⣿⠀⠀⠀⣼⣿⣧⡀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠘⣿⣾⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠀⠀⣼⣿⠀⢀⣾⡿⣿⣿⣷⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠈⣿⡇⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⢔⢏⣿⣏⣠⣿⠟⠀⣿⣿⣿⡇⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⣿⡇⠀⠀⠸⣁⣼⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡉⣹⠀⠀⠀⠀⠀⠀⢀⡀⣸⣿⠀⠁⣿⡿⠛⠁⠀⠀⣿⣿⣿⡇⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⡄⠀⠈⠀⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠤⡀⠀⠀⠉⠁⠀⠀⠀⠀⠀⢐⠋⠀⣿⡇⠀⢠⣿⡇⠀⠀⢀⣼⣿⣿⣿⡇⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠸⣿⣦⣤⣤⣤⣤⣤⣄⣀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠚⠁⠀⠀⠀⠀⢀⠤⡄⠀⠀⠈⠧⠀⣿⡇⠀⢸⣿⣀⣀⣴⣾⣿⣿⣿⡿⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠘⢿⣯⡉⠉⠉⡉⡛⠛⠛⠛⠛⠛⠛⠿⠿⠿⠿⠿⠿⢿⣿⣶⣶⣶⣶⣶⣶⣶⣶⣦⣤⣤⣤⣤⣤⣼⣶⣃⣀⣀⣀⡀⢰⣿⠇⠀⢸⣿⣿⣿⣿⣿⣿⣿⠟⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠈⠻⣷⣄⣠⡙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠉⠉⠉⠉⡛⠟⠛⠛⠛⠛⠿⠿⠿⠀⠀⣾⣿⣿⣿⡿⠟⠋⠁⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⢿⣿⣿⣿⣿⡿⣿⣷⣶⣶⣶⣶⣶⣶⣶⣶⣤⣤⣤⣤⣤⣤⣤⣤⣤⣄⣀⣀⣀⣀⣋⣘⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⢀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⣿⣿⣿⣷⣤⣀⠀⠀⠀⠀⠀⣉⣩⣿⣿⣿⣿⠏⠉⠉⠉⠛⠛⠛⠛⠛⣻⣿⠟⠻⠿⠿⠿⠿⠿⠿⢿⣶⣶⣶⣿⡇⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⢿⣶⣤⣀⠀⠀⠀⣠⣾⣿⣧⣤⣤⣤⣤⣤⣤⣤⣤⣤⣀⣀⣀⣀⣀⣿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⠿⠿⠿⠿⠛⠋⠁⠀⠀⠀⠈⠙⠻⢿⣶⣾⠟⠁⠉⠉⠉⠉⠉⠉⠉⠉⠉⠛⠛⠛⠛⠛⠛⠛⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                 System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀      ");
	                  System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	                  System.out.println();
	                  
	                  
	                  
	                  ArrayList<MenuDTO> mdto = dao.sandwichList();
	               int[] rdnum = dao.Randomnum();
	               System.out.println("  ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
	               System.out.print("              ");
	               for (int i = 0; i < 10; i++) {
	                  int index = rdnum[i];
	                  System.out.print(mdto.get(index).get재료() + "  \t");
	               }
	               System.out.println();
	               System.out.println("  ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞ ╯");
	              	System.out.println("  O");
	              	System.out.println("  °");
	              	System.out.println("  /}__/}");
	              	System.out.println("  ( • ▼•)");
	              	System.out.println("다섯가지 재료를 골라줘 !");
	              	System.out.println();
	               

	               time1 = dao.nowtime(); // time1 게임시작 시간
	               dao.bgm_on();
	               String[] inputString = new String[5];
	               for (int i = 0; i < inputString.length; i++) {
	                  System.out.print(i + 1 + "번째 재료 : ");
	                  inputString[i] = sc.next();

	               }
	               time2 = dao.nowtime();// 게임 끝날때 시간
	               dao.bgm_off();

	               elapsetime =dao.elapse_time(time1, time2); // 경과 시간 출력
	              
	               
	               
	                   nickname = "비회원";
	                   int score = dao.sumscore(inputString, mdto);

	                   double time = elapsetime;
	                   String id = input_id;
	                   System.out.println();
	                   System.out.println("  ꒰⚘݄꒱₊_____________________________________________");
		                  System.out.println("݄⿴݃*₊↷  닉네임 : " + nickname + "  점수 : " + score + "  시간: " + time);
		                 System.out.println();
		                 
		                 System.out.println("   [1]다시 게임하기     [2]메인화면으로");
		                 System.out.print("번호를 입력해주세요 : ");
		                  
		                  int inputreplay =  sc.nextInt();
		                  if(inputreplay ==2) break;

	            } else if (input_num_menu == 2) { // 피자 선택시
	               System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⡀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠄⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠂⠤⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠠⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠐⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡎⠀⢀⣴⢖⡲⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢃⣀⣈⣉⣉⡙⠓⠧⣝⡳⢦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⡿⣿⡿⣿⣿⣄⠀⠻⣤⢸⡘⠿⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⡀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⣯⣿⣼⡿⠋⢹⣯⡷⣾⣷⠀⠈⠓⠮⣳⡤⣍⠛⡶⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢄⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⣿⣟⡗⠛⠺⣿⢷⣿⣳⣏⣿⣾⠂⠀⠀⠀⠀⠉⠉⠛⠲⢧⣜⡹⣒⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠡⡄⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁⠈⢯⣽⣿⣶⣾⣟⣯⣧⢀⣸⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⢮⣜⡓⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠈⠻⠷⣯⣼⣿⣾⡽⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠈⠙⢶⡙⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠄⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⠛⢿⣻⡿⣷⣦⡀⠙⢶⡱⡄⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣶⣶⣤⡀⠀⠀⠀⠀⠀⢠⣾⠟⣯⣿⣠⣼⢿⡝⠋⢻⣿⣆⠀⠻⣽⡀⠀⠀⠀⣠⡤⢦⠤⣄⠱⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣘⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⡿⠛⠛⠻⣿⣿⣦⣤⣄⡀⠀⢼⣿⣟⣿⡳⠛⣿⢿⣶⢶⡿⣯⡿⠀⠀⠙⠇⠀⣠⢞⡣⣙⠦⣙⠬⢻⡄        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣟⣯⠟⢉⣿⣿⣷⣄⠀⠀⠀⠀⠘⣿⣿⣦⡀⠀⠀⢿⣿⡿⠿⣿⣿⣧⠘⣿⣾⣽⣦⣴⣿⣻⣾⣩⣿⡷⠃⠀⠀⠀⠀⣼⢣⠚⣔⠣⣎⠥⣋⠥⡇        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⢠⣿⣟⣷⣯⣿⣟⡿⣯⣋⣀⣿⣧⠀⠀⣶⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠈⣿⣿⡇⠀⠙⠾⠷⢾⡯⠷⠿⠛⠁⠀⠀⠀⠀⠀⣰⢋⡖⡹⢌⠳⣌⢎⢥⢋⡇        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⡠⢺⣿⢾⣦⣀⣼⣾⣯⣽⣟⣿⣭⡏⠀⣼⣿⣿⠉⠀⠀⠀⢠⣶⣶⣦⣤⣴⣾⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⢴⣋⠮⠴⣙⠬⣓⢬⢪⠜⣪⠇        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⡰⠁⠈⢿⣯⣾⣟⣿⡉⠉⣻⣽⡾⠟⠁⠀⠹⣿⣿⣄⣀⣠⣴⣿⣿⠟⠿⠿⠟⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⢖⡺⡙⢯⡙⢦⠣⡜⡜⣱⢊⡵⢊⢦⢣⡙⢶⠀        ");
	               System.out.println( "   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀⠀⠀⠀⡔⠀⠀⠀⠀⠈⠑⠛⠾⠿⠟⠛⠉⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⢴⢺⡙⡜⣢⠵⡙⢦⡙⢦⡙⢦⡙⣤⠳⡌⣭⢢⣳⠜⠁⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⢲⣋⠯⣙⠜⣢⢍⠦⣃⢳⢂⢧⡙⢦⡙⢦⡙⢦⣱⡦⠷⠚⠋⠁⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⢣⢍⡣⢜⠲⣉⢮⡑⠮⡜⡱⣊⢭⠢⣝⣢⠽⠖⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⢖⡻⣙⠖⡶⠦⣤⢤⠴⣫⠵⣉⢦⠹⣌⠳⣡⠖⣩⠖⣭⠶⠕⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println( "   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣴⢲⠒⡖⣶⠚⡝⢢⢣⡖⢩⠚⣴⠙⣤⠋⡜⡆⢳⠘⡆⡏⣴⢫⣴⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println( "   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⡺⢍⡲⣉⢮⠱⣌⢣⠧⣩⠖⣸⡉⠶⣡⠓⣍⠮⣑⠮⣡⢏⠶⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println( "   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⣬⠱⢎⡱⢜⠢⢏⠴⣃⢮⡵⠮⢵⣘⢣⠥⣋⢆⡳⢡⣞⠍⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println( "   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⢸⣄⡀⠀⠀⠀⠀⣀⡤⡞⣍⠺⣄⣛⠬⣜⢪⡙⡜⢪⡼⠃⠀⠀⠀⠉⠺⠶⣱⣊⣴⠷⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠈⣧⠹⡖⢶⢲⡛⢥⡓⡼⠒⠋⠁⠈⠓⠮⠦⠷⠝⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println( "   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀⢸⡱⢎⢣⠖⣩⠖⣹⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println( "   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ⠀⠀⢿⣌⠣⢞⡡⢞⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⠣⣛⣦⣙⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ⠀⠀⠀⢀⡀⢉⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
	               System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	               System.out.println();
	              
	               
	               ArrayList<MenuDTO> mdto = dao.pizzaList();
	               int[] rdnum = dao.Randomnum();
	               System.out.println("  ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
	               System.out.print("              ");
	               for (int i = 0; i < 10; i++) {
	                  int index = rdnum[i];
	                  System.out.print(mdto.get(index).get재료() + "  \t");
	               }
	               System.out.println();
	               System.out.println("  ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞ ╯");
	              	System.out.println("  O");
	              	System.out.println("  °");
	              	System.out.println("  /}__/}");
	              	System.out.println("  ( • ▼•)");
	              	System.out.println("다섯가지 재료를 골라줘 !");
	              	System.out.println();

	               time1 = dao.nowtime(); // time1 게임시작 시간
	               dao.bgm_on();
	               String[] inputString = new String[5];
	               for (int i = 0; i < inputString.length; i++) {
	                  System.out.print(i + 1 + "번째 재료 : ");
	                  inputString[i] = sc.next();

	               }
	               time2 = dao.nowtime();// 게임 끝날때 시간
	               dao.bgm_off();

	               elapsetime =dao.elapse_time(time1, time2); // 경과 시간 출력
	               
	               
	                   nickname = "비회원";
	                   int score = dao.sumscore(inputString, mdto);

	                   double time = elapsetime;
	                   String id = input_id;

	                   System.out.println();
	                   System.out.println("  ꒰⚘݄꒱₊_____________________________________________");
		                 System.out.println("݄⿴݃*₊↷  닉네임 : " + nickname + "  점수 : " + score + "  시간: " + time);
		                 System.out.println();
		                 
		                 System.out.println("   [1]다시 게임하기     [2]메인화면으로");
		                 System.out.print("번호를 입력해주세요 : ");
		                  
		                  int inputreplay =  sc.nextInt();
		                  if(inputreplay ==2) break;

	            } else if (input_num_menu == 3) { // 나베 선택시
	            	 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣴⣴⣖⣶⣴⣦⣦⢤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠖⣋⡭⢿⣿⣿⣿⣿⣾⣿⣻⣿⣿⣻⣽⣷⣿⣿⢷⠲⢤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⢶⣿⡯⠖⡏⠁⠀⢸⣿⣿⣿⡏⡽⣿⣿⣿⣡⣿⢟⣿⡿⡿⢫⠓⠦⣌⡓⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⡵⠞⠁⠀⠀⠃⠀⠀⠸⣿⣿⣿⡿⣷⣿⣽⢣⣿⣿⣼⣿⡼⠁⢸⠀⠀⠂⠙⢶⣾⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⢻⡟⣩⠗⠲⢤⠀⠀⠀⠀⠀⠀⣿⣿⣿⢾⣿⠇⣸⢟⣿⣿⣿⠟⠀⠀⢀⣴⠖⢚⣉⠉⠻⡿⣏⣳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⢠⡾⣩⣿⡶⡇⣔⠃⡬⠧⣄⠀⠀⠀⠀⣸⠟⠾⠿⠿⣤⣷⣾⣿⣿⠏⠀⠀⠀⢸⠁⢜⣁⡀⣇⣠⡗⠈⢳⡌⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣏⡰⠳⣄⢀⣰⠃⠓⢈⡇⠀⠀⠀⠧⣙⣛⣛⡩⠝⠋⠉⢉⡻⢦⠀⠀⠀⢨⠞⢡⠔⠲⣤⠜⢋⡉⠙⢻⣎⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⢰⠏⡾⡁⡷⡀⣐⢦⠀⠈⣢⠤⠞⡇⠀⠀⠀⠀⠀⠀⠸⣠⠒⠚⠉⢁⡠⠋⠀⢀⣴⣻⣄⠑⠤⡜⢡⠞⠁⢨⠆⣸⠛⣆⢳⡀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⢠⠏⣼⠁⠀⣇⡀⠀⣠⠷⠚⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠉⠁⠀⠀⢀⣏⣄⣻⠈⠉⠒⣧⡀⠑⢚⣡⠴⠋⢀⣸⠞⠋⠉⠙⠢⡀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⡾⢰⠋⠉⠉⣉⣉⣉⡉⠉⠉⠉⠉⠉⠁⠀⢀⠴⠚⠉⢉⠛⢯⣟⠫⠭⣉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⡩⠛⠉⠉⠉⠉⠉⠒⡄⠀⠹⡄⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣠⣤⣤⣤⣤⠇⡞⠀⠀⣴⣿⣿⣿⣿⡆⠀⠀⠀⠀⡀⢰⠃⡤⢤⡠⡏⠀⠀⢹⠲⡀⠈⠑⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⢀⡤⠒⠒⠦⠇⠀⠀⢱⣤⡀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣿⣿⣿⠿⢿⠀⡇⠀⣀⣻⣿⣿⣿⣿⡇⣀⣀⡀⠀⡇⡇⠀⣉⣮⠤⠚⠛⠷⢎⡻⢡⠤⣄⠘⡄⠀⠀⠀⠀⢀⣠⠤⡤⠞⠋⣉⡦⠴⠟⠒⠒⢦⠀⠀⠀⢰⣿⣿⡇              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣿⣿⡗⠀⢸⠀⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡇⠸⡼⠋⠀⠀⠀⣠⡤⡤⣭⣌⠛⠁⢰⡁⠀⠀⠀⡔⠉⠀⠀⠈⢆⠞⠁⠀⠀⠀⠀⠀⠘⡆⠀⠀⣨⣿⣿⡇              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣿⣿⡿⠀⢸⡈⡿⣿⣯⣿⣿⣿⣿⣿⣿⣷⣿⣿⡿⡇⢰⠃⠀⣠⡶⠚⠁⠀⠀⠀⢀⡙⢦⡀⠈⢦⠀⠀⠣⣀⣀⠤⢚⣟⠤⣄⠀⠀⠀⠀⢀⡴⠃⠀⢸⡁⣿⣿⡇              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⣿⣿⣿⣿⣿⠁⣇⠙⠛⠟⣿⣿⣿⣿⣿⡝⠋⠉⠀⡇⠀⢣⡘⢾⠁⠀⠓⠸⠗⠠⠈⠁⠈⡯⠇⠈⡆⢰⠀⣠⠴⠚⢉⠀⣀⡾⠤⠤⠤⠾⢥⣀⣀⣀⣠⣿⣿⣿⡇              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠈⠛⠛⠛⠛⣇⢹⡀⠀⠀⢿⣿⣾⣿⣿⠇⠀⠀⠀⡇⠀⠀⠉⠺⡄⠤⠴⠆⣄⡀⢾⡶⣰⡳⢀⡜⠀⠀⢰⡁⠀⢀⡤⠚⠁⠀⠀⠀⠀⠀⢸⢃⡟⠛⠛⠛⠛⠋⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠸⡌⣇⣀⡀⣀⠙⠛⠛⢁⣀⣀⣀⣀⢃⠀⠀⠀⠀⠈⠓⠤⠤⠩⠭⠴⠚⠓⢚⣁⣀⠀⢀⣀⣉⣉⣉⣀⢀⡀⡀⠀⠀⠀⣀⣟⣼⠁⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⢳⡘⣏⠁⢤⡶⠯⣭⣟⢮⣻⣿⢿⡏⠃⠀⣀⣀⣀⡤⠖⠛⣲⠤⠤⢄⡀⠀⠀⠀⠀⠰⣽⠟⠛⢿⡿⠋⠙⢳⡠⠀⢠⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⢳⡘⣦⠘⣞⠭⠮⢋⡬⢽⢲⡎⡇⢠⠏⢀⢠⠞⠉⢭⠉⠠⠀⠀⠀⡉⢳⠀⠀⠀⢀⣧⠔⢲⠞⠉⢹⠋⠉⠙⣦⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠈⠳⣌⢧⣧⣻⠭⢂⣯⢽⣪⢳⡇⠘⢆⡀⠿⡐⠐⠊⣁⠀⣹⠢⠊⠙⠛⢤⣀⠀⢸⣇⠀⢈⡷⠒⠺⣤⣀⣴⠿⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣯⡉⢯⡺⠵⣢⡞⡇⠀⡞⢀⢦⢳⢠⠏⠀⢀⣤⠤⢧⡄⡄⢠⢸⠂⢸⡟⠉⠹⡄⠀⢀⣿⡾⣻⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢧⡽⢧⡉⠉⠉⠁⡇⠀⠙⠦⠼⡶⠚⠃⡒⠉⡄⠀⠀⠈⠳⡮⠋⠀⠘⢧⣀⣀⡾⣻⢿⣻⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠦⣝⠳⢤⣀⠁⠀⠀⠀⠀⡇⠀⢆⠃⣢⣀⡇⢀⢸⡼⠁⠀⠀⢀⢀⣫⣽⣿⡥⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠲⢬⣙⠲⠤⣤⣀⣉⠓⠋⠉⠀⠀⠉⠉⢉⣀⣀⡤⠴⣾⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠒⠲⠤⠭⣍⣉⣉⣉⣉⣉⣉⣩⠤⠴⠒⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ");
	                 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	                 System.out.println();
	                 
	                 
	               ArrayList<MenuDTO> mdto = dao.nabeList();
	               int[] rdnum = dao.Randomnum();
	               
	               System.out.println("  ╭ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝ ͡ ◜◝╮");
	               System.out.print("              ");
	               for (int i = 0; i < 10; i++) {
	                  int index = rdnum[i];
	                  System.out.print(mdto.get(index).get재료() + "  \t");
	               }
	               System.out.println();
	               System.out.println("  ╰ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ͜ ◟◞ ◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞◟◞ ͜ ◟◞ ╯");
	              	System.out.println("  O");
	              	System.out.println("  °");
	              	System.out.println("  /}__/}");
	              	System.out.println("  ( • ▼•)");
	              	System.out.println("다섯가지 재료를 골라줘 !");
	              	System.out.println();

	               time1 = dao.nowtime(); // time1 게임시작 시간
	               dao.bgm_on();
	               String[] inputString = new String[5];
	               for (int i = 0; i < inputString.length; i++) {
	                  System.out.print(i + 1 + "번째 재료 : ");
	                  inputString[i] = sc.next();

	               }
	               time2 = dao.nowtime();// 게임 끝날때 시간
	               dao.bgm_off();
	               elapsetime =dao.elapse_time(time1, time2); 
	               
	               
	                  nickname = "비회원";
	                  int score = dao.sumscore(inputString, mdto);

	                  double time = elapsetime;
	                  String id = input_id;

	                  System.out.println();
	                  System.out.println("  ꒰⚘݄꒱₊_____________________________________________");
	                  System.out.println("݄⿴݃*₊↷  닉네임 : " + nickname + "  점수 : " + score + "  시간: " + time);
	                  System.out.println();
	                  
	                  System.out.println("   [1]다시 게임하기     [2]메인화면으로");
		                 System.out.print("번호를 입력해주세요 : ");
		                  
		                  int inputreplay =  sc.nextInt();
		                  if(inputreplay ==2) break;
	            
	            } else {
	               System.out.println("잘못된 입력입니다.");
	            }
	            }
	         } else if (input_main_num == 4) {// 랭킹조회
	        	 System.out.println("。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
	        	 
	               ArrayList<ScoreDTO> dto = dao.Select();
	               System.out.println("                 ████████╗ ██████╗ ██████╗     ███████╗██╗██╗   ██╗███████╗ ");
	               System.out.println("                 ╚══██╔══╝██╔═══██╗██╔══██╗    ██╔════╝██║██║   ██║██╔════╝ ");
	               System.out.println("                    ██║   ██║   ██║██████╔╝    █████╗  ██║██║   ██║█████╗   ");
	               System.out.println("                    ██║   ██║   ██║██╔═══╝     ██╔══╝  ██║╚██╗ ██╔╝██╔══╝   ");
	               System.out.println("                    ██║   ╚██████╔╝██║         ██║     ██║ ╚████╔╝ ███████╗ ");
	               System.out.println("                    ╚═╝    ╚═════╝ ╚═╝         ╚═╝     ╚═╝  ╚═══╝  ╚══════╝ ");
	               System.out.println();
	               System.out.println();
	               System.out.println("                                ･ ﾟ ₊ ﾟ+ ♡ ♡ ᕬ ᕬ ♡ ♡ ･₊ + . ﾟ   ");
	               System.out.println("                                 + ･ﾟ + ♡ ( ⌯′-′⌯) ♡ + ･₊ ﾟ .･    ");
	               System.out.println(
	                     "              ┏━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ U U━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┓                ");
	               for (int i = 0; i < dto.size(); i++) {
	                  System.out.print("                  "+(i + 1) + "등 닉네임 : " + dto.get(i).getNickname());
	                  System.out.print("/ 점수 : " + dto.get(i).getScore());
	                  System.out.println("/ 시간 : " + dto.get(i).getTime());
	                  System.out.println("                     ✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧");
	               }
	               System.out
	                     .println("               ┗━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┛");
	               System.out.println();
	           
	               
	               System.out.println("   [1]메인화면으로");
	                 System.out.print("번호를 입력해주세요 : ");
	                  
	                  int inputreplay =  sc.nextInt();
	                  
	         } else if (input_main_num == 5) {// 종료하기

	            System.out.println("                 ┌───────────────┐   ");
	            System.out.println("                      종료합니다....        ");
	            System.out.println("                 └───────────────┘  ");
	            System.out.println("                        ᕱ ᕱ ||       ");
	            System.out.println("                       ( ･ω･ ||         ");
	            System.out.println("                     　 /　つΦ          ");
	            mainrun = false;
	            break;
	         } else { // 잘못된 번호 입력
	            System.out.println(">>잘못된 입력입니다.");
	         }

	      }    
	  
	
   }

}