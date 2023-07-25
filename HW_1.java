import java.util.Scanner;
public class HW_1 {

    public static void main(String[] args) {

        System.out.println("Enter 3 numbers");
        Scanner n_scan=new Scanner(System.in);
        int n1 = n_scan.nextInt();
        int n2 = n_scan.nextInt();
        int n3 = n_scan.nextInt();
        if(n1<n2){
            if(n2<n3){
                System.out.println(n3 +" > "+n2+" > "+n1);
            }
            else if(n2>n3){
                if(n3>n1){
                System.out.println(n2 +" > "+n3+" > "+n1);}
                else if(n3<n1){
                System.out.println(n2 +" > "+n1+" > "+n3);
            }
            }
        }
        else if(n2<n1){
            if(n1<n3){
                System.out.println(n3 +" > "+n1+" > "+n2); }
            else if(n1>n3){
                if(n3>n2){
                    System.out.println(n1 +" > "+n3+" > "+n2);}
                else if(n3<n2){
                    System.out.println(n1 +" > "+n2+" > "+n3);
                }
            }
        }
        int average = (n1+n2+n3)/3;
        System.out.println("average of "+ n1 + " " + n2 + " "+ n3 + " is " + average);
        n_scan.close();


        /*System.out.println("Enter number of the day of the week:");
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
        week_scan.close();*/


        /*
        System.out.println("Create your username ");
        Scanner user_scan=new Scanner(System.in);
        String username = user_scan.next();
        System.out.println("Create your password ");
        Scanner pass_scan=new Scanner(System.in);
        String password = pass_scan.next();
        // String username = "anna";
        // String password = "password";
        System.out.println("check username");
        Scanner user_check1=new Scanner(System.in);
        String username1 = user_check1.next();
        
        boolean name_check;
        if (username1.equals(username)){
            name_check =true;
        }
        else{name_check =false;
        System.out.println("wrong username ");}
        int i = 1;
        while(name_check == false){
            System.out.println("try again");
            Scanner user_check2=new Scanner(System.in);
            String username2 = user_check2.next();
            if(username2.equals(username)){
                break;
            }
            else if(i == 3){
                System.out.println("You lost all the three trials");
                System.exit(0);
            }
            i++;
        }
        
        System.out.println("check password ");
        Scanner pass_check1=new Scanner(System.in);
        String password1 = pass_check1.next();
        
        boolean pass_check;
        if (password1.equals(password)){
            pass_check =true;
        }
        else{pass_check =false; System.out.println("wrong password ");}
        while(pass_check == false){
            i=1;
            System.out.println("try again");
            Scanner pass_check2=new Scanner(System.in);
            String password2 = pass_check2.next();
            if(password2.equals(password)){
                System.out.println("your username and password are right");
                break;
            }
            else if(i == 3){
                System.out.println("You lost all the three trials");
                System.exit(0);
            }
            i++;
        }
        pass_check1.close();
        user_check1.close();
        user_scan.close();
        pass_scan.close();*/
    }
}
