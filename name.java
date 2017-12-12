public class name{
   public static void main(String args[]){
      String name;
      if(args.length == 2)
         name = args[0] + " " + args[1];
      else if(args.length == 1)
         name = args[0];
      else
         name = "You Have Bad Arguments";
      System.out.printf("Hello \n%s", name); 
   }
}