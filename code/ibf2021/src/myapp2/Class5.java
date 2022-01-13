package myapp2;

public class Class5 
{
    public static void main(String[] args) {
        Car fredCar = new Car();
		Car barneyCar = new Car();

		fredCar.setColor("red");
		barneyCar.setColor("blue");
		barneyCar.start();

		/* System.out.printf("Has Fred started his car? %b\n", 
                fredCar.started); */
		System.out.printf("Has Barney started his car? %b\n", 
                barneyCar.isStarted());

    }
}
