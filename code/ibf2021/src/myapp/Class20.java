package myapp;

import java.io.Console;

public class Class20 
{
    public static void main(String[] args) {
        Console cons = System.console();
        String name = "";

        while (name.length() <= 0) {
            name = cons.readLine("What is your name? ");
            name = name.trim();
        }

        System.out.printf("Hello %s\n", name);
    }
}
