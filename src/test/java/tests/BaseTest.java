package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import pages.CatalogsPage;
import pages.HomePage;
import pages.SearchResultPage;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    private CapabilityFactory capabilityFactory = new CapabilityFactory();
    private static final String CANADIAN_TIRE_URL = "https://www.grandinstrument.ua";

    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {
        driver.set(new RemoteWebDriver(new URL("http://192.168.0.2:5555/wd/hub"), capabilityFactory
                .getCapabilities(browser)));
        getDriver().manage().window().maximize();
        getDriver().get(CANADIAN_TIRE_URL);
    }

    @AfterMethod
    public void tearDown() {
        getDriver().close();
    }

    @AfterClass
    void terminate() {
        driver.remove();
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public CatalogsPage getCatalogPage(){
        return new CatalogsPage(getDriver());
    }

    public SearchResultPage getSearchResultPage(){
        return new SearchResultPage(getDriver());
    }
}
