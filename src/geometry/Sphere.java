package geometry;

public class Sphere extends ThreeDimensionalShape{

    @Override
    public double getArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }
    @Override
    public double getVolume(double radius) {
        return (4/3) * Math.PI * (Math.pow(radius, 3));
    }

}
