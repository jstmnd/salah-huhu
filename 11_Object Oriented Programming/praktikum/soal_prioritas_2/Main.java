//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("luas persegi: " + ShapeArea.getSquareArea(12));
        System.out.println("luas persegi panjang: " + ShapeArea.getRectangleArea(7,8));
        System.out.println("luas lingkaran: " + ShapeArea.getCircleArea(21));
        System.out.println("luas trapesium: " + ShapeArea.getTrapezoidArea(5,6,2));
    }
}