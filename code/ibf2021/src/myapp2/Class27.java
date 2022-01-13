package myapp2;

public class Class27 
{
    public static void main(String[] args) {
        Box<String> boxOfStrings = new Box<String>();
        Box<Cookie> boxOfCookies = new Box<>();

        boxOfStrings.setItem("Hello Fred");
        boxOfCookies.setItem(new Cookie());

        System.out.println("Item of String: " + boxOfStrings.getItem());
    }
}
