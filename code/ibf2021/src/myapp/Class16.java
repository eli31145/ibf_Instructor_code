package myapp;

import java.io.Console;

public class Class16 
{
    public static void main(String[] args) {
        Console cons = System.console();
        String name = cons.readLine("What is your name? ");

        if (name.length() > 0) {
            System.out.printf("Hello %s\n", name);
        } else {
            System.err.println("You have not told me your name");
        }
    }
}
