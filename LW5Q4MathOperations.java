public class LW5Q4MathOperations {
    // Private static variable pi
    private static final double pi = 3.14159;

    // Static method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return pi * radius * radius;
    }

    // Static method to calculate the area of a square
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Getter method to access pi (if needed)
    public static double getPi() {
        return pi;
    }
}

