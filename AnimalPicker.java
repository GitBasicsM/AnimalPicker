package Assignment5;

import java.util.Scanner;

public class AnimalPicker {

    
    private static final Ani[] Ani = new Ani[3];
    private static final Scanner scanner = new Scanner(System.in);

    static {
        Ani[0] = new Ani("  .\r\n" + // DOG 
                        " ..^____/\r\n" + //
                        "`-. ___ )\r\n" + //
                        "  ||  || mh\r\n" + //
                        "");
        Ani[1] = new Ani("|\\---/|\r\n" + // CAT
                        "| o_o |\r\n" + //
                        " \\_^_/");
        Ani[2] = new Ani(".--.\n" + //
                        "|__| .-------.\n" + //
                        "|=.| |.-----.|\n" + //
                        "|--| || KCK ||\n" + //
                        "|  | |'-----'|\n" + //
                        "|__|~')_____('");

    }

    public static void main(String[] args) {


        System.out.println("Hi!");
        System.out.println("Would like to see: a 1. dog or a 2. cat or a 3. computer");

        int choice = scanner.nextInt();
        while (choice < 1 || choice > Ani.length) {
            System.out.println("Invalid choice, please try again:");
            choice = scanner.nextInt();
        }

        if(choice == 1)
        {
            System.out.println(Ani[0].name);
        }

        else if(choice == 2)
        {
            System.out.println(Ani[1].name);
        }

        else if(choice == 3)
        {
            System.out.println(Ani[2].name);
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




