package Jail_management_system;

import java.util.ArrayList;
import java.util.Scanner;

import Jail_management_system.Details.Prisoner;
import Jail_management_system.Services.Visitors;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Prisoner> prisoners = new ArrayList<>();
        ArrayList<Visitors> visitors = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Chanchalguda Central Jail =====");
            System.out.println("\n----- Select an option -----");
            System.out.println("1. Add a prisoner");
            System.out.println("2. Add a visitor");
            System.out.println("3. Display details of prisoners");
            System.out.println("4. Display details of visitors");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of prisoners to add: ");
                    int x = s.nextInt();
                    s.nextLine();
                    for (int i = 0; i < x; i++) {
                        System.out.println("\nEnter details for prisoner " + (i + 1) + ":");
                        Prisoner p = new Prisoner();
                        p.addPrisoner(s);
                        prisoners.add(p);
                    }
                    break;

                case 2:
                    System.out.print("Enter number of visitors to add: ");
                    int numVisitors = s.nextInt();
                    s.nextLine();
                    for (int i = 0; i < numVisitors; i++) {
                        System.out.println("\nEnter details for visitor " + (i + 1) + ":");
                        Visitors v = new Visitors();
                        v.addVisitor(s);
                        visitors.add(v);
                    }
                    break;

                case 3:
                    if (prisoners.isEmpty()) {
                        System.out.println("\nNo prisoner records found.");
                    } else {
                        System.out.println("\n===== Prisoner Details =====");
                        for (int i = 0; i < prisoners.size(); i++) {
                            System.out.println("Prisoner " + (i + 1) + ":");
                            prisoners.get(i).displayInfo();
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 4:
                    if (visitors.isEmpty()) {
                        System.out.println("\nNo visitor records found.");
                    } else {
                        System.out.println("\n===== Visitor Details =====");
                        for (int i = 0; i < visitors.size(); i++) {
                            System.out.println("Visitor " + (i + 1) + ":");
                            visitors.get(i).displayVisitorsInfo();
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exited...");
                    s.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}
