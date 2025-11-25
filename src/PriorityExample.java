import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 0)
    void TestOne(){
       System.out.println("This is test one");
    }

    @Test(priority = 1)
    void TestTwo(){
        System.out.println("This is test two");
    }

    @Test(priority = 2)
    void TestThree(){
        System.out.println("This is test three");
    }
    @Test(priority = 3,enabled = false)
    void TestFour(){
        System.out.println("This is test four");
    }
}
