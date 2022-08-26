import org.testng.annotations.Test;

public class FirstTest extends TestBase{
    //WebDriver driver;

    @Test
    public void test1(){
        startLoginPage().loginToPIMPage();
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
