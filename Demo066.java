import java.util.Scanner;
public class Demo066 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n=sc.nextInt();
      
      int[] arr=new int[n];
      System.out.println("Enter your numbers: ");
      
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
         System.out.println("index : element");
         System.out.println(i+":"+arr[i]);
      }
        
        
        
    }

    
}
