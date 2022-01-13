package myapp6;

import java.util.LinkedList;
import java.util.List;

public class Class10 
{
    public static void main(String[] args) {
        List<LineItem> lineItems = new LinkedList<>();
        lineItems.add(new LineItem("Apple"));
        lineItems.add(new LineItem("Orange"));
        lineItems.add(new LineItem("Pear") );
        lineItems.forEach(li -> li.print());
        lineItems.forEach(LineItem::print);
    }
}
