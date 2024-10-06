

import java.util.Scanner;

public class LW2Q4  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];  // Array to store five numbers

        System.out.println("Enter five numbers:");

        // Read five numbers from the user and store them in the array
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Find the largest and second-largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;  // Update second-largest before changing the largest
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;  // Update second-largest only if it's not equal to the largest
            }
        }

        // Display the second-largest element
        System.out.println("The second-largest number is: " + secondLargest);

        scanner.close(); // Close the scanner
    }
}
