package user_DTO;

public class DTO {

	// 샌드위치 {{빵},{속재료},{소스}} 2차원 배열
	String[][] SandWich = { { "베이글", "식빵", "치아바타", "호밀", "플렛", "라이스페이퍼" },
			{ "양상추", "피클", "양파", "치즈", "베이컨", "토마토", "페퍼로니", "참치", "파인애플", "크레미" },
			{ "칠리", "허브드레싱", "갈릭디핑", "직화짜장", "핫소스", "마라", "겨자", "불닭", "치킨양념", "김칫국물" } };

	// 피자 {{도우},{토핑},{소스}} 2차원 배열
	String[][] Pizza = { { "또띠아", "치즈바이트", "나폴리", "팬", "씬", "라이스페이퍼", "난", "호떡", "옥수수도우" },
			{ "고구마", "멸치", "김치", "파인애플", "민트", "버섯", "새우", "립아이", "올리브", "베이컨" },
			{ "초콜릿", "토마토", "꿀", "핫소스", "케찹", "민트", "로제", "사워크림", "데리야끼", "김칫국물" } };

	// 전골 {{재료}, {소스}} 2차원 배열
	String[][] Nabe = { { "만두", "난자완스", "떡", "라면사리", "숙주", "두부", "버섯", "소고기", "미나리", "쑥갓", "노른자", "청경채", "당면", "곱창",
			"무", "마늘", "대파" }, { "마라", "로제", "크림", "민트", "초콜릿", "닭육수", "된장", "소유", "어묵국물", "김칫국물" } };

	// 샌드위치 getter / setter

	public String[][] getSandWitch() {
		return SandWich;
	}

	public void setSandWitch(String[][] sandWitch) {
		SandWich = sandWitch;
	}

	// 피자 getter / setter
	public String[][] getPizza() {
		return Pizza;
	}

	public void setPizza(String[][] pizza) {
		Pizza = pizza;
	}

	// 전골 getter / setter
	public String[][] getNabe() {
		return Nabe;
	}

	public void setNabe(String[][] nabe) {
		Nabe = nabe;
	}

}
