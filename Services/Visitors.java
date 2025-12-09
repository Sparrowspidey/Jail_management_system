package Jail_management_system.Services;

import java.util.Scanner;

public class Visitors {
    private String visitorName;
    private int age;
    private String relation;
    private int visitedPrisonerRegNo;
    private int timeIn;
    private int timeOut;

    public Visitors() {
        
    }

    public void addVisitor(Scanner s) {
        System.out.print("Enter Visitor Name: ");
        this.visitorName = s.nextLine();

        System.out.print("Enter Age of Visitor: ");
        this.age = s.nextInt();
        s.nextLine();

        System.out.print("Relation to the Prisoner: ");
        this.relation = s.nextLine();

        System.out.print("Reg No of the Prisoner Visited: ");
        this.visitedPrisonerRegNo = s.nextInt();
        s.nextLine(); 

        System.out.print("Enter Time In 24-hour format (only hour): ");
        this.timeIn = s.nextInt();
        s.nextLine(); 

        System.out.print("Enter Time Out 24-hour format (only hour): ");
        this.timeOut = s.nextInt();
        s.nextLine(); 
    }

    public void displayVisitorsInfo() {
        System.out.println("Visitor Name: " + visitorName);
        System.out.println("Age: " + age);
        System.out.println("Relation: " + relation);
        System.out.println("Visited Prisoner Reg No: " + visitedPrisonerRegNo);
        System.out.println("Time In: " + timeIn);
        System.out.println("Time Out: " + timeOut);
    }
}
