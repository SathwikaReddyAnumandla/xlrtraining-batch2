import java.util.Scanner;
public class Demo062 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int n=sc.nextInt();
      
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
         System.out.println("Enter your number: ");
         arr[i] = sc.nextInt();
        
      }
        System.out.println(arr[0]+" is the first element");
        System.out.println(arr[1]+"is the second element");
        System.out.println(arr[n-1]+"is the last element");
        //arr[1]+" is the second element "+arr[n-1]+" is the last element");
    }
    
}
