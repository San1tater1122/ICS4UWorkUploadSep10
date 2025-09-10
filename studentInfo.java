import java.util.Objects;
import java.util.Scanner;

public class studentInfo {
    public static float convertHeightToMeter(float x){
        return x/100;
    }

    public static int calculateAgeInDays(int x){
        return x*365;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your name: ");
        String name = sc.nextLine();

        System.out.print("Please input your age: ");
        int age = sc.nextInt();

        System.out.print("Please input your height in cm: ");
        float height = sc.nextFloat();

        System.out.print("Please input your GPA: ");
        float GPA = sc.nextFloat();
        sc.nextLine();
        System.out.print("Do you like programming? [Y/N] ");
        String likePro_input = sc.nextLine();
        Boolean likePro;
        if (Objects.equals(likePro_input, "Y")){
            likePro = true;
        }else if (Objects.equals(likePro_input, "N")){
            likePro = false;
        }else{
            likePro = false;
        }

        System.out.println("Age in days: " + calculateAgeInDays(age));
        System.out.println("Height in meters: " + convertHeightToMeter(height));
        System.out.println((likePro)? name + " like programing": name + " does not like programing");

    }
}
