package user_DTO;

public class DTO {

	private String id;
	private String password;
	private String nickname;
	
	String 요리명, 분류, 재료;
	int 점수;

	public DTO(String id, String password, String nickname) {
		super();
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String get요리명() {
		return 요리명;
	}
	public void set요리명(String 요리명) {
		this.요리명 = 요리명;
	}
	public String get분류() {
		return 분류;
	}
	public void set분류(String 분류) {
		this.분류 = 분류;
	}
	public String get재료() {
		return 재료;
	}
	public void set재료(String 재료) {
		this.재료 = 재료;
	}
	public int get점수() {
		return 점수;
	}
	public void set점수(int 점수) {
		this.점수 = 점수;
	}

}
