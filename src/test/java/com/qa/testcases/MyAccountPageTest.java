package com.qa.testcases;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAccountPage;
import com.qa.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage accountPage;

    public MyAccountPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialisation();
       homePage = new HomePage();
       loginPage = new LoginPage();
       accountPage = new MyAccountPage();
       loginPage  = homePage.clickInToLoginBtn();
       accountPage = loginPage.clickOnSignIn(prop.getProperty("username"), prop.getProperty("password"));
    }
    @Test(priority = 6)
    public void verifyUsernameDisplayedTest() {
        Assert.assertTrue(accountPage.verifyMyUserNameIs());
    }

    @Test (priority = 7)
    public void  compareUsernameWithActual() {
       String myUserNameIs = accountPage.compareUserName();
        Assert.assertEquals(myUserNameIs,"Ashish Kumar","name is not matching");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}