package ua.hillel.chorna.lessons.lesson6.HW6;

public class SpaceShuttle {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; counter < 100; i++) {
            if (i / 10 == 4 || i % 10 == 4 || i / 10 == 9 || i % 10 == 9 || i / 100 == 9 || i / 100 == 4 || i / 10 % 10 == 9 || i / 10 % 10 == 4) {
                continue;
            }
                ++counter;
                System.out.print(i + " ");
            }
        System.out.println("The number of shuttles is " + counter);
        }
    }
