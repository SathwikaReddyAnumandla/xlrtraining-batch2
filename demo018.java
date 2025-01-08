import java.util.Scanner;

public class demo018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            System.out.println("Enter a number : ");
            int num1=sc.nextInt();
            int roundedNumber = ((num1 + 50) / 100) * 100;

    
        System.out.println("The number rounded off to the nearest multiple of 100 is: " + roundedNumber);


        }
    }

    

