package testclasses;

import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeTest extends WebTestBase {

    HomePage homePage;
    LoginPage loginPage;

    public HomeTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(description = "Verify first order discount")
    public void verifyFirstOrderDiscount(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        homePage.setFirstOrderEmailTextBox(prop.getProperty("email"));
        homePage.setConfirmBtn();
        softAssert.assertAll();
    }

    @Test(description = "Verify the search option")
    public void verifySearchOption(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        homePage.setSearchOption(prop.getProperty("searchText"));
        boolean resultMsg = homePage.setResultText();
        softAssert.assertTrue(resultMsg, "true");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
