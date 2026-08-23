package lab3_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<book> bookList = new ArrayList<>();

        // Number of books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        // Collect book details
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Book " + (i + 1));

            System.out.print("Enter author: ");
            String author = sc.next();

            System.out.print("Enter title: ");
            String title = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter publisher: ");
            String publisher = sc.next();

            System.out.print("Enter stock position: ");
            int stock = sc.nextInt();

            bookList.add(new book(author, title, price, publisher, stock));
        }

        int choice;

        do {

            System.out.println("\n******** BOOK SHOP ********");
            System.out.println("1. Search book");
            System.out.println("2. Display all books");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // CASE 1: SEARCH BOOK
                case 1:

                    System.out.print("Enter book title: ");
                    String searchTitle = sc.next();

                    System.out.print("Enter author: ");
                    String searchAuthor = sc.next();

                    boolean found = false;

                    for (book b : bookList) {

                        if (b.searchBook(searchTitle, searchAuthor)) {

                            System.out.println("\nBook Found!");
                            System.out.println(b);

                            System.out.print("Enter number of copies required: ");
                            int copies = sc.nextInt();

                            if (b.checkStock(copies)) {

                                double totalCost = b.calculateCost(copies);

                                System.out.println("Total cost: " + totalCost);

                            } else {

                                System.out.println("required copies not in stock");
                            }

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book is not available.");
                    }

                    break;


                // CASE 2: DISPLAY ALL BOOKS
                case 2:

                    System.out.println("\n===== ALL BOOKS =====");

                    for (book b : bookList) {
                        System.out.println(b);
                    }

                    break;


                // CASE 3: EXIT
                case 3:

                    System.out.println("Exiting Book Shop...");
                    break;


                default:

                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}