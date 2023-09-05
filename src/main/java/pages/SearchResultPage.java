package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//h1[text() = 'Молоток рихтовочный JFAA0233 TOPTUL']")
    private WebElement resultItemPage;

    public String getTextItem(){
        return resultItemPage.getText();
    }

    public WebElement getResultItemPage(){
        return resultItemPage;
    }

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }
}
