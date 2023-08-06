package Lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        storeElements();
        indexOf();
        sortString();
        copyOfArray();
        twoDimensionalArrays();
        averageOfArray();
        oddArrayMethod();
        removeDuplicateElements();
        addElements();
        multiplicationTable();
        createArrayAndReverse();
        diagonalElements();
        randomNumbers();


    }

    public static void storeElements() {
        int[] oddNumber = new int[5];
        oddNumber[0] = 1;
        oddNumber[1] = 3;
        oddNumber[2] = 5;
        oddNumber[3] = 7;
        oddNumber[4] = 9;

        for (int number : oddNumber) {
            System.out.print(number + " ");
        }
    }

    public static void indexOf() {
        int[] fibonacciNumbersEx2 = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a number to see if it exist or not:");
        int number = scanner.nextInt();
        int indexOfNumber = Arrays.binarySearch(fibonacciNumbersEx2, number);
        if (indexOfNumber < 0) {
            System.out.println("-1");
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
        for (int j : secondArray) {
            System.out.print(j + "  ");
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
            if (tenNumbersArray[i] % 2 != 0) {
                System.out.print(tenNumbersArray[i] + " ");

            }
        }
    }

    public static void removeDuplicateElements() {
        int[] duplicateElementsArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        System.out.print("Array: ");
        for (int element : duplicateElementsArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.print("Array without duplicate values: ");
        Arrays.sort(duplicateElementsArray);

        for (int i = 0; i < duplicateElementsArray.length - 1; i++) {
            int j = i + 1;
            if (duplicateElementsArray[i] != duplicateElementsArray[j]) {
                System.out.print(duplicateElementsArray[i] + "  ");
            }
        }
        if (duplicateElementsArray[duplicateElementsArray.length - 1] != duplicateElementsArray[duplicateElementsArray.length - 2]) {
            System.out.print(duplicateElementsArray[duplicateElementsArray.length - 1]);
        }
    }

    public static void addElements() {
        String[] countriesYouVisited = {"Syria", "Lebanon", "Malaysia", "Sweden", "Germany", "Holland"};
        System.out.println("Countries you visited before long time: " + Arrays.toString(countriesYouVisited));

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many countries have you visited recently?");
        int numberOfNewCountries = scanner.nextInt();

        String[] updatedCountries = Arrays.copyOf(countriesYouVisited, countriesYouVisited.length + numberOfNewCountries);
        countriesYouVisited = updatedCountries;

        int j = numberOfNewCountries;
        Scanner newCountry = new Scanner(System.in);

        for (int i = 1; i <= numberOfNewCountries; i++) {
            System.out.println("Type the country no. " + i);
            String lastCountryYouVisited = newCountry.nextLine();
            countriesYouVisited[countriesYouVisited.length - j] = lastCountryYouVisited;

            j -= 1;
        }
        System.out.println("All the countries which you have visited: " + Arrays.toString(countriesYouVisited));
    }

    public static void multiplicationTable() {
        int[][] multiplicationArray = new int[10][10];

        for (int i = 0 ; i < multiplicationArray.length; i++) {
            for (int j = 0; j < multiplicationArray[i].length; j++) {
                multiplicationArray[i][j] = (i + 1)*(j + 1);
                System.out.printf("%-7s", multiplicationArray[i][j]);
            }
            System.out.println();
        }


    }

    public static void createArrayAndReverse() {
        int[] integerNumbersArray = new int[0];
        int attempt = 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please insert a number or 10101 to exist:");
            int integerNumber = scanner.nextInt();
            if (integerNumber == 10101) {
                break;
            } else {
                int[] copyOfIntegerNumbersArray = Arrays.copyOf(integerNumbersArray, integerNumbersArray.length + attempt);
                integerNumbersArray = copyOfIntegerNumbersArray;
                integerNumbersArray[integerNumbersArray.length - 1] = integerNumber;
            }

        }
        System.out.println("Integer Numbers: " + Arrays.toString(integerNumbersArray));

        int[] reverseIntegerNumbersArray = new int[integerNumbersArray.length];

        for (int i = 0; i < integerNumbersArray.length; i++) {
            reverseIntegerNumbersArray[i] = integerNumbersArray[integerNumbersArray.length - i - 1];
        }
        System.out.println("The reverse integer Numbers: " + Arrays.toString(reverseIntegerNumbersArray));
    }

    public static void diagonalElements() {
        int[][] diagonalElementsArray = new int[10][10];

        System.out.print("Diagonal elements: ");
        for (int i = 0 ; i < diagonalElementsArray.length; i++) {
            for (int j = 0; j < diagonalElementsArray[i].length; j++) {
                if (i == j) {
                    diagonalElementsArray[i][j] = (i + 1) * (j + 1);
                    System.out.printf("%-5s", diagonalElementsArray[i][j]);
                }
            }
        }
    }

    public static void randomNumbers() {
        Random random = new Random();
        int arraySize = random.nextInt(10);
        int[] randomArray = new int[arraySize];
        int[] copyOfRandomArray = new int[arraySize];
        int right = 0;
        int left = 0;

        for (int i = 0; i < arraySize; i++) {
            int randomElement = random.nextInt(100);
            randomArray[i] = randomElement;

            if (randomElement % 2 == 0){
                right++;
                copyOfRandomArray[copyOfRandomArray.length - right] = randomElement;
            }else{
                copyOfRandomArray[left] = randomElement;
                left++;
            }
        }
        System.out.println("Random array : " + Arrays.toString(randomArray));
        System.out.println("Copy of array: " + Arrays.toString(copyOfRandomArray));
    }
}

