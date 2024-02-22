package Assignment5;

import java.util.Scanner;

public class AnimalPicker {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Hi!");
        System.out.println("Would like to see: a 1. dog or a 2. cat");

        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("CAT ASCII ART HERE");
        }

        if (choice == 2){
            System.out.println("DOG ASCII ART HERE");

        }



}
    
    
}
