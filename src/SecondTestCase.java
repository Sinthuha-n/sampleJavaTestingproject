import org.testng.annotations.Test;

public class SecondTestCase {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("opening browser.");
    }
    @Test(priority = 3)
    void searchCustomer()
    {
        System.out.println("This is a searchCustomer test.");
    }
    @Test(priority = 2)
    void addCustomer()
    {
        System.out.println("This is a addCustomer test.");
    }
    @Test(priority = 4)
    void teardown()
    {
        System.out.println("closing browser.");
    }
}
