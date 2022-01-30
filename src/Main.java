

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(1, 3);
        Triangle triangleB = new Triangle(3, 3);

        System.out.println(triangleA.area());
        System.out.println(triangleB.area());

        System.out.println(Triangle.numSides);
        System.out.println(triangleA.numSides);
    }

}
