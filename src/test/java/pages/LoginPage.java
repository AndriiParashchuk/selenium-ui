package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "submit")
    WebElement submitBtn;

    @FindBy(xpath = "//a[@href='/bank/signup']")
    WebElement signUpHereLink;

    @FindBy(xpath = "//input[@id='remember-me']")
    WebElement rememberMeBtn;


    public void enterValidLoginInfo(){
        usernameInput.sendKeys("test1@gmail.com");
        passwordInput.sendKeys("TestPass1234");
    }
    public void enterValidLoginInfo(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigProperties(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperties(password));
    }

    public void clickSignInBtn(){
        submitBtn.click();

    }
    public void clickSignUpHereBtn(){
        signUpHereLink.click();

    }
    public void verifyLoginPage(){
        Assert.assertTrue("Login page not visible", signUpHereLink.isDisplayed());
    }
    public void enterInvalidLoginInfo(String username, String password){
        usernameInput.sendKeys(ConfigReader.getConfigProperties(username));
        passwordInput.sendKeys(ConfigReader.getConfigProperties(password));
    }
    public void clickRememberMeBtn(){
        rememberMeBtn.click();
    }
    public void goBack(){
        driver.navigate().back();
    }
    public void verifyUsername(){
        Assert.assertTrue("Username field is empty", usernameInput.isDisplayed());
    }



}
