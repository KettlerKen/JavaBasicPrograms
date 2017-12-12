public class complexityAnalysis{
   public static void main(String args[]){
      int k = 5;
      int m;
      int p;
      int sum = 0;
      for(k=5; k <= 20; k++){
         for(m=k; m <= 20; m++){
            for(p=m; p <= 50; p++){
               sum += 1;
            }
         }
      }
      System.out.printf("%d", sum);
   }
}