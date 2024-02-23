package ua.hillel.chorna.lessons.lesson6;

public class Cycles {
    public static void main(String[] args) {
        // FOR

        /*
        for (БЛОК ІНІЦІАЛІЗАЦІЇ ІТЕРАТОРА; e.g., i = 0
        БЛОК УМОВИ ВИХОДУ З ЦИКЛУ; e.g., i < 5
        БЛОК ЗМІНИ ІТЕРАТОРА (++ АБО --) e.g., i++
        )
        {
        КОД
        }
         */

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello, world!");
//        }
//
//        for (int i = 0; i < 5; i += 2) { // 0,2,4,6,8,10 - надрукується не 10, а 5 разів
//            System.out.println("Hello, world!");
//        }


//        int i = 0;// за межами циклу
//        for (; i < 5; i++) {
//            System.out.println("Hello");
//        }

//        for (int i = 0; true; i++) { // вічний цикл - ТАК РОБИТИ НЕ МОЖНА
//            System.out.println("Hello, world!");
//            System.out.println(i);
//        }

//        for (int i = 0; true; ) { // також вічний цикл - ТАК РОБИТИ НЕ МОЖНА
//            System.out.println("Hello, world!");
//            System.out.println(i);
//        }

//        for (int i = 0; true; i++) { // так можна, але не потрібно
//            System.out.println("Hello, world!");
//            System.out.println(i);
//            i++;
//        }

//        for ( ; ; ) { // вічний цикл, який нічого не створює
//            System.out.println("Hello, world!");
//        }

        // BREAK - stops the whole cycle
        // CONTINUE - stops current iteration

//        int i = 0;
//        for ( ;  ; ) { // можна, але небажано
//            System.out.println("Hello, world!");
//            if (i >= 5) {
//                break;
//            }
//            i++;
//        }

//        for (int i = 0; i < 10; i++) { // wit conditions in the IF-cycle
//            System.out.println(i);
//            if (i == 5) {
//                break; // result = 0,1,2,3,4,5 NOT 9
//            }
//
//        }

//        for (int i = 0; i < 10; i++) {
//
//            if (i == 1 || i == 2) {
//                continue; // result = 0,3,4,5 NOT 1,2
//            }
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }       // continue value SHOULD NOT BE EQUAL TO break value (break will be ignored)
//
//        }

//        for (int i = 0, j = 10; i < 5 && j > 5; i++, j--) { // можна змінювати кількість лічильників
//            System.out.println("i = " + i);
//            System.out.println("j = " + j);
//            System.out.println();
//        }

//        int counter = 0; // No. of cycles
//        for (int i = 0; i < 3; i++) {  // цикл в циклі
//            System.out.println("start first loop");
//            System.out.println("first loop i = " + i);
//
//            for (int j = 0; j < 2; j++) {
//                System.out.println("second loop");
//                System.out.println("i = " + i);
//                System.out.println("j = " + j);
//                counter++; // No. of cycles
//            }
//            System.out.println("end first loop");
//            System.out.println();
//        }
//        System.out.println("counter = " + counter);  // No. of cycles


//        for (int i = 0; i <= 20; i += 2) {
//            System.out.println(i);
//        }


//        for (int i = 0; i <= 20; i++) { // для парних
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i <= 20; i++) { // для непарних
//            if (i % 1 == 0) {
//                System.out.println(i);
//            }
//        }
        // Вивести перші 11 чисел послідовності Фібоначчі: 1,1,2,3,5,8,13,21,34,55,89
//        int num1 = 1;
//        int num2 = 1;
//        int sum = 0;
//        System.out.print(num1 + " " + num2 + " ");
//
//        for (int i = 0; i < 9; i++) {
//            sum = num1 + num2;
//            System.out.print(sum + " ");
//            num1 = num2;
//            num2 = sum;  // result - 1 1 2 3 5 8 13 21 34 55 89
//
//        }


        // WHILE

//        int i = 0;
//        while (i <= 10) {
//            System.out.println("Boom");
//            i++;
//        }
//
//
//        int j = 3;
//        do {
//            System.out.println("HelloWorld");
//        } while (j > 5);
//
//
//        i = 0;
//        while (true) {// безкінечний цикл BUT controllable
//            System.out.println(i);
//            if (i >= 5) {
//                break;
//            }
//            i++;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int userValue = 0;
//        while (true) {
//            System.out.println("Please enter a value");
//            if (scanner.hasNextInt()) {
//            userValue = scanner.nextInt();
//            break;
//        } else {
//            System.out.println("Wrong data. Please try again");
//            scanner.nextLine();
//        }
//
//    }
//        System.out.println("user value = " + userValue);

//        Scanner scanner = new Scanner(System.in);
//        int userValue = 0;
//        while (true) {
//            System.out.println("Please enter a value from 10 to 20");
//            if (scanner.hasNextInt()) {
//                userValue = scanner.nextInt();
//                if (userValue >= 10 && userValue <= 20) {
//                    break;
//                } else {
//                    System.out.println("From 10 to 20!!!");
//                    scanner.nextLine(); // зачистка \n
//                }
//            } else {
//                System.out.println("Wrong data. Please try again");
//                scanner.nextLine(); // зачистка \n
//            }
//
//        }
//        System.out.println("user value = " + userValue);

        int integer = 10;
        while (true) {
            System.out.println(integer);
            int random = (int) (Math.random() *101);
            if (random >= 85 && random <= 100) {
                System.out.println("WIN!!!");
                break;
            }
            System.out.println(integer);
            integer--;
            if (integer == -1) {
                System.out.println("BOOM");
                break;
            }
        }

        // дз - генерувати числа від 0 до якогось для 100 шатлів (не до 100, а сто номерів без 4 і 9) без 4 і 9
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i / 10 == 4 || i % 10 == 4|| i / 10 == 9 || i % 10 == 9) {
                continue;
            }
            System.out.println(i);
            counter++;
        }
        System.out.println(counter);

        // умова  - розбити двозначне на 2 однозначні
        int x = 42;
        System.out.println(x / 10);
        System.out.println(x % 10);
        //System.out.println(x / 100);
        //System.out.println(x % 100);

        // ідеально - i в циклі відрізати по 1 числу і перевыряти в ітераціях
        // за допомогою циклу
        // буде цикл в циклі











    }
}