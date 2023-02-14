package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "//span[@class ='badge badge-pill badge-success']")
    WebElement successMessage;
    @FindBy(xpath = "//input[@id='password']")
    WebElement validPassword;

    public void verifySuccessMessage(){
        Assert.assertTrue("Registration Successful. Please Login not displayed", successMessage.isDisplayed());

    }

    public void enterValidPassword(){
        validPassword.sendKeys("Testerok101");

    }
}
