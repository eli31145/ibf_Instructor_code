package myapp3;

public class Class14b 
{
    public void divideByZero() throws Exception {
        int a = 3;  int b = 0;
        try {
            System.out.println("Three divided by zero is " + 3/0);
            System.out.println("Cannot divide by zero.");
        } catch (RuntimeException e) {
            System.out.println("Caught here");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        /* try {
            new Class14b().divideByZero();
        } catch (Exception npe) {
            System.out.println("Oh No!");
            npe.printStackTrace();
        } */
        new Class14b().divideByZero();
        System.out.println("#########");
    }
}
