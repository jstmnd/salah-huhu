import java.util.Scanner;

public class prioritas1_1 {

    private static final int WeightLessThan2kg = 10000;
    private static final int Weight2to7kg = 15000;
    private static final int Weight8to15kg = 25000;
    private static final int WeightMoreThan15kg = 40000;

    private static final int DistanceLessThan1km = 2000;
    private static final int Distance1to7km = 5000;
    private static final int Distance8to15km = 10000;
    private static final int DistanceMoreThan15km = 20000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char loopInput;

        do {
            System.out.print("Berat paket (kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Jarak tempuh (km): ");
            double distance = scanner.nextDouble();

            int cost = calculate(weight, distance);
            System.out.println("Biaya: Rp " + cost);

            System.out.print("Ingin menghitung biaya paket lain? (Y/N): ");
            loopInput = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(loopInput) == 'Y');

        scanner.close();
    }

    private static int calculate(double weight, double distance) {
        int weightCost = getWeight(weight);
        int distanceCost = getDistance(distance);
        return weightCost + distanceCost;
    }

    private static int getWeight(double weight) {
        if (weight < 2) return WeightLessThan2kg;
        else if (weight <= 7) return Weight2to7kg;
        else if (weight <= 15) return Weight8to15kg;
        else return WeightMoreThan15kg;
    }

    private static int getDistance(double distance) {
        if (distance < 1) return DistanceLessThan1km;
        else if (distance <= 7) return Distance1to7km;
        else if (distance <= 15) return Distance8to15km;
        else return DistanceMoreThan15km;
    }
}