import java.util.Scanner;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */

public class Ex2 {

    public static void main(String[] args){
        /**Объявляем переменную для удобства выбора проекта*/
        int chooseProject=0;
        try{
            /**Производим общение с пользователем*/
            Scanner console = new Scanner(System.in);
            System.out.println("Выберите номер необходимой операции:");
            System.out.println("1 - Простой консольный калькулятор");
            System.out.println("2 - Поиск самого длинного слова среди введенных");
            System.out.print("Ввведите нужный номер операции: ");
            chooseProject=console.nextInt();
            /**По номеру операции запускаем нужную*/
            switch (chooseProject){
                case 1:
                    Ex1.main(null);
                    break;
                case 2:
                    MaxStringInArray.main(null);
                    break;
                default:
            /***/
                System.out.println("Введено неправельное значение, повторение операции");
                System.out.println();
                Ex2.main(null);
            }
        }
        catch (Exception err){
            System.err.println(err.getStackTrace().toString());
        }
    }
}
