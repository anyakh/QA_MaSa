import java.util.Scanner;
public class HW_2 {
    public static void main(String[] args) {
        System.out.println("Enter number of the day of the week:");
        Scanner week_scan=new Scanner(System.in);
        int week = week_scan.nextInt();
        if(week > 7 || week ==0 || week<0){
            System.out.println("There is no such day");
        }
        switch(week){
            case 1: System.out.println("Today is Sunday"); break;
            case 2: System.out.println("Today is Monday"); break;
            case 3: System.out.println("Today is Tuseday"); break;
            case 4: System.out.println("Today is Wednesday"); break;
            case 5: System.out.println("Today is Thursday"); break;
            case 6: System.out.println("Today is Friday"); break;
            case 7: System.out.println("Today is Saturday"); break;
        }
        week_scan.close();
    }
}
