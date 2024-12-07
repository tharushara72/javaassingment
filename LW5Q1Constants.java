public class LW5Q1Constants {
    // Declare the constants
    public static final double PI = 3.14159;
    public static final int SPEED_OF_LIGHT = 299792458;


    public final double GRAVITY;


    public LW5Q1Constants(double gravity) {
        this.GRAVITY = gravity;
    }

    // Main method to demonstrate usage
    public static void main(String[] args) {

        LW5Q1Constants earthConstants = new LW5Q1Constants(9.81);
        System.out.println("PI: " + LW5Q1Constants.PI);
        System.out.println("Speed of Light: " + LW5Q1Constants.SPEED_OF_LIGHT + " m/s");
        System.out.println("Gravity: " + earthConstants.GRAVITY + " m/s²");
    }
}

