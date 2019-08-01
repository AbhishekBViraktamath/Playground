import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = sc.nextInt();
    }
      int sum=list[0]+list[1]+list[2];
       int sum2 =list[3]+list[4]+list[5];
      if(sum==sum2)
        System.out.println("Perfect Batch");
      else
         System.out.println("Not a Perfect Batch");
    }
}