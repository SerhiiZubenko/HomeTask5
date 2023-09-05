package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogsPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'content-main']")
    private WebElement contentMain;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/cover-catalog-2019-280.jpg']")
    private WebElement firstCatalog;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/cover-handtools-2019-280.jpg']")
    private WebElement secondCatalog;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/cover-standart-2019-280.jpg']")
    private WebElement thirdCatalog;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/cover-auarita-2017-280.jpg']")
    private WebElement fourthCatalog;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/cover-toptul-2017-280.jpg']")
    private WebElement fifthCatalog;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/bright-katalog-img.jpg']")
    private WebElement sixthCatalog;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/launch-katalog-img.jpg']")
    private WebElement seventhCatalog;

    @FindBy(xpath = "//img[@src ='/grand_assets/downloads/catalogs/covers/catalog2020cover(with contacts)_fix.jpg']")
    private WebElement eighthCatalog;

    public boolean firstCatalogeIsDisplaed(){
        return firstCatalog.isDisplayed();
    }

    public boolean secondCatalogeIsDisplaed(){
        return secondCatalog.isDisplayed();
    }

    public boolean thirdCatalogeIsDisplaed(){
        return thirdCatalog.isDisplayed();
    }

    public boolean fourthCatalogeIsDisplaed(){
        return fourthCatalog.isDisplayed();
    }

    public boolean fifthCatalogeIsDisplaed(){
        return fifthCatalog.isDisplayed();
    }

    public boolean sixthCatalogeIsDisplaed(){
        return sixthCatalog.isDisplayed();
    }

    public boolean seventhCatalogeIsDisplaed(){
        return seventhCatalog.isDisplayed();
    }

    public boolean eighthCatalogeIsDisplaed(){
        return eighthCatalog.isDisplayed();
    }

    public CatalogsPage(WebDriver driver) {
        super(driver);
    }
}
