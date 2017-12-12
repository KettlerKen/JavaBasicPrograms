public class firstNonRepeatingCharacter{
   static char firstNotRepeatingCharacter(String s) {
      char[] alph = new char[26];
      int len = s.length();
      int currCharVal = 0;
      for(int i = 0; i < len; i++){
         currCharVal = Character.getNumericValue(s.charAt(i));
         currCharVal = currCharVal - 10;
         alph[currCharVal] = s.charAt(i)
         if(alph[currCharVal] != s.charAt(i)){
            return s.charAt(i);
         }
   }
   return '_';
}

   public static void main(String args[]){
      char s = firstNotRepeatingCharacter(args[0]);
      System.out.printf("%s", s);
   }
}