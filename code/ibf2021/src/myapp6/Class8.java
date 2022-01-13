package myapp6;

import java.util.ArrayList;
import java.util.List;

public class Class8 
{
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John", "j123@45.com"));
        customers.add(new Customer("Peter", "pp12@89.com"));

        for (Customer c: customers)
            System.out.printf("Id: %s, Name: %s, Email: %s\n",
                    c.getCustomerId(), c.getName(), c.getEmail());
        
        customers.forEach((c) -> {
                System.out.printf("Id: %s, Name: %s, Email: %s\n",
                c.getCustomerId(), c.getName(), c.getEmail());
            }
        );
    }    
}
