import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	      int x, y, z;
        Scanner in = new Scanner(System.in);
 
       x = in.nextInt();
       y = in.nextInt();
       z = in.nextInt();
      int large = minFunction(x,y);
      if (z>large)
        System.out.println(z);
      else
        System.out.println(large);
	}
  public static int minFunction(int x, int y) {
      int max;
      if (x> y)
         max = x;
      else
         max = y;

      return max; 
  }
}