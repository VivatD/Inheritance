package geometry;

public abstract class ThreeDimensionalShape extends Shape{

    @Override
    public double getArea(double radius) {
        return radius;
    }
    public abstract double getVolume(double radius);
}
