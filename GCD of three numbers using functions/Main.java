import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
       int x, y, z,gcd1,GCD=1;
        Scanner in = new Scanner(System.in);
 
       x = in.nextInt();
       y = in.nextInt();
       z = in.nextInt();
      gcd1= minFunction(x,y);
      for(int i = 1; i <= gcd1 && i <= z; ++i)
        {
            // Checks if i is factor of both integers
            if(gcd1 % i==0 && z % i==0)
                GCD = i;
        }
	   System.out.println(GCD);
	}
    public static int minFunction(int x, int y) {
      int gcd=1;
       for(int i = 1; i <= x && i <= y; ++i)
        {
            // Checks if i is factor of both integers
            if(x % i==0 && y % i==0)
                gcd = i;
        }
      return gcd;
    }
}
