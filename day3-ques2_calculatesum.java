// 2. CalculateSum skip the two consecutive values if current value is 13

import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by space (end input with a non-number):");

        // Read all numbers into an ArrayList
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }

        int sum = Calculator.calculateSum(numbers);

        System.out.println("Sum (skipping 13 and next number): " + sum);

        sc.close();
    }
}

class Calculator {
    public static int calculateSum(java.util.List<Integer> numbers) {
        int sum = 0;
        boolean skipNext = false;

        for (int num : numbers) {
            if (skipNext) {
                // Skip this number
                skipNext = false;
                continue;
            }

            if (num == 13) {
                // Skip current AND next number
                skipNext = true;
                continue;
            }

            sum += num;
        }

        return sum;
    }
}