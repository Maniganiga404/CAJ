package lab3_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        // Initial 5 car objects

        cars.add(new Car(
                "Brezza",
                "VX",
                "02/10/2017",
                "White",
                650500.00
        ));

        cars.add(new Car(
                "Venue",
                "SX",
                "20/9/2018",
                "White",
                750000.00
        ));

        cars.add(new Car(
                "Ciaz",
                "VX",
                "15/12/2015",
                "White",
                600000.00
        ));

        cars.add(new Car(
                "Ecosport",
                "LX",
                "21/6/2018",
                "Blue",
                500500.00
        ));

        cars.add(new Car(
                "Nexon",
                "SX",
                "15/10/2019",
                "Green",
                850500.00
        ));

        int choice;

        do {

            System.out.println("\n******** CAR DATABASE ********");
            System.out.println("1. Display all cars");
            System.out.println("2. Search car");
            System.out.println("3. Book car");
            System.out.println("4. Test getters and setters");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // CASE 1: DISPLAY ALL CARS
                case 1:

                    System.out.println("\n===== AVAILABLE CARS =====");

                    if (cars.isEmpty()) {
                        System.out.println("No cars available.");
                    } else {

                        for (Car c : cars) {
                            System.out.println(c);
                        }
                    }

                    break;


                // CASE 2: SEARCH CAR
                case 2:

                    System.out.print("Enter car name to search: ");
                    String searchName = sc.next();

                    boolean found = false;

                    for (Car c : cars) {

                        if (c.getName().equalsIgnoreCase(searchName)) {

                            System.out.println("\nCar Found:");
                            System.out.println(c);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Car not found.");
                    }

                    break;


                // CASE 3: BOOK CAR
                case 3:

                    System.out.print("Enter car name to book: ");
                    String bookingName = sc.next();

                    boolean booked = false;

                    for (int i = 0; i < cars.size(); i++) {

                        if (cars.get(i).getName()
                                .equalsIgnoreCase(bookingName)) {

                            System.out.println("\nCar Details:");
                            System.out.println(cars.get(i));

                            System.out.println("Car booked successfully.");

                            // Remove car after booking
                            cars.remove(i);

                            booked = true;
                            break;
                        }
                    }

                    if (!booked) {
                        System.out.println("Car not available.");
                    }

                    break;


                // CASE 4: TEST GETTERS AND SETTERS
                case 4:

                    if (!cars.isEmpty()) {

                        Car c = cars.get(0);

                        System.out.println("\nTesting Getters:");

                        System.out.println("Name: " + c.getName());
                        System.out.println("Model: " + c.getModel());
                        System.out.println("Year: " + c.getYearOfPurchase());
                        System.out.println("Color: " + c.getColor());
                        System.out.println("Price: " + c.getPrice());

                        System.out.println("\nTesting Setters:");

                        c.setName("UpdatedCar");
                        c.setModel("UpdatedModel");
                        c.setYearOfPurchase("01/01/2020");
                        c.setColor("Black");
                        c.setPrice(900000);

                        System.out.println("\nUpdated Car:");
                        System.out.println(c);

                    } else {

                        System.out.println("No cars available to test.");
                    }

                    break;


                // CASE 5: EXIT
                case 5:

                    System.out.println("Exiting Car Database...");

                    break;


                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
