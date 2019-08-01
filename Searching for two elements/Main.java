import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int found1=-1,found2=-1;
      int s1=in.nextInt();
      int s2=in.nextInt();
      for(int i=0;i<=arr_size-1;i++)
      { 
        if(s1==arr[i])
          found1=i;
        
        if(s2==arr[i])
          found2=i;
       }
     
        System.out.println(found1);
      System.out.println(found2);
    }
}
