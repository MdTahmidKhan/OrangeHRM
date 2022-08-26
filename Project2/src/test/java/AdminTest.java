import org.testng.annotations.Test;

public class AdminTest extends TestBase{
    @Test
    public void test002() {
        startLoginPage()
                .loginToPIMPage()
                .navigateToAdminPage()
                .serachUserName("Aaliyah.Haq")
                .validateUserName("Aaliyah.Haq");
    }
}
