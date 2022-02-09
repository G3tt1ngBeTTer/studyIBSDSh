import java.util.Scanner;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */

public class Ex1 {

    public static void main(String[] args) {
        /**Объявление переменных*/
        int operation;
        float firstAgr;
        float secondAgr;
        float resultFinal = 0;
        try {
            /**Выводим информацию для пользователя*/
            System.out.println("Введите число, соответвующие нужной операции:");
            System.out.println("1)Сложение 2)Вычитание 3)Умножение 4)Деление");

            /**Получаем данные от пользователя и записываем в переменные*/
            System.out.print("Выш выбор: ");
            Scanner scanner = new Scanner(System.in);
            operation = scanner.nextInt();
            System.out.print("Введите первое число: ");
            firstAgr = scanner.nextFloat();
            System.out.print("Введите второе число: ");
            secondAgr = scanner.nextFloat();
            scanner.close();

            /**Выбираем операцию и получаем результат*/
            switch (operation) {
                case 1: {
                    resultFinal = Sum(firstAgr, secondAgr);
                    break;
                }
                case 2: {
                    resultFinal = Sub(firstAgr, secondAgr);
                    break;
                }
                case 3: {
                    resultFinal = Mul(firstAgr, secondAgr);
                    break;
                }
                case 4: {
                    resultFinal = Div(firstAgr, secondAgr);
                    break;
                }
                default: {
                    System.err.println("Введено неправильное значение");
                    break;
                }
            }
            /**Вывод результата в консоль пользователю*/
            System.out.printf("Результат равен %.4f", resultFinal);

        } catch (Exception e) {
            System.err.print(e.getStackTrace());
        }
    }

    /**
     * @param f1 first argument in action
     * @param f2 second argument in action
     */
    public static float Sum(float f1, float f2) {
        float result = f1 + f2;
        return result;
    }

    /**
     * @param f1 first argument in action
     * @param f2 second argument in action
     */
    public static float Sub(float f1, float f2) {
        float result = f1 - f2;
        return result;
    }

    /**
     * @param f1 first argument in action
     * @param f2 second argument in action
     */
    public static float Mul(float f1, float f2) {
        float result = f1 * f2;
        return result;
    }

    /**
     * @param f1 first argument in action
     * @param f2 second argument in action
     */
    public static float Div(float f1, float f2) {
        float result = f1 / f2;
        return result;
    }
}
