package myapp;

import java.io.Console;

public class Class19 
{
    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine("What is your age? ");
        Integer age = Integer.parseInt(input);

        if (age <= 0)
            System.err.println("Are you sure?");
        else if ((age > 0) && (age < 7))
            System.out.println("You are a toddler");
        else if ((age >= 7) && (age < 12))
            System.out.println("You are a child");
        else if ((age >= 12) && (age < 18))
            System.out.println("You are a teen");
        else
            System.out.println("You are an adult");
    }
}
