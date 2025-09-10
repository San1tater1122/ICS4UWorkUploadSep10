import java.util.Scanner;

public class mathExpressionChallenge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Float[] li = new Float[3]; // array
        for (int i=0; i<3; i++){   // loop
            li[i] = sc.nextFloat();
        }

        float max = Math.max(li[0], Math.max(li[1], li[2]));
        float min = Math.min(li[0], Math.min(li[1], li[2]));
        System.out.println("Average is: " + (li[0]+li[1]+li[1])/3);
        System.out.println("The Maximum is: " + max);
        System.out.println("The Minimum is: " + min);
    }
}
