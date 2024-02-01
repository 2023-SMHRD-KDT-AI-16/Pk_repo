package user_DTO;

import java.sql.Date;

public class ScoreDTO {

	String nickname;
	String score;
	Date playdate;
	int time;
	String id;
	
	
	public ScoreDTO(String nickname, Date playdate,String score, int time, String id) {
		super();
		this.nickname = nickname;
		this.playdate = playdate;
		this.score = score;
		this.time = time;
		this.id = id;
	}

	@Override
	public String toString() {
		return "ScoreDTO [nickname=" + nickname + ", playdate="+playdate+", score=" + score + ", time=" + time + ", id=" + id + "]";
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getPlaydate() {
		return playdate;
	}

	public void setPlaydate(Date playdate) {
		this.playdate = playdate;
	}
	
	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
