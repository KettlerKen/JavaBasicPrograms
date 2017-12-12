public class floatMath{
  
   public static float[] handleArgs(String args[]){
      int argLength = args.length;
      float[] numbers = new float[argLength] ;
      for(int i = 0; i < argLength; i++){
         numbers[i] = Float.parseFloat(args[i]);
      }
      return numbers;
   }
   
   public static void printNumProduct(float[] numbers){
      int numLength = numbers.length;
      float product = numbers[0];
      for(int i = 1; i < numLength; i++){
         product = product*numbers[i];
      }
      System.out.printf("Product of args is: %13.3f\n", product);
   }
  
   public static void main(String args[]){
      if(args.length < 1){
         System.out.printf("Bad user input");
      }else{
         float[] numbers = handleArgs(args);
         printNumProduct(numbers);
      }
   }
}