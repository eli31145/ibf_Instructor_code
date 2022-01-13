package myapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class33 
{
    public static void main(String[] args) {
        List<String> listFromArray = Arrays.asList(
                new String[] {"Dos","Tres","Cinco","Siete","Once"});
        ArrayList<String> myList = new ArrayList<String>(listFromArray);

        for (int i = 0; i < myList.size(); i++)
	        System.out.printf("%d: %s\n", i, myList.get(i));

        for (String item: myList)
            System.out.printf("%s\n", item); 
    }
}
