package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EIS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<employee> emp = new ArrayList<>();

        // 1. Collect employee details
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("Enter employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter employee name: ");
            String name = sc.next();

            System.out.print("Enter employee designation: ");
            String designation = sc.next();

            System.out.print("Enter employee salary: ");
            double salary = sc.nextDouble();

            emp.add(new employee(id, name, designation, salary));
        }

        int choice;

        do {

            System.out.println("\n******** EIS ********");
            System.out.println("1. Search employee based on ID");
            System.out.println("2. Increment salary by 10%");
            System.out.println("3. Display all employees");
            System.out.println("4. Delete employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // CASE 1: SEARCH
                case 1:

                    System.out.print("Enter employee ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (employee e : emp) {

                        if (e.searchEmployee(searchId)) {
                            System.out.println("\nEmployee Found:");
                            System.out.println(e);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }

                    break;


                // CASE 2: SALARY INCREMENT
                case 2:

                    System.out.print("Enter employee ID: ");
                    int incrementId = sc.nextInt();

                    boolean incrementFound = false;

                    for (employee e : emp) {

                        if (e.searchEmployee(incrementId)) {

                            e.incrementSalary();

                            System.out.println("Salary incremented by 10%.");
                            System.out.println(e);

                            incrementFound = true;
                            break;
                        }
                    }

                    if (!incrementFound) {
                        System.out.println("Employee not found.");
                    }

                    break;


                // CASE 3: DISPLAY
                case 3:

                    System.out.println("\n===== ALL EMPLOYEES =====");

                    for (employee e : emp) {
                        System.out.println(e);
                    }

                    break;


                // CASE 4: DELETE
                case 4:

                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleteFound = false;

                    for (int i = 0; i < emp.size(); i++) {

                        if (emp.get(i).searchEmployee(deleteId)) {

                            emp.remove(i);

                            System.out.println("Employee deleted successfully.");

                            deleteFound = true;
                            break;
                        }
                    }

                    if (!deleteFound) {
                        System.out.println("Employee not found.");
                    }

                    break;


                // CASE 5: EXIT
                case 5:

                    System.out.println("Exiting EIS...");
                    break;


                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}