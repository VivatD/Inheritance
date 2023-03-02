package geometry;

public class Circle extends TwoDimensionalShape{

    @Override
    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
}
