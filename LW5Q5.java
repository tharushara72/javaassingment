public class LW5Q5 {

    // Static method to calculate the area of a rectangle
    public static int calculateRectangleArea(int length, int width) {
        return length * width;
    }

    // Static method to calculate the area of a square
    public static int calculateSquareArea(int sideLength) {
        return sideLength * sideLength;
    }

    public static void main(String[] args) {
        // Declare and initialize variables
        int rectangleLength = 5;
        int rectangleWidth = 8;
        int squareSideLength = 4;

        // Calculate and print the area of the rectangle
        int rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Calculate and print the area of the square
        int squareArea = calculateSquareArea(squareSideLength);
        System.out.println("Area of the square: " + squareArea);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
