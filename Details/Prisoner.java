package Jail_management_system.Details;

import java.util.HashSet;
import java.util.Scanner;

public class Prisoner {
    private int regNo;
    private String name;
    private int age;
    private String gender;
    private String crime;
    private String sentenceDuration;
    private int allocatedCell;

    private static HashSet<Integer> usedRegNos = new HashSet<>();  
    private static HashSet<Integer> allocatedCells = new HashSet<>();

    public Prisoner() {
        
    }

    public void addPrisoner(Scanner s) {
        
        while (true) {
            System.out.print("Enter Registered Number: ");
            int reg = s.nextInt();
            s.nextLine();

            if (usedRegNos.contains(reg)) {
                System.out.println("This registration number is given to another prisoner, Please choose another.");
            }
             else {
                this.regNo = reg;
                usedRegNos.add(reg);
                break;
            }
        }

        System.out.print("Enter Name: ");
        this.name = s.nextLine();
        
        System.out.print("Enter Age: ");
        this.age = s.nextInt();
        s.nextLine(); 
        
        System.out.print("Enter Gender: ");
        this.gender = s.nextLine();

        System.out.print("Enter Crime: ");
        this.crime = s.nextLine();
        
        System.out.print("Enter Duration: ");
        this.sentenceDuration = s.nextLine();

        
        while (true) {
            System.out.print("Allocate a cell (1-100): ");
            int cell = s.nextInt();
            s.nextLine(); 

            if (allocatedCells.contains(cell)) {
                System.out.println("This cell is already allocated,please choose another.");
            } else {
                this.allocatedCell = cell;
                allocatedCells.add(cell);
                break;
            }
        }
    }

    public void displayInfo() {
        System.out.println("\nPrisoner Information:");
        System.out.println("Registered Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Crime: " + crime);
        System.out.println("Sentence Duration: " + sentenceDuration);
        System.out.println("Allocated Cell: " + allocatedCell);
    }
}
