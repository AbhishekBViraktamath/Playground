import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int e=in.nextInt();
        System.out.println(pow(b,e));
	}
  public static int pow(int a,int c){
    int p=1;
    for(int i=1;i<=c;i++)
      p=p*a;
    return p;
  }
}