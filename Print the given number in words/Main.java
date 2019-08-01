import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int x=in.nextInt();
      if(x==1)
        System.out.println("One");
      else if(x==2)
        System.out.println("Two");
      else if(x==3)
        System.out.println("Three");
      else if(x==4)
        System.out.println("Four");
      else if(x==5)
        System.out.println("Five");
      else
        System.out.println("Invalid");
    }
}