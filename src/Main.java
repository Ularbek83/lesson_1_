import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Начало пограммы;

        System.out.println("Hello world!");//Hello world!
        System.out.println(5); // распечатка число 5
        System.out.println(3 + 6 * 2 / 3 - 1);//6
        System.out.println(17 % 5);//Оператор модуль - остаток после деления = 2

        int ageOfMyFriend = 27;

        System.out.println(ageOfMyFriend); // 27
        ageOfMyFriend = 20;// ageOfMyFriend стал равен на 20 можно сказать переинициализировался.

        int ageOfMySister = ageOfMyFriend;
        System.out.println(ageOfMySister + ageOfMyFriend);//Консоль вводить 40

        /*ageOfMySister = "Twenty years old"; - Так нельзя потому что ageOfMySister=20 (int) а
        "Twenty years old" String
         */
        boolean is_raining = true;
        double price = 25.5;
        char myFavoriteSymbol = '$';
        float weight = 25.5f;// Именно Float и float разница нету а так большие и маленкие разница большая
        long bigNumber = 321312L;

        System.out.println(price * weight);//Консоль вводить 650.25

        String myName = "Ularbek";
        System.out.println("Мое имя: " + myName + " Мой вес: " + weight);//Мое имя: Ularbek Мой вес: 25.5
        System.out.println("Результат: " +6 + 4); // консоль вводит 64 потому что String
        System.out.println("Результат: " +(6 + 4 )); // консоль вводит 10 потому что int и есть скобка

        final int TEMPERATURE_IN_BISHKEK = 35;// константа постоянно пишется с большими буквами
        //TEMPERATURE_IN_BISHKEK = 40; - уже нельзя потому что это константа

        int birthdayYear;
        System.out.println("Введите год вашего рождения: ");// Введите год вашего рождения: 1983
        Scanner scanner = new Scanner(System.in);
        birthdayYear = scanner.nextInt(); // если int scanner.nextInt();если String scanner.nexLine();
        System.out.println("Вам: " + (2024 - birthdayYear) + " Лет "); // Вам: 41 Лет

        String yourCity;
        System.out.println("Из кокого вы города: ");// Из кокого вы города: Бишкек
        scanner = new Scanner(System.in);
        yourCity = scanner.nextLine();
        System.out.println(yourCity + " очень красивый!"); // Бишкек очень красивый!

    }
}