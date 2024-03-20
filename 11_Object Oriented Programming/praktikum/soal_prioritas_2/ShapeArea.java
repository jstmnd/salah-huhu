public class ShapeArea {
    private static final double PHI = 3.14;

    public static int getSquareArea(int side) {
        return side * side;
    }

    public static int getRectangleArea(int length, int width) {

        return length * width;
    }

    public static double getCircleArea(int radius) {

        return PHI * radius * radius;
    }

    public static double getTrapezoidArea(int height, int base1, int base2) {

        return 0.5 * (base1 + base2) * height;
    }
}
