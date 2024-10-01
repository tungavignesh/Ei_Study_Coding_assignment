import java.util.Scanner;

public class SatelliteCommandSystem {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Satellite Command System!");
        System.out.println("Available commands: Rotate Direction, ActivatePanels, DeactivatePanels, CollectData, Exit");

        while (true) {
            System.out.print("Enter command: ");
            String input = scanner.nextLine().trim();
            String[] commandParts = input.split(" ");

            try {
                switch (commandParts[0].toLowerCase()) { 
                    case "rotate":
                        if (commandParts.length < 2) throw new IllegalArgumentException("Direction not provided.");
                        satellite.rotate(commandParts[1]);
                        break;
                    case "activatepanels":
                        satellite.activatePanels();
                        break;
                    case "deactivatepanels":
                        satellite.deactivatePanels();
                        break;
                    case "collectdata":
                        satellite.collectData();
                        break;
                    case "exit":
                        System.out.println("Exiting the system.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Unknown command!!");
                }
                System.out.println(satellite);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
