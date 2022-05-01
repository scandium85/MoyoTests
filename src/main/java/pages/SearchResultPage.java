package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage{

    @FindBy(xpath = "//h1[@class='search_title']/span")
    private WebElement searchResult;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getTextSearchResult(){
        return searchResult.getText();
    }

    public WebElement getSearchResult(){
        return searchResult;
    }
}
