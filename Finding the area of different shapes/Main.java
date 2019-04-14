import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code herecase
      Scanner sc=new Scanner(System.in);
      int choice=sc.nextInt();
      int a=sc.nextInt();
     
        
     
      double area_circle,PI=3.14;
      int area;
      switch(choice)
      {
        case 1:
        {
          System.out.println(a*a);
          break;
        }
        case 2:
        {
          int b=sc.nextInt();
          area=a*b;
          System.out.println(area);
          break;
        }
        case 3:
        {
          int b=sc.nextInt();
          area=(a*b)/2;
          System.out.println(area);
          break;
        }
        case 4:
        {
          area_circle=PI*a*a;
          System.out.println(area_circle);
          break;
        }
      }
    }
}