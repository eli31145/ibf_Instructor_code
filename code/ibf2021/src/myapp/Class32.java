package myapp;

import java.io.Console;
import java.util.List;
import java.util.LinkedList;

public class Class32
{
    public static void main(String[] args) {
        Console cons = System.console();

        List<String> myTodo = new LinkedList<>();
        String input = "";

        while (!"stop".equals(input)) {
            input = cons.readLine("? ");

            if (!"stop".equals(input))
                myTodo.add(input);
        }
        
        System.out.println(myTodo.toString());
    }
}
