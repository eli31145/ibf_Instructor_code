package myapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Class35 
{
    public static void main(String[] args) {
        Map<String, String> todos = new HashMap<>();
        String day = ""; 
        String todo = "";

        Scanner scan = new Scanner(System.in);

        while (!"stop".equals(day)) {
            day = scan.next().toLowerCase();
            todo = scan.nextLine().trim();

            if ("stop".equals(day))
                break;

            todos.put(day, todo);
        }

        scan.close();

        for (String d: todos.keySet()) 
	        System.out.printf("%s: %s\n", d, todos.get(d));
    }
}
