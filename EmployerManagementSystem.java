import java.util.ArrayList;
import java.util.Scanner;

public class EmployerManagementSystem {
    private static ArrayList<Employer> employers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Employer Management System ===");
            System.out.println("1. Add Employer");
            System.out.println("2. Display All Employers");
            System.out.println("3. Search Employer by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addEmployer();
                    break;
                case 2:
                    displayEmployers();
                    break;
                case 3:
                    searchEmployerById();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void addEmployer() {
        System.out.print("Enter Employer ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employer Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employer Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Employer Salary: ");
        double salary = scanner.nextDouble();

        Employer employer = new Employer(id, name, department, salary);
        employers.add(employer);

        System.out.println("Employer added successfully!");
    }

    private static void displayEmployers() {
        if (employers.isEmpty()) {
            System.out.println("No employers to display.");
        } else {
            System.out.println("\nList of Employers:");
            for (Employer employer : employers) {
                System.out.println(employer);
            }
        }
    }

    private static void searchEmployerById() {
        System.out.print("Enter Employer ID to search: ");
        int id = scanner.nextInt();

        for (Employer employer : employers) {
            if (employer.getId() == id) {
                System.out.println("Employer Found:");
                System.out.println(employer);
                return;
            }
        }
        System.out.println("Employer with ID " + id + " not found.");
    }
}
