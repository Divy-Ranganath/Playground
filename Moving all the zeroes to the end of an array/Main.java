import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      int zero=0;
      for(int i=0;i<(arr_size);i++)
        arr[i]=in.nextInt();
      for(int i=0;i<(arr_size);i++)
      {
        if(arr[i]>0)
          System.out.print(arr[i]+" ");
        else
          zero++;
      }
      for(int j=0;j<zero;j++)
        System.out.print("0"+" ");
      
          
    }
}