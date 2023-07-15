import java.util.Scanner;
public class Lesson4 {
    public static void main(String[] args) {
            /*System.out.println("Enter number 1");
            Scanner num_scan=new Scanner(System.in);
            int num = num_scan.nextInt();
            System.out.println(num==1 ? "Your number is 1" : "Your number is not 1");
            num_scan.close();
            System.out.println("Enter number 1");
            Scanner num_scan=new Scanner(System.in);
            int num = num_scan.nextInt();
            if (num==1){
                System.out.println("Your number is 1");
            }
            num_scan.close();
            System.out.println("Enter any number");
            Scanner num_scan=new Scanner(System.in);
            int num = num_scan.nextInt();
            int ost = num%2;
            if (ost == 0){
                System.out.println("Your number is even");
            }
            else{
                System.out.println("Your number is not even");
            }
            num_scan.close();
            System.out.println("Enter budget");
            Scanner budget_scan=new Scanner(System.in);
            int budget = budget_scan.nextInt();
            int beverage;
            if (budget >0){
                System.out.println("Choose option: cola(1), fanta(2), pepsi(3), cola zero(4)");
            Scanner num_scan=new Scanner(System.in);
            int num = num_scan.nextInt();
                switch (num){
                    case 1: 
                    beverage = 5; 
                    System.out.println("Your choise is cola");
                    if (beverage<budget){
                        System.out.println("Thank you for the purchase, your change is:"+ (budget - beverage));
                    }
                    else{System.out.println("You don't have enought money for the purchase");}
                    break;
                    case 2:
                    beverage = 10;
                    System.out.println("Your choise is fanta");
                    if (beverage<budget){
                        System.out.println("Thank you for the purchase, your change is:"+ (budget - beverage));
                    }
                    else{System.out.println("You don't have enought money for the purchase");}
                    break;
                    case 3: 
                    beverage = 8; 
                    System.out.println("Your choise is pepsi"); 
                    if (beverage<budget){
                        System.out.println("Thank you for the purchase, your change is:"+ (budget - beverage));
                    }
                    else{System.out.println("You don't have enought money for the purchase");}
                    break;
                    case 4:
                    beverage = 6; 
                    System.out.println("Your choise is cola zero"); 
                    if (beverage<budget){
                        System.out.println("Thank you for the purchase, your change is:"+ (budget - beverage));
                    }
                    else{System.out.println("You don't have enought money for the purchase");}
                    break;
                }
                num_scan.close();
                budget_scan.close();
            }
            else if(budget == 0) {
                System.out.println("You have 0 money on your accont");
            }
            else if(budget < 0) {
                System.out.println("You have less than 0 money on your accont");
            }*/
            System.out.print("Enter your salary");
            System.out.println();
            Scanner salary_scan=new Scanner(System.in);
            int salary = salary_scan.nextInt();
            if (salary < 0){
                System.out.println("Your salary can't be less than 0");
                System.exit(0);
            }
            System.out.print("Enter your working experience");
            System.out.println();
            Scanner exp_scan=new Scanner(System.in);
            int exp = exp_scan.nextInt();
            if (exp < 0){
                System.out.println("Your working experience can't be less than 0");
                System.exit(0);
            }
            double reward = 0;
            if (exp < 5){
                reward = 1.1;
            }
            else if (exp <10 && exp >= 5){
                reward = 1.15;
            }
            else if (exp <15 && exp >= 10){
                reward = 1.25;
            }
            else if (exp <20 && exp >= 15){
                reward = 1.35;
            }
            else if (exp <25 && exp >= 20){
                reward = 1.45;
            }
            else if (exp >= 25){
                reward = 1.5;
            }
            System.out.print("Therefore your experience "+ exp + ", your bonus is: " + (reward - 1)*salary+", and your salary is: "+salary*reward);
        }

}
