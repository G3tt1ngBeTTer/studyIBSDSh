import java.util.Scanner;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */

public class MaxStringInArray {
    public static void main (String [] args){
        System.out.println();
        int arrayCount=0;
        String maxWord="";
        int maxLength=0;
        System.out.print("Введите количество слов в массиве: ");
        Scanner scanner = new Scanner(System.in);
        arrayCount = scanner.nextInt();
        String [] stringArray = new String[arrayCount];
        System.out.println("Вводите массив по одному слову, после каждого слова нажимайте enter /n");
        scanner = new Scanner(System.in);
        for (int i=0;i<stringArray.length; i++) {
            stringArray[i]= scanner.nextLine();
            if (maxLength < stringArray[i].length()) {
                maxWord=stringArray[i];
                maxLength=stringArray[i].length();
            }
        }

        System.out.println("Максимальное слово по длине - "+ maxWord);
    }
}
