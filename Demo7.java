import java.util.Scanner;
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        System.out.println("Enter your phone number: ");
        long phnno=sc.nextLong(); 
        System.out.println(name+" is your name and "+age+"is your age and "+phnno+"is your phone number");
    }
    
}
