package ua.hillel.chorna.lessons.lesson4;

public class CuboidHW {
    public static void main(String[] args) {
        int length1 = 5;
        int width1 = 7;
        int height1 = 3;
        int resultInt = length1 * width1 * height1;
        System.out.println("Об'єм паралелепіпеда 1 =  " + resultInt);

        double length2 = 6.5;
        double width2 = 7.5;
        double height2 = 4.5;
        double resultDouble = length2 * width2 * height2;
        System.out.println("Об'єм паралелепіпеда 2 = " + resultDouble);

        int lengthSumInt = length1 + width1 + height1;
        System.out.println("Довжина сторін 1 = " + lengthSumInt);

        double lengthSumDouble = length2 + width2 + height2;
        System.out.println("Довжина сторін 2 = " + lengthSumDouble);

    }
}
