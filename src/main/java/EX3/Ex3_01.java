package EX3;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */

public class Ex3_01 {
    public static void main(String[] args) {
        /**Объявление переменных*/
        int[] someMassiv = new int[20];
        int maxNegPosition=0;
        int minPosPosition=0;
        int maxNeg=-11;
        int minPos=11;

        System.out.println("Изначальный массив:");
        /**Заполняем массив и выводим его пользователю*/
        for (int i=0; i<someMassiv.length; i++) {
            someMassiv[i] = (int) (Math.random() * 20 - 10);
            System.out.print(i+") "+someMassiv[i] + "; ");
        }
        /**Находим максимальный отрицательный и минимальный положительный элементы массива */
        for (int i=0; i< someMassiv.length; i++) {
            if (someMassiv[i] < 0) {
                if (maxNeg < someMassiv[i]) {
                    maxNegPosition = i;
                    maxNeg=someMassiv[i];
                }
            } else {
                if (someMassiv[i] >= 0) {
                    if (minPos > someMassiv[i]) {
                        minPosPosition = i;
                        minPos=someMassiv[i];
                    }
                }
            }
        }
        /**Заменяем их*/
        someMassiv[maxNegPosition]=minPos;
        someMassiv[minPosPosition]=maxNeg;
        /**Показываем пользователю какие элементы были выбраны*/
        System.out.println();
        System.out.println("Максимальный элемент среди отрицательных (Приближающийся к нулю) - "+maxNeg+" на позиции "
                + maxNegPosition);
        System.out.println("Минимальный элемент среди положительных (Приближающийся к минус одному (0 - положительное" +
                " число)) - "+minPos+" на позиции " + minPosPosition);
        /**Выводим массив после изменения*/
        System.out.println("Массив после изменения:");
        for (int i=0; i<someMassiv.length; i++) {
            System.out.print(i+") "+someMassiv[i] + "; ");
        }
    }
}
