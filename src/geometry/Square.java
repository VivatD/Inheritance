package geometry;

public class Square extends TwoDimensionalShape{
    @Override
    public double getArea(double radius) {
        return radius * radius;
    }
}
