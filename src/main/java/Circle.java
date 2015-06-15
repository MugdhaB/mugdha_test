/**
 * Created by mbapat on 6/15/2015.
 */
public class Circle implements Shape {
    public static final double PIE = 3.14;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PIE * radius * radius;
    }
}
