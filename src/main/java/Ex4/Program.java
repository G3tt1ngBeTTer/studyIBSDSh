package Ex4;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Calculator calc1 = new Calculator(28, 32, "+");
        System.out.println(calc1.getResult());
        Calculator calc2 = new Calculator(28, 32, "fafaasf");
        System.out.println(calc2.getResult());
    }
}
