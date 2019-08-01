import java.util.Scanner;
class Main
{
   public static int square(int num) 
    {
        return num * num;
    }
	public static void main (String[] args)
    {
	 // Type your code here 4
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
        System.out.println(square(num));
    }
}