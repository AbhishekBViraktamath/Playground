import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here\ Scanner in=new Scanner(System.in);
    Scanner in=new Scanner(System.in);  
    int n=in.nextInt();
    int c=0;
    for(int i=1;i<=n;i++)
    {
      System.out.print(i);
      c=c+1;
      if(i!=n){
        if(c==3)
      {
        System.out.print(",");
        c=0;
      }
    }
    }
  }
}