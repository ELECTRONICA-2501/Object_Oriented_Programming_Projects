package CS116Lab1Circle;

public class CircleTest {
    public static void main(String[] args) {
    Circle c1 = new Circle(2.5);
    Circle c2 = new Circle();
    Circle c3 = new Circle(3.5);

    c2.setRadius(3.0);

        System.out.println("Radius of c1: " + c1.getRadius());
        System.out.println("Radius of c2: " + c2.getRadius());
        System.out.println("Radius of c3: " + c3.getRadius());

        System.out.println("Area of c1: " + c1.area());
        System.out.println("Area of c2: " + c2.area());
        System.out.println("Area of c3: " + c3.area());

        System.out.println("Circumference of c1: " + c1.circumference());
        System.out.println("Circumference of c2: " + c2.circumference());
        System.out.println("Circumference of c3: " + c3.circumference());

        System.out.println("Diameter of c1: " + c1.diameter());
        System.out.println("Diameter of c2: " + c2.diameter());
        System.out.println("Diameter of c3: " + c3.diameter());

        System.out.println("c1 and c2 are equal? " + c1.equalsTo(c2));
        System.out.println("c2 and c3 are equal? " + c2.equalsTo(c3));

        System.out.println("c1 compareTo c2? " + c1.compareTo(c2));
        System.out.println("c2 compareTo c3? " + c2.compareTo(c3));

        System.out.println ("c1: " + c1.toString());
        System.out.println ("c2: " + c2.toString());
        System.out.println ("c3: " + c3.toString());
    }
}
