package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest {

    private static String SENDKEY = "Молоток рихтовочный JFAA0233";
    private static String SENDPHONENUMBER = "0501234567";

    private static final long DEFAULT_WAITING_TIME = 500;

    @Test
    public void checkSearchItem(){
    getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
    getHomePage().waitForAjaxToComplete(DEFAULT_WAITING_TIME);
    getHomePage().clickSearchInput();
    getHomePage().enterTextToMultiInput("TOPTUL JFAA0233");
    getHomePage().waitVisibilityOfElement(500, getHomePage().getItem());
    getHomePage().clickItem();
    getSearchResultPage().waitVisibilityOfElement(100, getSearchResultPage().getResultItemPage());
    assertTrue(getSearchResultPage().getTextItem().contains(SENDKEY));
    }

    @Test
    public void checkCatalogsPdf(){
        getHomePage().clickCatalogPdf();
        Assert.assertTrue(getCatalogPage().firstCatalogeIsDisplaed());
        Assert.assertTrue(getCatalogPage().secondCatalogeIsDisplaed());
        Assert.assertTrue(getCatalogPage().thirdCatalogeIsDisplaed());
        Assert.assertTrue(getCatalogPage().fourthCatalogeIsDisplaed());
        Assert.assertTrue(getCatalogPage().fifthCatalogeIsDisplaed());
        Assert.assertTrue(getCatalogPage().sixthCatalogeIsDisplaed());
        Assert.assertTrue(getCatalogPage().seventhCatalogeIsDisplaed());
        Assert.assertTrue(getCatalogPage().eighthCatalogeIsDisplaed());
    }

    @Test
    public void checkCallBackForm(){
        getHomePage().clickCallBackButton();
        getHomePage().waitVisibilityOfElement(100, getHomePage().getCallBackForm());
        Assert.assertTrue(getHomePage().nameInputIsDisplayed());
        Assert.assertTrue(getHomePage().phoneInputIsDisplaed());
        Assert.assertTrue(getHomePage().sendButtonIsDisplayed());
    }

    @Test
    public void checkErrorMessageCallBackForm(){
        getHomePage().clickCallBackButton();
        getHomePage().waitVisibilityOfElement(100, getHomePage().getCallBackForm());
        getHomePage().enterPhoneNumber(SENDPHONENUMBER);
        getHomePage().clickOnSendButton();
        Assert.assertTrue(getHomePage().errorMessageIsDisplayed());
    }
}
