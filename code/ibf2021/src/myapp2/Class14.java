package myapp2;

import javax.swing.JFrame;

public class Class14 
{
    public static void whatIsMyType(Object obj) {

		if (obj instanceof Car) {
			System.out.println("This is a Car");

            if (obj instanceof FlyingCar)
                System.out.println("This is a FlyingCar");
        } 
        else {
			System.out.printf("This is a %s class\n", 
                    obj.getClass().getName());
        }
	}

    public static void main(String[] args) {
        whatIsMyType(new Car());
		whatIsMyType(new FlyingCar());
		whatIsMyType(new JFrame());
    }
}
