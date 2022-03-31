package com.qa.testcases;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.qa.base.TestBase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    //test cases shoould be separated -- independent with other
    //before each test case launch the browser and login
    //@Test execute test cases
    //after each test case quit the browser

    public HomePageTest() {
            super();
    }
        @BeforeMethod
            public void setUp() {
            initialisation();
            homePage = new HomePage();
    }
    @Test(priority = 1)
    public void loginPageTitleTest() {
    String title = homePage.validatePageTitle();
    Assert.assertEquals(title,"My Store");
    }
    @Test(priority = 2)
    public void myStoreLogoImageTest() {
       boolean flag = homePage.validatePageImage();
        Assert.assertTrue(flag);
    }
    @Test(priority = 3)
    public void clickTest() {
       loginPage = homePage.clickInToLoginBtn();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
