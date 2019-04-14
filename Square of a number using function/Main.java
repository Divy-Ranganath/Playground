import java.util.Scanner;
class Main
{
  public static int squaring(int m)
  {
    int sq=m*m;
    return sq;
  }
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int square=squaring(n);
      System.out.println(square);
	} 
}