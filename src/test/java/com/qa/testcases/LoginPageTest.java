package com.qa.testcases;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAccountPage;
import com.qa.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
        HomePage  homePage;
        LoginPage loginpage;
        MyAccountPage myAccountPage;

    public LoginPageTest() {
        super();
    }
    @BeforeMethod
    public void setup() {
        initialisation();
        homePage = new HomePage();
        loginpage = homePage.clickInToLoginBtn();
    }
    @Test(priority = 4)
     public void verifyLoginPageTitleTest() {
        String  loginPageTitle1 = loginpage.validateLoginPageTitle();
        Assert.assertEquals(loginPageTitle1,"Login - My Store","login page title not matched");
    }
    @Test(priority = 5)
    public void loginLoginPageTest() {
       myAccountPage = loginpage.clickOnSignIn(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();

    }
}
