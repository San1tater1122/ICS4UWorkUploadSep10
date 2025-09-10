// WorkSheet Part A to C

import java.util.Scanner;

public class basicsOfIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Part A: basics of If/Else. Combined the quesion 1 and 2.
        System.out.println("Please input your age: ");
        int age1 = sc.nextInt();
        while(true){
            if (age1 == 0){
                System.out.println("Invalid input(your input is 0), please input again: ");
                age1 = sc.nextInt();
            }else if(age1 < 0){
                System.out.println("Invalid input(your input is negative), please input again: ");
                age1 = sc.nextInt();
            }else{
                System.out.println("Success! Your input is positive.");
                break;
            }
        }
        if (age1 >= 18){
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are not an adult.");
        }

        // part B: Else If Ladder
        // 3.
        sc.nextLine();
        System.out.println("Please enter your score: ");
        int score = sc.nextInt();
        if (score >= 80){
            System.out.println("Excellent");
        }else if (score >= 50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        // 4.
        sc.nextLine();
        System.out.println("Please input any month number(1-12): ");
        int month = sc.nextInt();
        if (month == 1){
            System.out.println("January");
        }else if(month == 2){
            System.out.println("February");
        }else if(month == 3){
            System.out.println("March");
        }else if(month == 4){
            System.out.println("April");
        }else if(month == 5){
            System.out.println("May");
        }else if(month == 6){
            System.out.println("June");
        }else if(month == 7){
            System.out.println("July");
        }else if(month == 8){
            System.out.println("August");
        }else if(month == 9){
            System.out.println("September");
        }else if(month == 10){
            System.out.println("October");
        }else if(month == 11){
            System.out.println("November");
        }else if(month == 12){
            System.out.println("December");
        }

        //Part C: Nested If Statements
        // 5.
        sc.nextLine();
        System.out.println("Please enter a username: ");
        String username = sc.nextLine();
        System.out.println("Please enter a password: ");
        String password = sc.nextLine();
        if(username.equals("admin") && password.equals("1234")){
            System.out.println("Login successful");
        }else{
            System.out.println("Invalid credentials");
        }

        //6.
        System.out.println("please enter a number: ");
        int number = sc.nextInt();
        if (number % 2 == 0 && number % 5 == 0){
            System.out.println("appropriate");
        }
    }
}
