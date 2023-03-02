package parallelogram;

public class Parallelogram {

    public static int calculatePerimeter(int length, int width) {
        return 2 * (length + width);
    }
    public static int calculatePerimeter(int sideLength) {
        return 4 * sideLength;
    }
    public static double calculateArea(int length, double width) {
        return length * width;
    }
    public static int calculateArea(int sideLength) {
        double sin_x = Math.sin(Math.toRadians(85));

        return (int) ((sideLength * sideLength) * sin_x);
    }
}
