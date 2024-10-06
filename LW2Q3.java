


import java.util.Scanner;

public class LW2Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt(); // Read the number of rows from user input

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the current row
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing a row
            System.out.println();
        }

        scanner.close(); // Close the scanner
    }
}
