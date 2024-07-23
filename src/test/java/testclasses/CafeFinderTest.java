package testclasses;

import org.example.pages.*;
import org.example.testbase.WebTestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CafeFinderTest extends WebTestBase {

    HomePage homePage;
    CafeFinderPage cafeFinderPage;

    public CafeFinderTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        cafeFinderPage = new CafeFinderPage();

    }

    @Test(description = "Verify the Cafe Finder")
    public void verifyCafeFinder(){
        SoftAssert softAssert = new SoftAssert();
        homePage.CloseFirstAd();
        homePage.cafeFinderBtn();
        cafeFinderPage.setCamposCafeDropDown();
        cafeFinderPage.setPostcodeOption();
        cafeFinderPage.setPostcodeTextBox(prop.getProperty("postcode"));
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
