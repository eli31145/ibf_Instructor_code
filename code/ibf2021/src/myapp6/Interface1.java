package myapp6;

public interface Interface1 
{
    public String myMethod2(String s);
    //public void another();

    default void someMethod() {
        System.out.println("");
    }

    default void someMethod2() {
        System.out.println("");
    }
}
