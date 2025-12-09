// 2. CalculateSum skip the two consecutive values if current value is 13
import java.util.*;
import java.io.*;

class calculateSum {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter numbers separated by space (end input with a non-number):");

        // Read all numbers into an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        while (scn.hasNextInt()) {
            numbers.add(scn.nextInt());
        }

        int sum= UserMainCode.calculateSum(numbers);
        System.out.println("Sum (skipping 13 and next number): " + sum);
    }
}

class UserMainCode {
    public static int calculateSum(List <Integer> nums) {
        int sum= 0;
        boolean skipNext= false;

        for (int i: nums){
                if(skipNext){
                    skipNext= false;
                    continue;
                }
            
            if (i == 13) {    // Skip current & next number
                skipNext= true;
                continue;
            }
            sum+= i;
        }

        return sum;
    }
}
