package com.crm.qa.pages;

import com.qa.base.TestBase;
import org.apache.poi.hslf.record.CString;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends TestBase {

    //Or Object Repository
    @FindBy(xpath = "//a[@class='account']")
    WebElement myUserName;

    @FindBy(xpath = "//a[contains(@title,'My wishlists')]")
    WebElement wishListBtnLink;

     @FindBy(id = "search_query_top")
    WebElement productSearchInAccountsPage;
     @FindBy(xpath = "//button[@name='submit_search']")
    WebElement searchSubmitBtn;

     @FindBy(xpath = "//i[contains(@class,'icon-building')]")
    WebElement myAddressLink;

     public MyAccountPage() {
         PageFactory.initElements(driver,this);
     }
     public Boolean verifyMyUserNameIs() {
     return myUserName.isDisplayed();
     }

     public String compareUserName() {
      return myUserName.getAccessibleName();
     }

     public WishListPage clickOnWishList() {
           wishListBtnLink.click();
           return new WishListPage();
     }
     public MyAddressPage clickOnMyAddressList() {
         myAddressLink.click();
         return new MyAddressPage();
     }
      public void clickOnSearchButton() {
         productSearchInAccountsPage.sendKeys("Dress");
    }
      public void clickOnSubmitButton() {
         searchSubmitBtn.click();
      }
}

