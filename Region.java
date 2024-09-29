
    import java.util.Scanner;

    public class Region {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the radius of the inner circle (ri): ");
            double innerRadius = scanner.nextDouble();

            System.out.print("Enter the radius of the outer circle (ro): ");
            double outerRadius = scanner.nextDouble();


            Area innerCircle = new Area(innerRadius);
            Area outerCircle = new Area(outerRadius);


            double innerArea = innerCircle.computeArea();
            double outerArea = outerCircle.computeArea();


            double shadedArea = outerArea - innerArea;


            System.out.printf("The area of the circular region (shaded area) is: %.2f\n", shadedArea);


            System.out.printf("Inner Circle Area: %.2f, Outer Circle Area: %.2f\n", innerArea, outerArea);
            System.out.printf("Inner Circle Circumference: %.2f, Outer Circle Circumference: %.2f\n",
                    innerCircle.computeCircumference(), outerCircle.computeCircumference());

            scanner.close();
        }





































}
