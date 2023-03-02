import geometry.*;
import person.Staff;
import person.Student;

import static parallelogram.Parallelogram.calculateArea;
import static parallelogram.Parallelogram.calculatePerimeter;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ion","Dacia 4","Java",12,44.4);
        System.out.println(student);
        Staff staff = new Staff("Dumitru","Puskin 44","L.T.M.E.", 120);
        System.out.println(staff);

        System.out.println("Calculate perimeter of parallelogram: " + calculatePerimeter(6,8));
        System.out.println("Calculate perimeter of parallelogram using sideLength: " + calculatePerimeter(6));
        System.out.println("Area of parallelogram using sideLength: "+ calculateArea(6));
        System.out.println("Area of parallelogram: "+ calculateArea(6, 8));

        TwoDimensionalShape circle = new Circle();
        TwoDimensionalShape square = new Square();
        ThreeDimensionalShape sphere = new Sphere();
        ThreeDimensionalShape cube = new Cube();

        System.out.println("Area of circle: "+circle.getArea(5.5));
        System.out.println("Area of square: "+square.getArea(4.0));
        System.out.println("Area of sphere: "+sphere.getArea(5.1));
        System.out.println("Volume of square: " + sphere.getVolume(5.1));
        System.out.println("Area of cube: "+cube.getArea(8.0));
        System.out.println("Volume of cube: " + cube.getVolume(8.0));
    }
}
