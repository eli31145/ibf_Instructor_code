package myapp6;

/*
public MyRunnable implements Runnable {
    public void run() {
        ...
    }
}

*/

public class Main2 
{
    public static void main(String[] args) {
        Interface1 if1 = (s) -> { return s; };
        System.out.println(if1.myMethod2("KABOOM!"));

        Interface1 if2 = (s) -> { return s+s; };
        System.out.println(if2.myMethod2("KABOOM!"));

        //MyIf2 if = () -> { System.out.println(""); };
        
    }    
}
 