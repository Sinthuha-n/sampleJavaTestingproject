import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 {
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }
    @Test
    void test5(){
        System.out.println("This is test 5");
    }
    @Test
    void test6() {
        System.out.println("This is test 6");
    }
}
