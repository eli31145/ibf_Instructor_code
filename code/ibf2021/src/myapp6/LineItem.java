package myapp6;

public class LineItem 
{
    private String item;

    public LineItem(String item) {
        this.item = item;
    }
    
    public void print() {
        System.out.println("Line item: " + item);
    }
}
