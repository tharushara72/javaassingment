
import java.util.Scanner;
public class Name {
    public static void main(String[] args){




                Scanner scanner = new Scanner(System.in);


                System.out.print("Please enter your full name (First Middle Last): ");
                String fullName = scanner.nextLine();


                String[] nameParts = fullName.trim().split(" ");

                // Check if the input has exactly three parts (First, Middle, Last)
                if (nameParts.length == 3) {
                    String firstName = nameParts[0];
                    String middleName = nameParts[1];
                    String lastName = nameParts[2];


                    char middleInitial = middleName.charAt(0);

                    System.out.println(lastName + ", " + firstName + " " + middleInitial + ".");
                } else {

                    System.out.println("Error: Please enter your full name in the format First Middle Last.");
                }

                scanner.close();
            }
































}
