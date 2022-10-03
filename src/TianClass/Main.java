package TianClass;

public class Main {
    public static void main(String[] args) {
        // check TRiangle
        System.out.println("---------------TRIANGLE-----------------------");

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);


        // check Shape
        System.out.println("-----------------SHAPE---------------------");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("green ");
        System.out.println(shape);
    }
}
