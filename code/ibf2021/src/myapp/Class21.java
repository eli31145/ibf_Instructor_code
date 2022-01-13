package myapp;

import java.io.Console;

public class Class21 
{
    public static void main(String[] args) {
        Console cons = System.console();
        String input = cons.readLine("Type a phrase: ");
        for (int i = 0; i < input.length(); i++)
	        System.out.println(input.substring(0, i));
    }
}
