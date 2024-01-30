import java.util.Random;

public class RandomPizzaSelection {

    public static void main(String[] args) {
       int points = 0;
       pizzatime pzt = new pizzatime();
       
       int count = pzt.ingredients.length; 
      int a[] = new int[count];
      Random r = new Random();
         
      for(int i=0; i<count; i++){
         a[i] = r.nextInt(pzt.ingredients.length);
         for(int j=0; j<i; j++){
            if(a[i] == a[j]){
               i--;
            }
         }
      }
      for(int i=0; i<2; i++){
         
         
         System.out.println(pzt.ingredients[a[i]]);
         
         if(pzt.ingredients[a[i]].equals("가나다")) {
            
            points=+2;
            
            
         }
         
      }System.out.println("점수계산테스트");
      
      System.out.println(points);
       
       
       
    }
}