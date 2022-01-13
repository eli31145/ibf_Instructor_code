package myapp;

import java.io.Console;

public class Class17 
{
    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine("What is your hobby? ");
        input = input.trim();

        if (input.equals("swim")) {
            System.out.println("The nearest public swimming pool is in Clementi");
        }
        else if (input.equals("jog")) {
            System.out.println("How fast can you jog a kilometer?");
        }
        else if (input.equals("code")) {
            System.out.println("Cool!");
        }
        else {
            System.out.printf("What is this %s hobby of yours?", input);
        }
    }
}
