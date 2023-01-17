import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        String finalString = "Спасибо за внимание!";

        // создаём переменную string и присваеваем ей значение I study Basic Java!
        String textOriginal = "I study Basic Java!";

        // создаём метод переменной типа string
        String text = textOriginal;

        //  выводим на экрам последний символ предложения
        System.out.println(text.charAt(text.length()-1));

        //  выводим на экрам последний 18ый символ
        System.out.println(text.charAt(18));

        // Проверяем, содержит ли наша строка подстроку “Java”. Используея метод String.contains().
        // и выаодим значение на экран
       boolean resultContains = text.contains("Java");
       System.out.println("Is text contains our substring -? " + resultContains);

        // Меняем все символы “а” на “о” и выаодим значение на экран
       System.out.println(text.replace("a","o"));

        // Преобразуем строку к верхнему регистру и выаодим значение на экран

        String textUpperCase = text.toUpperCase();

        System.out.println(text.toUpperCase());

        // Преобразуем строку к нижнему региструи выводим значение на экран

        String textLowerCase = text.toLowerCase();

        System.out.println(text.toLowerCase());

        // Вырезаем строку Java c помощью метода String.substring(). и выводим значение на экран

        String substring1 = text.substring(14, 18);
        System.out.println(substring1);

        System.out.println(finalString);

    }
}