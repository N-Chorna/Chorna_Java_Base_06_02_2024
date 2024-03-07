//package ua.hillel.chorna.lessons.lesson8;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//public class Main {
//    public static void main(String[] args) {
//                // O (N)
//        int N = 10000;
//        for (int i = 0; i < N; i++) {
//        }
//
//        // O (N^2)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//            }
//        }
//
//        // O (N^3)
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                for (int k = 0; k < 5; k++) {
//                }
//            }
//        }
//
//         //Сортування бульбашкою (Bubble Sort)
//        int[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        int counter = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                counter++;
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println(Arrays.toString(array));
//
//       // Сортування вибором (Selection Sort)
//        int counter = 0;
//        int[] arr = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < n; j++) {
//                counter++;
//                if (arr[j] < arr[minIndex]) {
//                    // Знаходження індексу найменшого елемента у несортованій частині
//                    minIndex = j;
//                }
//            }
//            // Обмін місцями поточного елемента та найменшого елемента
//            int temp = arr[i];
//            arr[i] = arr[minIndex];
//            arr[minIndex] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("counter = " + counter);
//
//        // Сортування вставкою (Insertion Sort)
//        int counter = 0;
//        int[] arr = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            int key = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > key) {
//                counter++;
//                // Переміщення елементів, які більше за key, на одну позицію вперед
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            // Вставлення key на правильну позицію у відсортованій частині масиву
//            arr[j + 1] = key;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("counter = " + counter);
//
//
//        Integer[] array = {1, -5, 6, -42, 9, 67, 234, 456, 123, 8, 23, 9};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(Arrays.toString(array));
//
//
//        int[] array = {-42, -5, 1, 6, 8, 9, 19, 23, 67, 123, 234, 456};
//        int element = 234;
//        int index = -1;
//        int counter = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            counter++;
//            if (element == array[i]) {
//                index = i;
//                break;
//            }
//        }
//
//        System.out.println("counter = " + counter);
//        System.out.println("index = " + index);
//
//
//        int[] array = {-42, -5, 1, 6, 8, 9, 19, 23, 67, 123, 234, 456};
//        int element = 234;
//        int index = -1;
//        int counter = 0;
//
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left <= right) {
//            counter++;
//
//            int mid = (left + right) / 2;
//
//            if (array[mid] == element) {
//                index = mid;
//                break;
//            } else if (array[mid] < element) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//
//        System.out.println("counter = "  + counter);
//        System.out.println("index = "  + index);
//
//
//        int index = Arrays.binarySearch(array, 234);
//        System.out.println("index = " + index);
//
//
//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = array;
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
//        array[0] = 777;
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
//
//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            array2[i] = array[i];
//        }
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
//        array[0] = 777;
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//
//        int[] array = {1, 2, 3, 4, 5};
//        int[] array2 = Arrays.copyOf(array, 3);
//
//        System.out.println(Arrays.toString(array2));
//
//
//        int[] array3 = Arrays.copyOfRange(array, 2, 10);
//        System.out.println(Arrays.toString(array3));
//    }
//}
