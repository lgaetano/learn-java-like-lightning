public class Triangle {

    static int numSides = 3;
    // Instance variables
    double base;
    double height;

    public Triangle(double base,
                    double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return (this.base * this.height) / 2;
    }
}