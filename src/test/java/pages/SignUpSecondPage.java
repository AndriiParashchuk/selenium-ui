package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpSecondPage extends BasePage {

    @FindBy(xpath = "//strong[contains(text(),'Address')]")
    WebElement addressTitle;
    @FindBy(xpath = "//input[@id ='address']")
    WebElement address;
    @FindBy(xpath = "//input[@id ='locality']")
    WebElement locality;
    @FindBy(xpath = "//input[@id ='region']")
    WebElement region;
    @FindBy(xpath = "//input[@id ='postalCode']")
    WebElement postalCode;
    @FindBy(xpath = "//input[@id ='country']")
    WebElement country;
    @FindBy(xpath = "//input[@id ='homePhone']")
    WebElement homePhone;
    @FindBy(xpath = "//input[@id ='mobilePhone']")
    WebElement mobilePhone;
    @FindBy(xpath = "//input[@id ='workPhone']")
    WebElement workPhone;
    @FindBy(xpath = "//input[@id ='agree-terms']")
    WebElement agreeBtn;
    @FindBy(xpath = "//button[@class ='btn btn-primary btn-flat m-b-30 m-t-30']")
    WebElement registerBtn;


    public void verifySignUp2() {
        Assert.assertTrue("Sign up second page not visible", addressTitle.isDisplayed());


    }

    public void enterData2() {
        address.sendKeys("101 Super Ct");
        locality.sendKeys("Super City");
        region.sendKeys("SuperLand");
        postalCode.sendKeys("60645");
        country.sendKeys("USA");
        homePhone.sendKeys("5473334444");
        mobilePhone.sendKeys("5473334443");
        workPhone.sendKeys("5473334442");
        agreeBtn.click();

    }

    public void clickRegisterBtn() {
        registerBtn.click();

    }

}
