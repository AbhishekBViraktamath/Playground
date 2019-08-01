import java.util.Scanner;
class Main{
      public static int sum(int num) 
    {
        int sum=0;
        for(int i=1;i<=num;i++)
          sum=sum+i;
        return sum;
    }
	public static void main (String[] args)
    {
	 // Type your code here 4
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
        System.out.println(sum(num));
    }
}