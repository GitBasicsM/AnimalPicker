package Assignment5;

import java.util.Scanner;

public class AnimalPicker {

    private static final Ani[] Ani = new Ani[2];
    private static final Scanner scanner = new Scanner(System.in);

    static {
        Ani[0] = new Ani("DOG PRINTED");
        Ani[1] = new Ani("CAT PRINTED");

    }

    public static void main(String[] args) {


        System.out.println("Hi!");
        System.out.println("Would like to see: a 1. dog or a 2. cat");

        int choice = scanner.nextInt();
        while (choice < 1 || choice > Ani.length) {
            System.out.println("Invalid choice, please try again:");
            choice = scanner.nextInt();
        }

        if(choice == 1){

            System.out.println(Ani[0].name);

    }
    if(choice == 2){

        System.out.println(Ani[1].name);

}




}

static class Ani {
    private final String name;

    public Ani(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

    
    
}
