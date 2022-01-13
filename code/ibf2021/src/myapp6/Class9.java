package myapp6;

import java.util.LinkedList;
import java.util.List;

public class Class9 
{
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("One"); words.add("Two"); words.add("Three");
        words.forEach(w -> System.out.println(w));
        words.forEach(System.out::println);
    }
}
