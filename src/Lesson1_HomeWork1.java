import java.util.Scanner;

public class Lesson1_HomeWork1 {
    public static void main(String[] args) {

        // УСЛОВНЫЕ КОНСТУКЦИИ:

        int numberOfStudents = 17;
        int temperatures = 35;
        boolean isRaining = true;

        if (temperatures > 20) { // true
            System.out.println("Идем купаться");
        }
        if (numberOfStudents == 22) { // false
            System.out.println("Играем в футбол");
        }
        if (temperatures < 15) { // false
            System.out.println("Оденьтесь теплее");
        } else {
            System.out.println("Оденьтесь легко");
        }
        if (isRaining) { // true
            System.out.println("Возьмите зонт");
        } else {
            System.out.println("Наденьте бейсболку");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущую температуру");
        temperatures = scanner.nextInt();
        //temperatures = -5;
        if (temperatures > 35) {
            System.out.println("На улице жарка");
        } else if (temperatures > 20) {
            System.out.println("На улице тепло");
        } else if (temperatures > 15) {
            System.out.println("На улице прохладно");
        } else if (temperatures > 0) {
            System.out.println("На улице холодно");
        }else {
            System.out.println("На улице морозно");
        }
        numberOfStudents = numberOfStudents + 5;
        if (numberOfStudents > 20){
            System.out.println("Идем кафе");
            if (isRaining){ // вложенное условное конструкция
                System.out.println("Пьем чай");
            }else {
                System.out.println("Едим мороженное");
            }
        }
    }
}
