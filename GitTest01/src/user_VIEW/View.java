package user_VIEW;

import java.util.Scanner;

import user_DAO.DAO;

public class View {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DAO dao = new DAO();
		
		System.out.println();
System.out.println("               ╔═╗┌─┐┬─┐┌┬┐┌─┐┌┐┌  ╦═╗┌─┐┌┬┐┌─┐┌─┐┬ ┬");
System.out.println("               ║ ╦│ │├┬┘ │││ ││││  ╠╦╝├─┤│││└─┐├─┤└┬┘");
System.out.println("               ╚═╝└─┘┴└──┴┘└─┘┘└┘  ╩╚═┴ ┴┴ ┴└─┘┴ ┴ ┴ ");
System.out.println("               ╔═╗┌─┐┌─┐┬┌─┬┌┐┌┌─┐  ┌─┐┬  ┌─┐┌─┐┌─┐  ");
System.out.println("               ║  │ ││ │├┴┐│││││ ┬  │  │  ├─┤└─┐└─┐  ");
System.out.println("               ╚═╝└─┘└─┘┴ ┴┴┘└┘└─┘  └─┘┴─┘┴ ┴└─┘└─┘  ");
		
while(true) {

System.out.println("=========================================================================");
System.out.println("                          <고든램지의 요리교실>");
System.out.println("[1]로그인 [2]회원가입 [3]게임시작 [4]랭킹조회 [5]종료" );

	//사용자 번호 선택
	System.out.print("번호를 입력해주세요 :  ");	
	int input_main_num = sc.nextInt();
	
	
	if(input_main_num ==1 ) {  //로그인
		System.out.println("=========================================================================");
		System.out.println("  <로그인>");
		System.out.print("ID : ");
		String input_id = sc.next();
		System.out.print("PW : ");
		String input_pw = sc.next();
		
	}else if ( input_main_num==2) { //회원가입
		
		System.out.println("=========================================================================");
		System.out.println("  <회원가입>");
		System.out.println("ID : ");
		
		System.out.println("PW : ");
		
		
	}else if(input_main_num ==3) {//게임시작
		System.out.println("=========================================================================");
		
		
		System.out.println("	 ██████  █████ ███    ██████████    ████████████████████ ██████████████     ");
		System.out.println("	██      ██   ██████  ██████         ██        ██  ██   ████   ██  ██        ");
		System.out.println("	██   ████████████ ████ ███████      ███████   ██  █████████████   ██        ");
		System.out.println("	██    ████   ████  ██  ████              ██   ██  ██   ████   ██  ██        ");
		System.out.println("	 ██████ ██   ████      █████████    ███████   ██  ██   ████   ██  ██        ");
		
		
	}else if(input_main_num==4) {//랭킹조회
		System.out.println("=========================================================================");
		

   System.out.println("   ████████╗ ██████╗ ██████╗     ███████╗██╗██╗   ██╗███████╗ ");
   System.out.println("   ╚══██╔══╝██╔═══██╗██╔══██╗    ██╔════╝██║██║   ██║██╔════╝ ");
   System.out.println("      ██║   ██║   ██║██████╔╝    █████╗  ██║██║   ██║█████╗   ");
   System.out.println("      ██║   ██║   ██║██╔═══╝     ██╔══╝  ██║╚██╗ ██╔╝██╔══╝   ");
   System.out.println("      ██║   ╚██████╔╝██║         ██║     ██║ ╚████╔╝ ███████╗ ");
   System.out.println("      ╚═╝    ╚═════╝ ╚═╝         ╚═╝     ╚═╝  ╚═══╝  ╚══════╝ ");
                                                          

		
	}else if(input_main_num==5){//종료하기
		
		
		break;
	}else { //잘못된 번호 입력 
		System.out.println(">>잘못된 입력입니다.");
	}
	


		}

	}

}
