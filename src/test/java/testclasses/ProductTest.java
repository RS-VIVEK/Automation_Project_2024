package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    ProductCategoryPage productCategoryPage;
    ProductPage productPage;
    CartPage cartPage;

    public ProductTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
        productCategoryPage = new ProductCategoryPage();
        productPage = new ProductPage();
        cartPage = new CartPage();
    }

    @Test(description = "Add product to cart")
    public void verifyAddProductToCart() {
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        loginPage.setLogin(prop.getProperty("username"), prop.getProperty("password"));
        String myAccountText = myAccountPage.getTextOfMyAccount();
        softAssert.assertEquals(myAccountText, "MY ACCOUNT", "MY ACCOUNT Text should be match");
        homePage.setShopOption();
        productCategoryPage.CloseFirstAd();
        productCategoryPage.camposSuperiorProduct();
        boolean superiorText = productPage.setCamposSuperiorText();
        softAssert.assertTrue(superiorText, "true");
        productPage.setBagSizeDropDown();
        productPage.setValueKg();
        productPage.setGrindOption();
        productPage.setEspressoHomeOption();
        productPage.setSubscriptionOption();
        productPage.setWeeklyOption();
        productPage.setAddToCartBtn();
        boolean successTxt = productPage.setSuccessText();
        softAssert.assertTrue(successTxt);
        productPage.setContinueBtnClick();
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}