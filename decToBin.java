public class decToBin{
   public static int[] handleArgs(String args[]){
      int argLength = args.length;
      int[] numbers = new int[argLength] ;
      for(int i = 0; i < argLength; i++){
         numbers[i] = Integer.parseInt(args[i]);
      }
      return numbers;
   }
   
   public static void decimalToBinary(int[] numbers){
      int numLength = numbers.length;
      int number;
      int binary[] = new int[20];
      for(int i = 0; i < numLength; i++){
         number = numbers[i];
         System.out.printf("%d\n", numbers[i]);
         int j = 19;
         for(i = 1; i <= number; i++){
            while(binary[j] != 0){
               j = j + 1;
            }
            binary[j] = 0;
            while(binary[j] == 1){
               binary[j] = 0;
               j = j - 1;
            }
            binary[j] = 1;
         }
         int printlen = binary.length;
         for(int k = 0; k < printlen; k++){
            System.out.printf("%d", binary[k]);
         }
         System.out.printf("\n");
      }
   }
  
   public static void main(String args[]){
      if(args.length < 1){
         System.out.printf("Bad user input");
      }else{
         int[] numbers = handleArgs(args);
         decimalToBinary(numbers);
      }
   }
}