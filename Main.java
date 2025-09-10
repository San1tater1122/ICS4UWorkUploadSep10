//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 7;
        double y = 2;
        System.out.println(x/y); // a) 3.5      b) 7/2=3.5, have a decimal because y is double
        System.out.println((int)(x/y)); // a) 3.0  b) convert to int will always round down
        System.out.println(x % 2 == 1); // a) true b) Remainder of 7/2 is 1, 1=1 is true
    }
}