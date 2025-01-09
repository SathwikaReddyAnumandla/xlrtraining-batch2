import java.util.Scanner;
class DEMO18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of minutes : ");
        long totalMinutes = sc.nextLong();
            
           
            long minutesInAnHour = 60;
            long hoursInADay = 24;
            long daysInAYear = 365;
            
            long minutesInADay = minutesInAnHour * hoursInADay;
            long minutesInAYear = minutesInADay * daysInAYear; 
            
           
            long years = totalMinutes / minutesInAYear;
            long remainingMinutesAfterYears = totalMinutes % minutesInAYear;
            long days = remainingMinutesAfterYears / minutesInADay;
            long remainingMinutes = remainingMinutesAfterYears % minutesInADay;
            
            
            System.out.println(totalMinutes + " minutes is approximately " + years + " years, " + days + " days, and " + remainingMinutes + " minutes.");
            

    }

}