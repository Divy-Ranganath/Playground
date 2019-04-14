import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String repl=in.nextLine();
      String incl=in.nextLine();
      Boolean a=(str.contains(repl));
      if(a==true)
        System.out.println(str.replace(repl,incl));
    }
}