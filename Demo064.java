import java.util.Arrays;
import java.util.Scanner;

public class Demo064 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n=sc.nextInt();
      
      int[] arr=new int[n];
      System.out.println("Enter your numbers: ");
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        
      }if(n>1){
      int temp= arr[0];
      arr[0]=arr[n-1];
      arr[n-1]=temp;
      System.out.println("Elements after swapping :"+Arrays.toString(arr));
      }

    
}
}
