package myapp;

import java.io.Console;

public class Class14 
{
    public static void main(String[] args) {
		Console cons = System.console();
		String name = cons.readLine("What is your name? ");
		System.out.printf("Hello %s. Please to meet you.\n", name);
	}
}