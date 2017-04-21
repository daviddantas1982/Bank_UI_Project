package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.print.PageFormat;

/**
 * Created by ddantas on 4/21/2017.
 * LoginPage class to get all the elements on login page
 */
public class LoginPage {

    WebDriver driver;
    final String pageUrl = "http://demo.guru99.com/v4";


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements ( driver, this);
        driver.get ( pageUrl );
    }

    @FindBy(xpath = "html/body/form/table/tbody/tr[1]/td[2]/input")
    private WebElement clickUserID;

    public WebElement getClickUserID() {
        return clickUserID;
    }

    public void setClickUserID(WebElement clickUserID) {
        this.clickUserID = clickUserID;
    }

    @FindBy(xpath = "html/body/form/table/tbody/tr[2]/td[2]/input")
    private  WebElement clickPasswordInputBox;

    public WebElement getClickPasswordInputBox() {
        return clickPasswordInputBox;
    }

    public void setClickPasswordInputBox(WebElement clickPasswordInputBox) {
        this.clickPasswordInputBox = clickPasswordInputBox;
    }
    @FindBy(xpath = "html/body/form/table/tbody/tr[3]/td[2]/input[1]")
    private  WebElement clickLoginButton;

    public WebElement getClickLoginButton() {
        return clickLoginButton;
    }

    public void setClickLoginButton(WebElement clickLoginButton) {
        this.clickLoginButton = clickLoginButton;
    }
}
