


public class Area {
    private double radius;


    public Area(double radius) {
        this.radius = radius;
    }
    public Area() {
        this.radius = 0.0;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }


    public double computeArea() {
        return Math.PI * radius * radius;
    }


    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}
