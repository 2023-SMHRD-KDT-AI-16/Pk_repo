package user_view;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import user_DAO.DAO;
import user_DTO.MenuDTO;

public class View {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();

		long millis = System.currentTimeMillis();
		long time1 = 0;
		long time2 = 0;

		System.out.println();
		System.out.println("               ╔═╗┌─┐┬─┐┌┬┐┌─┐┌┐┌  ╦═╗┌─┐┌┬┐┌─┐┌─┐┬ ┬");
		System.out.println("               ║ ╦│ │├┬┘ │││ ││││  ╠╦╝├─┤│││└─┐├─┤└┬┘");
		System.out.println("               ╚═╝└─┘┴└──┴┘└─┘┘└┘  ╩╚═┴ ┴┴ ┴└─┘┴ ┴ ┴ ");
		System.out.println("               ╔═╗┌─┐┌─┐┬┌─┬┌┐┌┌─┐  ┌─┐┬  ┌─┐┌─┐┌─┐  ");
		System.out.println("               ║  │ ││ │├┴┐│││││ ┬  │  │  ├─┤└─┐└─┐  ");
		System.out.println("               ╚═╝└─┘└─┘┴ ┴┴┘└┘└─┘  └─┘┴─┘┴ ┴└─┘└─┘  ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		while (true) {

			System.out.println("=========================================================================");
			System.out.println("                          <고든램지의 요리교실>");
			System.out.println("[1]로그인 [2]회원가입 [3]게임시작 [4]랭킹조회 [5]종료");

			// 사용자 번호 선택
			System.out.print("번호를 입력해주세요 :  ");
			int input_main_num = sc.nextInt();

			if (input_main_num == 1) { // 로그인
				System.out.println("=========================================================================");
				System.out.println("  <로그인>");
				System.out.print("ID : ");
				String input_id = sc.next();
				System.out.print("PW : ");
				String input_pw = sc.next();

			} else if (input_main_num == 2) { // 회원가입

				System.out.println("=========================================================================");
				System.out.println("  <회원가입>");
				System.out.println("ID : ");

				System.out.println("PW : ");

			} else if (input_main_num == 3) {// 게임시작
				//time1 = dao.nowtime(); // time1 게임시작 시간
				System.out.println("=========================================================================");

				System.out.println("	 ██████  █████ ███    ██████████    ████████████████████ ██████████████     ");
				System.out.println("	██      ██   ██████  ██████         ██        ██  ██   ████   ██  ██        ");
				System.out.println("	██   ████████████ ████ ███████      ███████   ██  █████████████   ██        ");
				System.out.println("	██    ████   ████  ██  ████              ██   ██  ██   ████   ██  ██        ");
				System.out.println("	 ██████ ██   ████      █████████    ███████   ██  ██   ████   ██  ██        ");
				System.out.println();
				System.out.println();

				System.out.println("메뉴를 선택해주세요 ");
				System.out.println("[1]샌드위치  [2]피자  [3]나베 ");
				System.out.print("번호를 입력해주세요 :");
				int input_num_menu = sc.nextInt(); // 사용자가 선택한 메뉴
				
				if (input_num_menu == 1) {
					
					
					
					
					
					
					
				} else if (input_num_menu == 2) {

				} else if (input_num_menu == 3) {

				} else {
					System.out.println("잘못된 입력입니다.");
				}

			} else if (input_main_num == 4) {// 랭킹조회
				System.out.println("=========================================================================");

				System.out.println("   ████████╗ ██████╗ ██████╗     ███████╗██╗██╗   ██╗███████╗ ");
				System.out.println("   ╚══██╔══╝██╔═══██╗██╔══██╗    ██╔════╝██║██║   ██║██╔════╝ ");
				System.out.println("      ██║   ██║   ██║██████╔╝    █████╗  ██║██║   ██║█████╗   ");
				System.out.println("      ██║   ██║   ██║██╔═══╝     ██╔══╝  ██║╚██╗ ██╔╝██╔══╝   ");
				System.out.println("      ██║   ╚██████╔╝██║         ██║     ██║ ╚████╔╝ ███████╗ ");
				System.out.println("      ╚═╝    ╚═════╝ ╚═╝         ╚═╝     ╚═╝  ╚═══╝  ╚══════╝ ");

			} else if (input_main_num == 5) {// 종료하기
				//time2 = dao.nowtime();// 게임 끝날때 시간
				//dao.elapse_time(time1, time2); // 경과 시간 출력

				break;
			} else { // 잘못된 번호 입력
				System.out.println(">>잘못된 입력입니다.");
			}

		}

	}
}
