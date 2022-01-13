package myapp6;

public class Class5 
{
    public static void main(String[] args) {
        
        Runnable r1 = () -> { 
            for (int i = 0; i < 50; i++)
                System.out.println("First"); 
        };
        new Thread(r1).start();

        new Thread( () -> { 
            for (int i = 0; i < 50; i++)
                System.out.println("S e c o n d"); } ).start();

        /* new Thread(new Runnable() { public void run() { 
            for (int i = 0; i < 50; i++)
                System.out.println("S e c o n d");
        } }); */
    }
}
