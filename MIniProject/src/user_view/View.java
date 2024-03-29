package user_view;

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
      System.out.println();
      System.out.println("               ╔═╗┌─┐┬─┐┌┬┐┌─┐┌┐┌  ╦═╗┌─┐┌┬┐┌─┐┌─┐┬ ┬");
      System.out.println("               ║ ╦│ │├┬┘ │││ ││││  ╠╦╝├─┤│││└─┐├─┤└┬┘");
      System.out.println("               ╚═╝└─┘┴└──┴┘└─┘┘└┘  ╩╚═┴ ┴┴ ┴└─┘┴ ┴ ┴ ");
      System.out.println("               ╔═╗┌─┐┌─┐┬┌─┬┌┐┌┌─┐  ┌─┐┬  ┌─┐┌─┐┌─┐  ");
      System.out.println("               ║  │ ││ │├┴┐│││││ ┬  │  │  ├─┤└─┐└─┐  ");
      System.out.println("               ╚═╝└─┘└─┘┴ ┴┴┘└┘└─┘  └─┘┴─┘┴ ┴└─┘└─┘  ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⢠⡴⣴⣴⢶⣤⣀⣤⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⣠⣙⢾⣧⣁⣲⣦⢮⣵⣿⣷⡏⢿⣦⡠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠈⣾⣿⣿⡿⣿⣷⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣟⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣻⣿⣿⣿⣿⣿⡿⠟⠛⠛⠻⠿⢿⠿⢿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣹⣿⣿⡟⠋⠀⠀⠀⠀⠀⠀⠀⢀⡹⢾⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⡿⠀⠀⠀⠀⠀⠀⠒⠀⠁⣀⣩⠟⣲⣯⢿⣯⣿⢻⡟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⡀⠀⠀⠐⢚⣉⣥⣿⣻⢿⣿⣦⢁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢣⣿⠀⢀⠄⠾⣯⣀⡇⢧⣴⣾⣟⣉⣹⣿⣿⡇⢿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣮⣿⡆⢀⡴⠾⢿⠏⠀⢈⣿⡯⢍⠉⠿⠋⠱⣷⡈⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢏⡎⠀⠀⠀⠀⣠⠄⠀⢈⣿⡿⣄⡀⠀⠀⣷⣿⠀⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢣⡂⠀⠀⣰⠏⠠⠦⠾⢿⣿⢿⣿⣤⠰⣿⣿⣧⣸⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣄⢃⢰⢸⡏⣄⡤⠤⠤⠖⢶⣻⣿⡿⠃⣿⠋⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡀⠀⡐⠀⠙⠯⢝⡏⠿⢿⣭⡗⢠⠇⣸⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⠀⠀⠀⠀⠀⠀⠀⠀⣿⡿⢀⣾⢰⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡰⡀⠀⠀⠀⢀⠐⠜⣡⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠈⠙⢦⣤⣤⣤⣴⣾⣿⣿⣿⠻⣝⣻⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣴⣿⣧⠰⠀⠀⠹⠅⠈⠀⢀⠘⣿⡀⢷⡹⣿⡟⣯⣼⣿⣿⣶⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⠀⠀⠀⠀⣀⣤⣤⣴⣶⣿⣿⣿⣿⣿⣿⡀⠀⠀⠈⠀⠐⠒⠒⣉⡉⠀⠀⡟⣿⡹⣰⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣄⣀⠀⠀⠀⠀⠀       ");
      System.out.println("           ⠀⠀⣠⣴⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠁⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⣿⣵⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣶⣦⣀       ");
      System.out.println("           ⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣌⣄⣀⣀⣤⣴⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      System.out.println("           ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿       ");
      boolean mainrun = true;
      while (mainrun) {

         System.out.println(
               "。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜。.。:+* ゜ ゜゜ *+:。.。:+* ゜ ゜゜ *+:。.。.。:+* ゜ ゜゜");
         System.out.println("                          <고든램지의 요리교실>");
         System.out.println("[1]로그인 [2]회원가입 [3]게임시작 [4]랭킹조회 [5]종료");

         // 사용자 번호 선택
         System.out.print("번호를 입력해주세요 :  ");
         int input_main_num = sc.nextInt();

         if (input_main_num == 1) { // 로그인
            System.out.println("=========================================================================");
            String run = "1";

            while (true) {
               System.out.println("  <로그인>");
               System.out.print("ID : ");
               input_id = sc.next();
               System.out.print("PW : ");
               input_pw = sc.next();
               nickname = dao.login(input_id, input_pw);
               if (run != null) {
                  System.out.println(run);
                  break;
               }

               if (run.equals("0")) {
                  count++;
               }
               if (count > 2) {
                  System.out.println("로그인 기회가 모두 소진되었습니다!");
                  mainrun = false;
                  break;
               }
               System.out.println(count + "/3");
            }

         } else if (input_main_num == 2) {

            System.out.println("=========================================================================");
            System.out.println("  <회원가입>");
            while (true) {
               System.out.print("이름을 입력하세요 :");
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
                     System.out.println("입력성공");
                     break;
                  } else {
                     System.out.println("입력실패");
                  }

               } else {
                  System.out.println("id가중복되었습니다.");
               }
            }
         } else if (input_main_num == 3) {// 게임시작

            System.out.println("=========================================================================");

            System.out.println("    ██████  █████ ███    ██████████    ████████████████████ ██████████████     ");
            System.out.println("   ██      ██   ██████  ██████         ██        ██  ██   ████   ██  ██        ");
            System.out.println("   ██   ████████████ ████ ███████      ███████   ██  █████████████   ██        ");
            System.out.println("   ██    ████   ████  ██  ████              ██   ██  ██   ████   ██  ██        ");
            System.out.println("    ██████ ██   ████      █████████    ███████   ██  ██   ████   ██  ██        ");
            System.out.println();
            System.out.println();

            System.out.println("메뉴를 선택해주세요 ");
            System.out.println("[1]샌드위치  [2]피자  [3]나베 ");
            System.out.print("번호를 입력해주세요 :");
            int input_num_menu = sc.nextInt(); // 사용자가 선택한 메뉴

            if (input_num_menu == 1) { // 샌드위치 선택시

               ArrayList<MenuDTO> mdto = dao.sandwichList();
               int[] rdnum = dao.Randomnum();
               for (int i = 0; i < 10; i++) {
                  int index = rdnum[i];
                  System.out.print(mdto.get(index).get재료() + "  \t");
               }
               System.out.println();

               time1 = dao.nowtime(); // time1 게임시작 시간

               String[] inputString = new String[5];
               for (int i = 0; i < inputString.length; i++) {
                  System.out.print(i + 1 + "번째 재료 : ");
                  inputString[i] = sc.next();

               }
               time2 = dao.nowtime();// 게임 끝날때 시간

               System.out.println(dao.sumscore(inputString, mdto));

               elapsetime =dao.elapse_time(time1, time2); // 경과 시간 출력
               System.out.println(elapsetime); 

            } else if (input_num_menu == 2) { // 피자 선택시

               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⡀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠄⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠂⠤⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠠⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠐⠤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡎⠀⢀⣴⢖⡲⢤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠢⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢃⣀⣈⣉⣉⡙⠓⠧⣝⡳⢦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⡿⣿⡿⣿⣿⣄⠀⠻⣤⢸⡘⠿⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⡀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⡿⣯⣿⣼⡿⠋⢹⣯⡷⣾⣷⠀⠈⠓⠮⣳⡤⣍⠛⡶⢤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢄⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⣿⣟⡗⠛⠺⣿⢷⣿⣳⣏⣿⣾⠂⠀⠀⠀⠀⠉⠉⠛⠲⢧⣜⡹⣒⢦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠡⡄⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁⠈⢯⣽⣿⣶⣾⣟⣯⣧⢀⣸⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠓⢮⣜⡓⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠈⠻⠷⣯⣼⣿⣾⡽⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⡀⠀⠈⠙⢶⡙⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠄⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣾⣿⠛⢿⣻⡿⣷⣦⡀⠙⢶⡱⡄⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠊⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣶⣶⣤⡀⠀⠀⠀⠀⠀⢠⣾⠟⣯⣿⣠⣼⢿⡝⠋⢻⣿⣆⠀⠻⣽⡀⠀⠀⠀⣠⡤⢦⠤⣄⠱⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣘⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⡿⠛⠛⠻⣿⣿⣦⣤⣄⡀⠀⢼⣿⣟⣿⡳⠛⣿⢿⣶⢶⡿⣯⡿⠀⠀⠙⠇⠀⣠⢞⡣⣙⠦⣙⠬⢻⡄        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣟⣯⠟⢉⣿⣿⣷⣄⠀⠀⠀⠀⠘⣿⣿⣦⡀⠀⠀⢿⣿⡿⠿⣿⣿⣧⠘⣿⣾⣽⣦⣴⣿⣻⣾⣩⣿⡷⠃⠀⠀⠀⠀⣼⢣⠚⣔⠣⣎⠥⣋⠥⡇        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⢠⣿⣟⣷⣯⣿⣟⡿⣯⣋⣀⣿⣧⠀⠀⣶⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠈⣿⣿⡇⠀⠙⠾⠷⢾⡯⠷⠿⠛⠁⠀⠀⠀⠀⠀⣰⢋⡖⡹⢌⠳⣌⢎⢥⢋⡇        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⡠⢺⣿⢾⣦⣀⣼⣾⣯⣽⣟⣿⣭⡏⠀⣼⣿⣿⠉⠀⠀⠀⢠⣶⣶⣦⣤⣴⣾⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⢴⣋⠮⠴⣙⠬⣓⢬⢪⠜⣪⠇        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⡰⠁⠈⢿⣯⣾⣟⣿⡉⠉⣻⣽⡾⠟⠁⠀⠹⣿⣿⣄⣀⣠⣴⣿⣿⠟⠿⠿⠟⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⢖⡺⡙⢯⡙⢦⠣⡜⡜⣱⢊⡵⢊⢦⢣⡙⢶⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⡔⠀⠀⠀⠀⠈⠑⠛⠾⠿⠟⠛⠉⠀⠀⠀⠀⠀⠙⠿⣿⣿⣿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⢴⢺⡙⡜⣢⠵⡙⢦⡙⢦⡙⢦⡙⣤⠳⡌⣭⢢⣳⠜⠁⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡴⢲⣋⠯⣙⠜⣢⢍⠦⣃⢳⢂⢧⡙⢦⡙⢦⡙⢦⣱⡦⠷⠚⠋⠁⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠜⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⢣⢍⡣⢜⠲⣉⢮⡑⠮⡜⡱⣊⢭⠢⣝⣢⠽⠖⠛⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⢖⡻⣙⠖⡶⠦⣤⢤⠴⣫⠵⣉⢦⠹⣌⠳⣡⠖⣩⠖⣭⠶⠕⠚⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣴⢲⠒⡖⣶⠚⡝⢢⢣⡖⢩⠚⣴⠙⣤⠋⡜⡆⢳⠘⡆⡏⣴⢫⣴⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⡺⢍⡲⣉⢮⠱⣌⢣⠧⣩⠖⣸⡉⠶⣡⠓⣍⠮⣑⠮⣡⢏⠶⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⢰⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⣬⠱⢎⡱⢜⠢⢏⠴⣃⢮⡵⠮⢵⣘⢣⠥⣋⢆⡳⢡⣞⠍⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⢸⣄⡀⠀⠀⠀⠀⣀⡤⡞⣍⠺⣄⣛⠬⣜⢪⡙⡜⢪⡼⠃⠀⠀⠀⠉⠺⠶⣱⣊⣴⠷⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠈⣧⠹⡖⢶⢲⡛⢥⡓⡼⠒⠋⠁⠈⠓⠮⠦⠷⠝⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⢸⡱⢎⢣⠖⣩⠖⣹⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⢿⣌⠣⢞⡡⢞⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⠣⣛⣦⣙⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");
               System.out.println(
                     "         ⠀⠀⠀⢀⡀⢉⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀        ");

               ArrayList<MenuDTO> mdto = dao.pizzaList();
               int[] rdnum = dao.Randomnum();
               for (int i = 0; i < 10; i++) {
                  int index = rdnum[i];
                  System.out.print(mdto.get(index).get재료() + "  \t");
               }
               System.out.println();

               time1 = dao.nowtime(); // time1 게임시작 시간

               String[] inputString = new String[5];
               for (int i = 0; i < inputString.length; i++) {
                  System.out.print(i + 1 + "번째 재료 : ");
                  inputString[i] = sc.next();

               }
               time2 = dao.nowtime();// 게임 끝날때 시간

               System.out.println(dao.sumscore(inputString, mdto));

               elapsetime =dao.elapse_time(time1, time2); // 경과 시간 출력
               System.out.println(elapsetime); 

            } else if (input_num_menu == 3) { // 나베 선택시
               ArrayList<MenuDTO> mdto = dao.nabeList();
               int[] rdnum = dao.Randomnum();
               for (int i = 0; i < 10; i++) {
                  int index = rdnum[i];
                  System.out.print(mdto.get(index).get재료() + "  \t");
               }
               System.out.println();

               time1 = dao.nowtime(); // time1 게임시작 시간

               String[] inputString = new String[5];
               for (int i = 0; i < inputString.length; i++) {
                  System.out.print(i + 1 + "번째 재료 : ");
                  inputString[i] = sc.next();

               }
               time2 = dao.nowtime();// 게임 끝날때 시간

               System.out.println(dao.sumscore(inputString, mdto));

               elapsetime =dao.elapse_time(time1, time2); // 경과 시간 출력
               System.out.println(elapsetime);
               
               if (input_id == null) {
                  nickname = "user1";
                  int score = dao.sumscore(inputString, mdto);

                  double time = elapsetime;
                  String id = input_id;

                  System.out.println("결과 확인" + "유저이름" + nickname + "점수" + score + "시간" + time);

               } else {
                  
                  double time = elapsetime;
                  int score = dao.sumscore(inputString, mdto);
                  String id = input_id;
                  
                  System.out.println("결과 확인" + "유저이름" + nickname + "점수" + score + "시간" + time);
                  ScoreDTO sdto = new ScoreDTO(nickname, score, time, id);
                  
                  int row = dao.save(sdto);
                  
                  if (row > 0) {
                     System.out.println("저장성공");
                     break;
                  } else {
                     System.out.println("저장실패");
                  }

               }

            } else {
               System.out.println("잘못된 입력입니다.");
            }

         } else if (input_main_num == 4) {// 랭킹조회
            System.out.println("=========================================================================");

            System.out.println("[1]TOP 5 랭킹 조회  [2]나의 랭킹 조회");
            System.out.print("번호를 입력해주세요 :");
            int input_rank_num = sc.nextInt();

            if (input_rank_num == 1) { // top5 랭킹 조회
               ArrayList<ScoreDTO> dto = dao.Select();
               System.out.println("   ████████╗ ██████╗ ██████╗     ███████╗██╗██╗   ██╗███████╗ ");
               System.out.println("   ╚══██╔══╝██╔═══██╗██╔══██╗    ██╔════╝██║██║   ██║██╔════╝ ");
               System.out.println("      ██║   ██║   ██║██████╔╝    █████╗  ██║██║   ██║█████╗   ");
               System.out.println("      ██║   ██║   ██║██╔═══╝     ██╔══╝  ██║╚██╗ ██╔╝██╔══╝   ");
               System.out.println("      ██║   ╚██████╔╝██║         ██║     ██║ ╚████╔╝ ███████╗ ");
               System.out.println("      ╚═╝    ╚═════╝ ╚═╝         ╚═╝     ╚═╝  ╚═══╝  ╚══════╝ ");
               System.out.println();
               System.out.println();
               System.out.println("                  ･ ﾟ ₊ ﾟ+ ♡ ♡ ᕬ ᕬ ♡ ♡ ･₊ + . ﾟ   ");
               System.out.println("                   + ･ﾟ + ♡ ( ⌯′-′⌯) ♡ + ･₊ ﾟ .･    ");
               System.out.println(
                     "┏━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ U U━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┓                ");
               for (int i = 0; i < dto.size(); i++) {
                  System.out.print(i + 1 + "등 nick : " + dto.get(i).getNickname());
                  System.out.print("/ score : " + dto.get(i).getScore());
                  System.out.println("/ time : " + dto.get(i).getTime());
                  System.out.println("       ✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧⋄⋆⋅⋆⋄✧");
               }
               System.out
                     .println(" ┗━ ʚෆɞ ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━ ʚෆɞ ━┛");
               System.out.println();
            } else if (input_rank_num == 2) { // 나의 랭킹 조회

               if (input_id == null) {
                  System.out.println("비회원입니다. 지난 랭킹을 조회하시려면 로그인 해주세요.");
               }

               ArrayList<ScoreDTO> dto = dao.SelectMyScore(input_id);

               for (int i = 0; i < dto.size(); i++) {
                  System.out.print(i + 1 + " nick : " + dto.get(i).getNickname());
                  System.out.print("/ score : " + dto.get(i).getScore());
                  System.out.println("/ time : " + dto.get(i).getTime());
                  System.out.println("------------------------------------------------");
               }

            }

         } else if (input_main_num == 5) {// 종료하기

            System.out.println("                ┌───────────────┐   ");
            System.out.println("                      종료합니다....        ");
            System.out.println("                 └───────────────┘  ");
            System.out.println("                       ᕱ ᕱ ||       ");
            System.out.println("                       ( ･ω･ ||         ");
            System.out.println("                     　 /　つΦ          ");
            break;
         } else { // 잘못된 번호 입력
            System.out.println(">>잘못된 입력입니다.");
         }

      }

   }

}