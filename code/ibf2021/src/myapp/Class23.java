package myapp;

import java.io.Console;

public class Class23 
{
    public static void main(String[] args) {
        Console cons = System.console();
        String[] todo = new String[5];

        for (int i = 0; i < todo.length; i++) {
            String task = cons.readLine("Enter task %d: ", (i + 1));
            todo[i] = task;
        } 

        for (int i = 0; i < todo.length; i++)
            System.out.println(todo[i]);
    }
}
