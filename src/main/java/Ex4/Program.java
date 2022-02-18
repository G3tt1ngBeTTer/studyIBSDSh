package Ex4;

import java.util.Scanner;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */



public class Program {

    public static void main(String[] args) {
        try {
//        /**Создаём новые объекты и выводим из них результат в консоль методом getResult*/
//        Calculator calc1 = new Calculator(28, 0, "/");
//        System.out.println("Результат вычисления 1 = " + calc1.getResult());
//        Calculator calc2 = new Calculator(28, 32, "fafaasf");
//        System.out.println("Результат вычисления 2 = " +calc2.getResult());
//        Calculator calc3 = new Calculator(6, -2, "-");
//        System.out.println("Результат вычисления 3 = " +calc3.getResult());
//
        /**Выводим информацию для пользователя*/
        String operation;
        int firstAgr;
        int secondAgr;
        System.out.println("Введите знак операции, из предложенных:");
        System.out.println("1)Сложение + 2)Вычитание - 3)Умножение * 4)Деление /");

        /**Получаем данные от пользователя и записываем в переменные*/
        System.out.print("Выш выбор: ");
        Scanner scanner = new Scanner(System.in);
        operation = scanner.nextLine();
        System.out.print("Введите первое число: ");
        firstAgr = inputInt(scanner);
        System.out.print("Введите второе число: ");
        secondAgr = inputInt(scanner);;
        scanner.close();
        Calculator calc4 = new Calculator(firstAgr,secondAgr,operation);
        System.out.println("Результат вычисления = " +calc4.getResult());
        } catch (Calculator.nullDivException e) {
            System.err.println(e.getMsg());
            e.printStackTrace();
        } catch (Calculator.operationException e) {
            System.err.println(e.getMsg());
            e.printStackTrace();
        }

    }
    private static int inputInt(Scanner scanner){
        int argument;
        while (!scanner.hasNextInt()){
            System.out.println(scanner.next()+" это не целочисленное значение, попробуйте ещё раз");
            System.out.print("Введите повторно число: ");
        }
        argument = scanner.nextInt();
        return argument;
    }
}
