package ua.hillel.chorna.lessons.lesson5;

import java.util.Scanner;

public class LogicalOps {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);// they are the same
        System.out.println(a != b);// they are not the same

        System.out.println(!true);
        System.out.println(!false);

        boolean result = a > b;
        System.out.println(result);// false

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);// == перевіряє значення в певній змінній; але наші посилання - в різних частинах пам'яті (різні адреси)

        // порівняння референсних даних:
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        int aa = 10;
        int bb = 15;
        int cc = 20;

        boolean resultOr = aa < bb || aa > cc; // logical operator "OR" ||
        System.out.println(resultOr);

        boolean resultAnd = aa < bb && aa > cc; // logical operator "AND" &&
        System.out.println(resultAnd);


        boolean result1 = aa > bb && cc < aa || cc > aa;
        System.out.println(result1); // true

        boolean result2 = aa > bb && (cc < aa || cc > aa);
        System.out.println(result2); // false - another priority




        // керуючі конструкції
        int one = 9;
        int two = 10;

        if (one < two) {
            System.out.println("Hello");
        }


        if (one < two) {
            System.out.println("Hello");
        } else {
            System.out.println("Bye");
        }


        if (one > two) {
            System.out.println("one > two");
        } else if (one < two) {
            System.out.println("one < two");
        } else {
            System.out.println("one = two");
        }


        if (one >= two) {
            System.out.println("one >= two");
            if (one > two) {
                System.out.println(">");
            } else {
                System.out.println("="); // правило - не більше трьох рівнів вкладеності
            }
        } else {
            System.out.println("one < two");
        }


        int c = 2;
        switch (c) {               // char, byte, short, String, int
            case  1 : {
                System.out.println("1");
                break;
            }
            case  2 : {
                System.out.println("2");
                break;
            }
            case  3 : {
                System.out.println("3");
                break;
            }
            default: {
                System.out.println("default");
            }

        }


        // зчитування з консолі
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        String strUserValue = sc.next();
        System.out.println("The string = " + strUserValue);


        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter a string");
        String strUserValue2 = sc2.nextLine();
        System.out.println("The string = " + strUserValue2);

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int userValue3 = sc.nextInt(); // проблема з \n
        // scanner.nextLine(); - використати, щоб очистити буфер, коли після Integer нам потрібно друкувати String
        System.out.println("The string = " + userValue3);

        // перед зчитуванням можна виконати перевірку
//        int userValueInt = 0;
//        if (sc.hasNextInt()) {
//            int uservalueInt = sc.nextInt();
//            System.out.println(uservalueInt);
//        } else {
//            System.out.println("Wrong data");
//            System.exit(0);
//        }
//        System.out.println(userValue3);

    }
}
