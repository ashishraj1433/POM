package com.crm.qa.pages;

import com.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

        //OR- Object Repository

        @FindBy(id = "email")
        WebElement username;

        @FindBy(xpath = "//input[@id='passwd']")
        WebElement password;

        @FindBy(xpath = "//i[contains(@class,'icon-lock left')]")
        WebElement signInBtn;

        @FindBy(xpath = "/img[contains(@class,'logo img-responsive')]")
        WebElement logoLoginPage;

       //Initialization
        public LoginPage() {
                PageFactory.initElements(driver,this);
        }
        public String validateLoginPageTitle() {
         return driver.getTitle();
        }
        public boolean validateLoginPageLogo() {
                return logoLoginPage.isDisplayed();
        }
        public MyAccountPage clickOnSignIn( String un,String pwd) {
                    username.sendKeys(un);
                    password.sendKeys(pwd);
                    signInBtn.click();
                    return new MyAccountPage();
        }

}