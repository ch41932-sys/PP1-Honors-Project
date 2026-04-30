import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        ArrayList<Upgrade> selectedUpgrades = new ArrayList<>();
        
        System.out.println("--- Welcome to Apex Drive Customizer ---");
        
  
        SUV mySUV = new SUV("Audi Q8-Tech", 72000.00, "Lucio-Speed");
        mySUV.displayDetails();

        boolean adding = true;
        while (adding) {
            try { 
                System.out.println("\nAvailable Upgrades:");
                System.out.println("1. OLED Digital Cockpit ($2,500)");
                System.out.println("2. AI Co-Pilot ($5,000)");
                System.out.println("3. Matrix LED Lighting ($1,800)");
                System.out.println("4. Finish Build");
                System.out.print("Select an option: ");

                int choice = Integer.parseInt(input.nextLine());

                if (choice == 1) {
                    selectedUpgrades.add(new Upgrade("OLED Digital Cockpit", 2500));
                } else if (choice == 2) {
                    selectedUpgrades.add(new Upgrade("AI Co-Pilot", 5000));
                } else if (choice == 3) {
                    selectedUpgrades.add(new Upgrade("Matrix LED Lighting", 1800));
                } else if (choice == 4) {
                    adding = false;
                } else {
                    System.out.println("Invalid selection. Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid number (1-4).");
            }
        }

        
        double totalCost = mySUV.getBasePrice();
        System.out.println("\n--- Final Build Summary ---");
        for (Upgrade u : selectedUpgrades) {
            System.out.println("+ " + u.getName() + ": $" + u.getCost());
            totalCost += u.getCost();
        }
        System.out.printf("Total Luxury Investment: $%.2f\n", totalCost);
        System.out.println("Your " + mySUV.getHeroTheme() + " edition is ready for the road!");
    }
}