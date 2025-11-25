import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups ={"sanity"} )
    void TestOne(){
        System.out.println("This is test one");
    }

    @Test(groups ={"sanity"} )
    void TestTwo(){
        System.out.println("This is test two");
    }

    @Test(groups = {"regression"})
    void TestThree(){
        System.out.println("This is test three");
    }
    @Test(groups = {"regression"})
    void TestFour(){
        System.out.println("This is test four");
    }

    @Test(groups = {"sanity","regression"})
    void TestFive(){
        System.out.println("This is test five");
    }

}
