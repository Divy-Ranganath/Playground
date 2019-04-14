import java.util.Scanner;
class Main{
    static boolean areRotations(String str1, String str2) 
    { 
        return (str1.length() == str2.length()) &&  
               ((str1 + str1).contains(str2)); 
    } 
    public static void main(String[] args) 
    { 
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
  
        if (areRotations(str1, str2)) 
            System.out.println("Yes"); 
        else
            System.out.printf("No"); 
    } 
}