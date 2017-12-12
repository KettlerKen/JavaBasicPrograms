public class firstDuplicate{
   public static int findDuplicate(int[] a) {
       int i = 0;
       int curr = 0;
       int len = a.length;
       boolean found = false;
       while(i < len && !found){
           curr = a[abs(a[i])-1];
           if(curr < 0){
               found = true;
           }else{
               a[abs(a[i])-1] = curr * -1;
           }
           i++;
       }
       return (found ? abs(a[i-1]):-1);
}

   public static int abs(int x){
    if(x < 0){
        x = x*-1;
    }
    return x;
}
   public static void main(String args[]){
      int[] numbers = new int[] {2, 3, 3, 1, 5, 2};
      int num = -1;
      num = findDuplicate(numbers);
      System.out.printf("%d", num);
   }
}