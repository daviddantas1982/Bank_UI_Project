import common.Common;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

/**
 * Created by ddantas on 4/21/2017.
 */
public class TestLogin {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception {

        Common cm = new Common();
        driver = cm.getDriver ();



    }

    @Test
    public void verifyLoginPage() throws Exception {
        final String userID = "mngr75409";
        final String password = "mngr75409";

        LoginPage login = new LoginPage ( driver );

        login.getClickUserID ().click ();
        login.getClickUserID ().sendKeys ( "mngr75409" );
        login.getClickPasswordInputBox ().click ();
        login.getClickPasswordInputBox ().sendKeys (  "mngr75409"  );
        login.getClickLoginButton ().click ();




    }

    @After
    public void tearDown() throws Exception {
driver.quit ();
    }

}
