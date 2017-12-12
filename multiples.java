public class multiples{
   public static void printNumTable(int Num){
      for(int i = 1; i <= 10; i++){
         System.out.printf("%d X %d = %d\n",Num, i, (Num*i));
      }
   }

   public static void main(String args[]){
      if(args.length != 1){
         System.out.printf("Bad user input");
      }else{
         int myNum = Integer.parseInt(args[0]);
         printNumTable(myNum);
      }
   }
}