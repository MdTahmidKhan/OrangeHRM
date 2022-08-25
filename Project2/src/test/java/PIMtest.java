import org.testng.annotations.Test;

public class PIMtest extends TestBase{
    @Test
    public void test01() {
        startLoginPage()
                .loginPIM()
                .searchEmployeeId("0083")
                .validateFirstAndLastName("Joe", "Root");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test02 () {

    }
}
