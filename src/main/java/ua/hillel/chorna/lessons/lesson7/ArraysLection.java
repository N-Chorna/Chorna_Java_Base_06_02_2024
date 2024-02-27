package ua.hillel.chorna.lessons.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysLection {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 5;
        System.out.println(array[0]);

        for (int i = 0; i < 5; i++) {
            array[i] = (i + 1);// в комірку з індексом 0 кладемо 1 = from 1 to 5
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(array[1]); // type all elements
        }
        System.out.println("array length = " + array.length);
        System.out.println("last value = " +array[array.length -1]);//we can find out the last value in the array

        // System.out.println(array[5]);// error = because we don't have index 5


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(array));


        int[] array2 = {1, 2, 3, 4, 5};
        //int[] array2 = new int[]{1, 2, 3, 4, 5}; - a possible way
        //int array2[] = new int[]{1, 2, 3, 4, 5}; - a possible way, but not good
        System.out.println(Arrays.toString(array2));

//        for (int i = array2.length - 1; i >= 0; i--) {
//        }// перерахування у зворотньому порядку

        for (int value : array2) {
            System.out.println(value);
        } // коли потрібно перебрати всі елементи, і нас не цікавить індекс комірки

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == 3) {
                array2[i] = 77;// тут ми працюємо з індексами
                System.out.println(Arrays.toString(array2));
            }
        }

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 101);
            System.out.println(arr[i]);
        }




        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            int randomNumber = (int) (Math.random() * 11);
            array1[i] = randomNumber;
        }

        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length -1) {
                System.out.print(array1[1]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }




        int [] people = {11, 44, 98, 44, 22, 33, 55, 22, 98, 9};

        int maxValue = people[0];
        int indexMaxValue = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i] > maxValue) {
                maxValue = people[i];
                indexMaxValue = i;
            }
        }
        System.out.println("max value = " + maxValue + ", index = " + indexMaxValue);
        // пошук найбільшого значення в масиві


        int[] team = new int[10];
        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * 11);


        }
        System.out.println(Arrays.toString(team));
        int team1 = 0;
        int team2 = 0;

        for (int i = 0; i < team.length; i++) {
            if (i % 2 == 0) {
                team1 += team[i];
            } else {
                team2 += team[i];
            }
        }
        System.out.println("team1 = " + team1);
        System.out.println("team1 = " + team2);

        if (team1 > team2) {
            System.out.println("Team 1 WON!");
        } else if (team1 < team2) {
            System.out.println("Team 2 WON!");
        } else if (team1 == team2) {
            System.out.println("Draw");
        }
    }
}
