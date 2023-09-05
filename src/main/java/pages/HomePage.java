package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[contains(@class, 'search-input')]")
    private WebElement searchInput;

    @FindBy(xpath = "//input[contains(@class, 'multi-input')]")
    private WebElement multiInput;

    @FindBy(xpath = "//span[text()='Молоток рихтовочный']")
    private WebElement item;

    @FindBy(xpath = "//a[@href ='https://www.grandinstrument.ua/katalogi-produkczii-v-pdf/']")
    private WebElement catalogPdf;

    @FindBy(xpath = "//a[contains(@class , 'callback-link')]")
    private WebElement callBackButton;

    @FindBy(xpath = "//input[contains(@class, 'callback-form-input')]")
    private WebElement nameInput;

    @FindBy(xpath = "//input[contains(@class, 'callback-form-input phone-msk')]")
    private WebElement phoneInput;

    @FindBy(xpath = "//input[contains(@class, 'submit_button btn')]")
    private WebElement sendButton;

    @FindBy(xpath = "//div[contains(@id, 'modal-callback-win')]")
    private WebElement callBackForm;

    @FindBy(xpath = "//div[contains(@class, 'msg-error')]")
    private WebElement errorMessage;

    public void enterTextToMultiInput(final String searchText) {
        multiInput.click();
        multiInput.sendKeys(searchText);
    }

    public void enterPhoneNumber(final String phone){
        phoneInput.click();
        phoneInput.sendKeys(phone);
    }

    public boolean errorMessageIsDisplayed(){
        return  errorMessage.isDisplayed();
    }

    public void clickOnSendButton(){
        sendButton.click();
    }

    public WebElement getCallBackForm(){
        return callBackForm;
    }

    public boolean nameInputIsDisplayed(){
       return nameInput.isDisplayed();
    }

    public boolean phoneInputIsDisplaed(){
        return phoneInput.isDisplayed();
    }

    public boolean sendButtonIsDisplayed(){
        return sendButton.isDisplayed();
    }

    public void clickCallBackButton(){
        callBackButton.click();
    }

    public void clickCatalogPdf(){
        catalogPdf.click();
    }

    public void clickSearchInput(){
        searchInput.click();
    }

    public WebElement getItem(){
        return item;
    }

    public void clickItem(){
        item.click();
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
