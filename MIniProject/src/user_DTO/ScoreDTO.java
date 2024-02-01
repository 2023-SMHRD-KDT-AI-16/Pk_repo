package user_DTO;


public class ScoreDTO {
   String nickname;

   int score;
   double time;

   String id;
   
   
   

   public ScoreDTO(String nickname, int score, double time, String id) {
      super();
      this.nickname = nickname;
      this.score = score;
      this.time = time;
      this.id = id;
   }

   @Override
   public String toString() {
      return "ScoreDTO [nickname=" + nickname +", score=" + score + ", time=" + time + ", id=" + id + "]";
   }

   public String getNickname() {
      return nickname;
   }

   public void setNickname(String nickname) {
      this.nickname = nickname;
   }

   public int getScore() {

      return score;
   }

   public void setScore(int score) {
      this.score = score;
   }

   public double getTime() {
      return time;
   }
   public void setTime(double time) {
      this.time = time;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }
   
   
   

}