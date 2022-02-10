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
        /**Получаем данные от пользователя*/
        Scanner scanner=new Scanner(System.in);
        String curOp;
        float firstAgr; float secondAgr;
        System.out.println("Выберите знак операции: ");
        System.out.println(" '+' - Сложение; '-' - Вычитание; '*' - Умножение; '/' -  Деление");
        System.out.print("Введите знак вашей операции: ");
        curOp = scanner.nextLine();
        System.out.print("Введите первое число: ");
        firstAgr = scanner.nextFloat();
        System.out.print("Введите второе число: ");
        secondAgr = scanner.nextFloat();
        Arguments arguments = new Arguments(firstAgr, secondAgr);
        /**Относительно операции получаем и выводим результат*/
        switch (curOp) {
            case "+":
                System.out.println("Результат = " + Add.getResult());
            break;
            case "-":
                System.out.println("Результат = " + Sub.getResult());
            break;
            case "*":
                System.out.println("Результат = " + Mul.getResult());
            break;
            case "/":
                System.out.println("Результат = " + Div.getResult());
            break;
            default:
                System.out.println("Ошибка в выборе операции, повторите воод примера");
                Program.main(null);
        }

    }
}
