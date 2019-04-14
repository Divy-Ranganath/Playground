import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in =new Scanner(System.in);
      String str=in.nextLine();
      String reverse="";
      int len=str.length();
     for ( int i = len- 1; i >= 0; i-- )  
         reverse = reverse + str.charAt(i);  
      if(str.equals(reverse)==true)
        System.out.println("Yes");
      else
        System.out.println("No");
          
    } 
}