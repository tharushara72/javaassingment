
    import java.util.Scanner;
    public class LW2Q2 {






            public static int countDigits(int number) {
                if (number == 0) {
                    return 1; // Special case for 0
                }

                number = Math.abs(number); // Consider absolute value for negative numbers
                int count = 0;
                while (number > 0) {
                    count++;
                    number /= 10; // Remove the last digit
                }
                return count;
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.print("Enter an integer (negative to quit): ");
                    int input = scanner.nextInt();

                    if (input < 0) {
                        System.out.println("Exiting program.");
                        break; // Exit loop when a negative number is entered
                    }

                    // Call the countDigits method and display the number of digits
                    System.out.println("Number of digits: " + countDigits(input));
                }
                scanner.close(); // Close the scanner
            }
        }

























