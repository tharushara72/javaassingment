import java.util.Scanner;
public class Length {

    public static void main(String[] args) {




            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the length in centimeters: ");
            double centimeters = scanner.nextDouble();

            double totalInches = centimeters / 2.54;


            int feet = (int) (totalInches / 12);  // 1 foot = 12 inches
            double inches = totalInches % 12;

            System.out.printf("%.2f cm is  %d feet and %.2f inches.%n", centimeters, feet, inches);
        }


























}
