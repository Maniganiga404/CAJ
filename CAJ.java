package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class lab2 {
    private static Scanner sc = null;
    public static int[] constructArray() {
        System.out.println("Enter the number of elements");
        int  size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i< size;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void GuessAns(int[] args){


        String question = "What is the capital of France?";
        String correctAnswer = "Paris";

        int maxAttempts = 3;
        boolean isCorrect = false;

        System.out.println("Answer the following question. You have " + maxAttempts + " chances!");
        System.out.println("Question: " + question);

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + " - Your Answer: ");
            String userAnswer = sc.nextLine().trim();

            // Check if the answer matches (ignoring capital/lowercase letters)
            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Good");
                isCorrect = true;
                break; // Exit the loop early because they got it right
            } else {
                if (attempt < maxAttempts) {
                    System.out.println("Incorrect. Try again!");

                    if (!isCorrect) {
                        System.out.println("\nSorry, you have used all your attempts.");
                        System.out.println("The correct answer is: " + correctAnswer);
                    }

                    // Close the scanner resource
                    sc.close();
                }
            }
        }

    }


    public static void KthLargestSmallest(int[] args){
        System.out.println("Enter K value");
        int k=sc.nextInt();

        if (k <= 0 || k > args.length) {
            System.out.println("Invalid value of K.");
            return;
        }

        Arrays.sort(args);

        int kthSmallest = args[k - 1];

        int kthLargest = args[args.length - k];

        System.out.println(k + "rd Smallest element: " + kthSmallest);
        System.out.println(k + "rd Largest element: " + kthLargest);
        }


    public static void duplicate(int[] args) {
        System.out.println("Duplicate values are :");
        for (int i = 0; i < args.length; i++) {
            for (int j = i+1; j < args.length; j++) {
                if (args[i] == (args[j])) {
                    System.out.println(args[i]);
                    break;
                }
            }
        }
    }
    public static void mainApp() {
        int choice=0;
        do{
            System.out.println("********************Main App************************");
            System.out.println("1. Q1");
            System.out.println("2. Q2");
            System.out.println("3. Q3");
            System.out.println("4. Q4");
            System.out.println("5. Q5");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice){
                case 1:{
                    int[] arr =constructArray();
                    duplicate(arr);
                    break;
                }
                case 2:{
                    int[] arr1 = constructArray();
                    KthLargestSmallest(arr1);
                    break;
                }
                case 3:{
                    int[] arr2 = constructArray();
                    GuessAns(arr2);
                    break;

                }

            }
        }
        while(choice>0);

    }
    public static void main(String[] args) {
//        int[] i;
//        i = new int[5];
        String[] user = {"admin","user"};
        String[] password = {"abc","xyz"};
        sc = new Scanner(System.in);
        System.out.println("Enter username & password");
        String username =sc.next();
        String pass = sc.next();
        boolean checked = false;
        for(int i=0;i<user.length;i++){
            if((user[i].equals(username)) && (password[i].equals(pass))){
                checked = true;
                break;
            }
        }
        if(checked){
            mainApp();
        }
        else{
            System.out.println("Unauthorized user");
        }



    }
}