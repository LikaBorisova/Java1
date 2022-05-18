package Lesson2;

public class HW2 {
    public static void main(String[] args) {
        checkSum(8, 4);
        check2(-1);
        check3(77);
        check4("Go!", 5);
        checkYear(2020);
    }

    public static void checkSum(int value1, int value2) {
        int value3 = value1 + value2;
        if (value3 >= 10 && value3 <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void check2(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static void check3(int a) {
        if (a >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void check4(String text, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(text);
        }
    }

    public static void checkYear(int value1) {

        if (((value1 % 4) == 0 && (value1 % 100) != 0) || (value1 % 400) == 0 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}