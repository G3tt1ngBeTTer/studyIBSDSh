package EX3;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */

public class Ex3_02 {
    public static void main(String[] args) {
        /**Вводим информацию о вафлях и конфетах*/
        Waffle waffle1 = new Waffle("Шоколадная вафля", 250, 100,  "Шоколадная");
        Candy candy1 = new Candy("Конфеты шоколадные 'Лесная лавка'", 50, 28, "Орехи и вафли");
        Waffle waffle2 = new Waffle("Обычная вафля (Лимон)", 500, 170, "Лимонная");
        Candy candy2 = new Candy("Закатанные губки из карамели", 150, 250, "Вишня");
        someCandy[] candyBox = {candy1,candy2,waffle1,waffle2};

        /**Выводим информацию о получивщемся подарке*/
        System.out.println("Ващ подарок состоит из:");
            for (someCandy candyBoxForMe: candyBox){
                System.out.println(candyBoxForMe.toString());
            }
    }
}
