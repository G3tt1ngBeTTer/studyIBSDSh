package Ex4;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */



public class Program {

    public static void main(String[] args) {
        /**Создаём новые объекты и выводим из них результат в консоль методом getResult*/
        Calculator calc1 = new Calculator(28, 0, "/");
        System.out.println("Результат вычисления 1 = " + calc1.getResult());
        Calculator calc2 = new Calculator(28, 32, "fafaasf");
        System.out.println("Результат вычисления 2 = " +calc2.getResult());
        Calculator calc3 = new Calculator(6, -2, "-");
        System.out.println("Результат вычисления 3 = " +calc3.getResult());
    }
}
