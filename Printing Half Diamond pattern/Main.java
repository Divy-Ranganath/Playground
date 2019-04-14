import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int space=n;space>i+1;space--)
        {
          System.out.print(" ");
        }
        for(int j=0;j<=i*2;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
	}
}