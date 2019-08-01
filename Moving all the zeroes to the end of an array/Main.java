import java.util.Scanner;
class Main
{ 
  public static void main(String[] args) 
    { 
       Scanner in=new Scanner(System.in);
        int n = in.nextInt(); 
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
         arr[i]=in.nextInt();
       }
      
        pushZerosToEnd(arr, n);  
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 
    // Function which pushes all zeros to end of an array. 
    static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = 0;  // Count of non-zero elements 
  
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) 
            arr[count++] = 0; 
    } 
  
    
    
}