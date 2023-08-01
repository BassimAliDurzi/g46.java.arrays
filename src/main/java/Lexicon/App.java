package Lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //storeElements();
        //indexOf();
        //sortString();
        //copyOfArray();
        //twoDimensionalArrays();
        //averageOfArray();
        //oddArrayMethod();
        removeDuplicateElements();


    }

    public static void storeElements() {
        int[] fibonacciNumbersEx1 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        for (int number : fibonacciNumbersEx1) {
            System.out.print(number + "   ");
        }
    }

    public static void indexOf() {
        int[] fibonacciNumbersEx2 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number to see if it exist or not:");
        int number = scanner.nextInt();
        int indexOfNumber = Arrays.binarySearch(fibonacciNumbersEx2, number);
        if (indexOfNumber < 0) {
            System.out.println(-1);
        } else {
            System.out.println("Index position of number " + number + " is: " + indexOfNumber);
        }
    }

    public static void sortString() {
        String[] bigCities = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(bigCities);
        System.out.println(Arrays.toString(bigCities));
    }

    public static void copyOfArray() {
        int[] firstArray = {1, 15, 20};
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);

        System.out.print("Elements from first array: ");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + "  ");
        }
        System.out.println();
        System.out.print("Elements from second array: ");
        for (int j = 0; j < firstArray.length; j++) {
            System.out.print(firstArray[j] + "  ");
        }


    }

    public static void twoDimensionalArrays() {
        String[][] countryAndCity = new String[2][2];
        countryAndCity[0][0] = "Malaysia";
        countryAndCity[0][1] = "Kuala Lumpur";
        countryAndCity[1][0] = "Turkey";
        countryAndCity[1][1] = "Ankara";

        for (int i = 0; i < countryAndCity.length; i++) {
            for (int j = 0; j < countryAndCity.length; j++) {
                System.out.print(countryAndCity[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void averageOfArray() {
        double[] listOfNumbers = {43, 5, 23, 17, 2, 14};
        double sum = 0;
        for (int i = 0; i < listOfNumbers.length; i++) {
            sum += listOfNumbers[i];
        }
        double averageOfNumbers = sum / listOfNumbers.length;
        System.out.println("Average is: " + String.format("%,.1f", averageOfNumbers));

    }

    public static void oddArrayMethod() {
        int[] tenNumbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Odd Array: ");
        for (int i = 0; i < tenNumbersArray.length; i++) {
            if(tenNumbersArray[i] % 2 != 0) {
                System.out.print(tenNumbersArray[i] + " ");

            }
        }


    }

    public static void removeDuplicateElements(){
        int[] duplicateElementsArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
    }


}
