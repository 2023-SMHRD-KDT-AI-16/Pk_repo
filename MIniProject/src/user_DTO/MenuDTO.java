package user_DTO;

public class MenuDTO {
	
	
	String 요리명, 분류, 재료;
	
	public MenuDTO(String 요리명, String 분류, String 재료) {
		super();
		this.분류 = 분류;
		this.요리명 = 요리명;
		this.재료 = 재료;
		// TODO Auto-generated constructor stub
	}

	public String get요리명() {
		return 요리명;
	}

	public String get분류() {
		return 분류;
	}

	public String get재료() {
		return 재료;
	}

	public void set요리명(String 요리명) {
		this.요리명 = 요리명;
	}

	public void set분류(String 분류) {
		this.분류 = 분류;
	}

	public void set재료(String 재료) {
		this.재료 = 재료;
	}

	
	
	
	
}
