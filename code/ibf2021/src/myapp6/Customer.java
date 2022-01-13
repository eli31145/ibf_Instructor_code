package myapp6;

public class Customer 
{
    private String customerId;
    private String name;
    private String email;

    public Customer() { }

    public Customer(String name, String email) {
        this.customerId = name + "123";
        this.name = name;
        this.email = email;
    }

    /**
     * @return String return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

}
