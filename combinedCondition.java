// Part D to Part E

import java.util.Scanner;

public class combinedCondition {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        //Part D
        // 7.
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Do you have parentalConsent? [Y/N] ");
        Boolean parentalConsent = (sc.nextLine().equals("Y"));
        if (age >= 18){
            System.out.println("PG-18 Allow");
        } else if (age >= 16 && parentalConsent) {
            System.out.println("PG-18 Allow");
        }else{
            System.out.println("PG-18 NOT Allow");
        }

        // 8.
        System.out.println("Give me one number: ");
        int a = sc.nextInt();
        System.out.println("Give me second number: ");
        int b = sc.nextInt();
        System.out.println("Give me third number: ");
        int c = sc.nextInt();
        if (a > b){
            if(a > c){
                System.out.println(a + " is the largest.");
            }else{
                System.out.println(c + " is the largest.");
            }
        }else{
            if(b > c){
                System.out.println(b + " is the largest.");
            }else{
                System.out.println(c + " is the largest.");
            }
        }

        // Part E
        // 9.
        System.out.println("This is an ATM system, please enter your PIN");
        int pin = sc.nextInt();
        sc.nextLine();
        String option;
        if (pin == 1234){
            System.out.println("Success, choose to check (b)alance, (d)eposit or (w)ithdraw");
            option = sc.nextLine();
            if(option.equals("b")){
                System.out.println("Checking balance");
            }else if(option.equals("d")){
                System.out.println("Checking deposit");
            }else if (option.equals("w")){
                System.out.println("Checking withdraw");
            }else{
                System.out.println("nothing select");
            }
        }else{
            System.out.println("Access Denied");
        }

        //10.
        System.out.println("Please enter a year number");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("This year is a leap year");
        } else {
            System.out.println("This year is not a leap year");
        }

    }
}
