import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=0;
      for(int i=1;i<=n;i++)
      {
        temp+=i;
      }
      System.out.println(temp);
	}
}