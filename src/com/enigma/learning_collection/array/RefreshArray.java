package com.enigma.learning_collection.array;

import java.util.Arrays;

public class RefreshArray {
    public static void main(String[] args) {
        //        int[] numbers; // declaration
//        numbers = new int[3]; // initialization / creation
//        numbers[0] = 1;
//        numbers[1] = 1;
//        numbers[2] = 2;
//        numbers = new int[]{1,2,3};
//        int [] numbers = new int[3]; kombinasi dari deklarasi dan creation
//        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int[] numbers = {1, 2, 3, 4, 5}; // Array Literal
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] emptyNumbers = new int[5];
        boolean[] emptyFeatureFlags = new boolean[5];
        String[] emptyStrings = new String[5];
        Integer[] emptyIntegers = new Integer[5];

        System.out.println(Arrays.toString(emptyNumbers));
        System.out.println(Arrays.toString(emptyFeatureFlags));
        System.out.println(Arrays.toString(emptyStrings));
        System.out.println(Arrays.toString(emptyIntegers));

        /* ======================== */
        System.out.println(numbers[2]);
        System.out.println("index terakhir: " + (numbers.length - 1));

        int i = numbers.length - 1;
        for (;;) {
            if (i >= 0) {
                System.out.println(numbers[i]);
                i--;
            } else {
                break;
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        /* ======================== */
        // array index out of range out of bond
        for (int j = 10; j <= numbers.length + 9; j++) {
            System.out.println(numbers[j - 10]);
        }

        // not yet initialized
//        int[] array;
//        array[0] = 1;

//        int[][] matrix = new int[3][3];
        // jagged array, jadi setiap array itu bisa berbeda2 length
        int[][] matrix2 = new int[4][];
        matrix2[0] = new int[]{1, 2, 3};
        matrix2[1] = new int[]{4, 5, 6};
        matrix2[2] = new int[]{7, 8, 9};
        matrix2[3] = new int[]{0};
        int[][] matrix3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {0}};

        int [] numbers2 = {1, 2, 3, 4, 5}; // reference A
        int [] numbers3 = numbers2; // reference A
        int [] numbers4 = numbers2.clone(); // reference B
        int [] numbers5 = numbers2.clone(); // reference C
        numbers2[2] = 100;

        System.out.println("numbers3" + Arrays.toString(numbers3));
        System.out.println("numbers4" + Arrays.toString(numbers4));

        System.out.println("numbers4 == numbers5" + (numbers4 == numbers5));
        System.out.println("numbers4 equals numbers5" + (Arrays.equals(numbers4, numbers5)));

    }
}
