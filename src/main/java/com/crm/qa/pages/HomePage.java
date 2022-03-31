
//}
package com.crm.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

//    @FindBy(name = "username")
    //   WebElement username;

    @FindBy(xpath = "//input[@id='search_query_top']")
    @CacheLookup //instead of html page it will get data from cache memory.
    WebElement  searchTab;

    // @FindBy(name = "password")
    // WebElement password;

    @FindBy(xpath = "//button[contains(@name,'submit_search')]")
    WebElement  searchClick;

    @FindBy(xpath = "//a[@class='login']")
    WebElement loginBtn;

    @FindBy(xpath = "//img[contains(@class,'logo img-responsive')]")
    WebElement logo;

    //Initializing page objects
    public HomePage() {
        PageFactory.initElements(driver,this);
    }
    //Action
    public String validatePageTitle() {
        return driver.getTitle();
    }
    public boolean validatePageImage() {

        return logo.isDisplayed();
    }
    //public HomePage login(String un,String pwd)
    public LoginPage clickInToLoginBtn() {
        // username.sendKeys("un");
        // password.sendKeys("pwd");
        loginBtn.click();
        return new LoginPage();
    }
}
