package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpFirstPage extends BasePage{
    @FindBy(xpath = "//strong[contains(text(),'Title')]")
    WebElement title;

    @FindBy(xpath = "//select[@id ='title']")
    WebElement titleDropDown;

    @FindBy(xpath = "//input[@id ='firstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id ='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@value ='M']")
    WebElement gender;
    @FindBy(xpath = "//input[@id ='dob']")
    WebElement dob;
    @FindBy(xpath = "//input[@id ='ssn']")
    WebElement ssn;
    @FindBy(xpath = "//input[@id ='emailAddress']")
    WebElement eMail;
    @FindBy(xpath = "//input[@id ='password']")
    WebElement password;
    @FindBy(xpath = "//input[@id ='confirmPassword']")
    WebElement confirmPassword;
    @FindBy(xpath = "//button[@type ='submit']")
    WebElement nextBtn;


    public void verifySignUp1(){
        Assert.assertTrue("Sign up first page not displayed", title.isDisplayed());

    }
    public void enterData1(){
        Select options = new Select(titleDropDown);
        options.selectByVisibleText("Mr.");
        firstName.sendKeys("SuperMan");
        lastName.sendKeys("SuperManych");
        gender.click();
        dob.sendKeys("01/01/2000");
        ssn.sendKeys("911223434");
        eMail.sendKeys("superman1@gmail.com");
        password.sendKeys("Testerok101");
        confirmPassword.sendKeys("Testerok101");

    }


    public void clickNextBtn(){
        nextBtn.click();
    }
}
