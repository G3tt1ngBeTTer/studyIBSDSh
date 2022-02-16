package Ex5;

/**
 * Created by Danila Shestipalov
 *
 * @author G3B
 * @see #main(String[])
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ex5_main {
    public static String contentInString;

    public static void main(String[] args) {
        /**Переменные*/
        /**Максимально повторяемое слово и количество максимальных повторений*/
        String maxRepeatWord;
        int maxRepeat = 0;
        /**Переменные для обработки контента из файла*/
        String[] content;
        ArrayList<String> contentSet = new ArrayList<String>();
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };
        NavigableMap<String, Integer> counts = new TreeMap<>();
        /**Констатнты*/
        final String path = "src\\TestFileForEx5.txt";
        final String twoSpaces = "  ";
        final String oneSpace = " ";

        /**Получаем данные из файла*/
        contentInString = getContent(path);

        /**Удаляем лишние пробелы*/
        while(contentInString.indexOf(twoSpaces) >= 0) {
            contentInString=contentInString.replace(twoSpaces, oneSpace);
        }
        //contentInString = contentInString.replaceAll(twoSpaces, oneSpace);


        /**Проверка на то если файл начинается с пробела*/
        int firstSpace;
        firstSpace=contentInString.indexOf(" ");
        if (firstSpace==0) {
            contentInString=contentInString.replaceFirst(" ", "");
        };

        /**Рахбивам строку и записываем её в массив строк*/
        content = contentInString.split(" ");

        /**Проверка на заполненние файла*/
        if (contentInString.equals("")) {
            System.err.println("Выбранный файл пуст");
        } else {

            /**Запроеяем колекцию, она будет автоматически отсортирована по алфавиту*/
            for (int i = 0; i < content.length; i++) {
                contentSet.add(content[i]);
            }
            contentSet.sort(comparator);
            System.out.println(contentSet);

            /**Выводим информацию о словах и количестве повторений*/
            for (int i = 0; i < content.length; i++) {
                int counter = 0;
                for (int j = 0; j < content.length; j++) {
                    if (content[j].equals(content[i])) {
                        counter++;
                    }
                }
                counts.put(content[i], counter);
            }
            System.out.println(counts);

            /**Находим слово, которое чаще всего повторяется и количество его повторений*/
            maxRepeatWord = findMax(counts);
            maxRepeat = counts.get(maxRepeatWord);
            System.out.print("Слово с наибольшим количеством повторений - " + maxRepeatWord + " было повторено " + maxRepeat + " раз(а)");
        }
    }

    /**Функция поиска максимального повторяющегося слова*/
    public static String findMax(NavigableMap<String, Integer> nMap) {
        String key = nMap.firstKey();
        int max = nMap.get(key);

        for (Map.Entry<String, Integer> a : nMap.entrySet()) {
            if (a.getValue() > max) {
                key = a.getKey();
                max = a.getValue();
            }
        }
        return key;
    }


    /**Функция получения данных из файла*/
    public static String getContent(String path) {
        String content = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(" ");
            }
            content = stringBuilder.toString();
        } catch (FileNotFoundException e) {
            System.out.println("Файл по данному пути не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(content);
        return content;
    }
}
