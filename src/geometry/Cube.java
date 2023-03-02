package geometry;

public class Cube extends ThreeDimensionalShape{

    @Override
    public double getArea(double sideOfCube) {
        return 6 * sideOfCube * sideOfCube;
    }

    @Override
    public double getVolume(double sideOfCube) {
        return sideOfCube * sideOfCube * sideOfCube;
    }
}
