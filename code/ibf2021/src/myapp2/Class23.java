package myapp2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Class23 
{
    public void printList(List<String> list) {
        for (String item: list)
            System.out.println(item);
    }

    public void printList(LinkedList<String> list) {
        for (String item: list)
            System.out.println(item);
    }

    public void printSet(Set<String> set) {
        for (String item: set)
            System.out.println(item);
    }

    public void printMap(Map<String, Integer> map) {
        for (String item: map.keySet()) {
            System.out.println(item + ": " + map.get(item));
        }
    }
    
    public static void main(String[] args) {
        List<String> todos = new LinkedList<>();
        Set<String> pokemon = new HashSet<>();
        Map<String, Integer> inventory = new TreeMap<>(); 
        Class23 class23 = new Class23();

        // Populate Collections
        todos = Arrays.asList(new String[]
                {"One", "Two", "Two", "Two", "Three", "Four", "Five"});
        pokemon = Set.copyOf(todos);
        inventory.put("HP laptop", 7);
        inventory.put("Dell laptop", 5);
        inventory.put("Mouse", 10);
        inventory.put("keyboard", 11);
        inventory.put("HP laptop", 8);

        class23.printList(todos);
        System.out.println("- - - - - - - ");
        class23.printSet(pokemon);
        System.out.println("- - - - - - - ");
        class23.printMap(inventory);
    }
}
