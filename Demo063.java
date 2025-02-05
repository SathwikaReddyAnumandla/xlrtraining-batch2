import java.util.Scanner;
public class Demo063 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n=sc.nextInt();
      
      int[] arr=new int[n];
      System.out.println("Enter your numbers: ");
      for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
        
      }
        System.out.println(arr[0]+" is the first element "+arr[n-1]+" is the last element and the addition of these two numbers is "+(arr[0]+arr[n-1]));
        
        
    }

    
}
