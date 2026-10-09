import java.util.Scanner;
public class SmartIrrigationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== SMART IRRIGATION SYSTEM =====");
        System.out.print("Enter plant name: ");
        String plantName = sc.nextLine();
        System.out.print("Enter required moisture level (0-100): ");
        int requiredMoisture = sc.nextInt();
        System.out.print("Enter current soil moisture level (0-100): ");
        int currentMoisture = sc.nextInt();
        System.out.println();
        System.out.println("----- SYSTEM STATUS -----");
        System.out.println("Plant: " + plantName);
        System.out.println("Required moisture: " + requiredMoisture + "%");
        System.out.println("Current moisture: " + currentMoisture + "%");
        if (currentMoisture < requiredMoisture) {
            System.out.println("Soil is too dry.");
            System.out.println("Pump: ON");
            System.out.println("Watering required.");
        } else {
            System.out.println("Soil has enough moisture.");
            System.out.println("Pump: OFF");
            System.out.println("No watering required.");
        }
        sc.close();
    }
}