package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//div[contains(@class,'search_input_submit')]")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='header_catalog_btn_text']")
    private WebElement catalogButton;

    @FindBy(xpath = "//li/a[@href='/telecommunication/']")
    private WebElement subMenuTelecommunication;

    @FindBy(xpath = "//a[@href='/telecommunication/smart/']")
    private WebElement subMenuSmart;

    @FindBy(xpath = "//div[@class='list-item_link']/a[@href='/telecommunication/smart/samsung/']")
    private WebElement samsungButton;

    @FindBy(xpath = "//span[@data-class='cities']")
    private WebElement citiesButton;

    @FindBy(xpath = "//div[@class='select-city_item ']")
    private List<WebElement> listCities;

    public HomePage(WebDriver driver) { super(driver);}

    public void searchProduct(final String searchWord){
        searchField.sendKeys(searchWord);
        searchButton.click();
    }

    public void clickCatalogButton(){
        catalogButton.click();
    }
    public void selectPhoneByMenu(){
        new Actions(driver).moveToElement(subMenuTelecommunication).perform();
    }

    public void selectSmartBySubmenu(){
        new Actions(driver).moveToElement(subMenuSmart).perform();
    }

    public WebElement getSubMenuSmart(){
        return subMenuSmart;
    }

    public void clickSamsungHref(){
        samsungButton.click();
    }

    public WebElement getSamsungHref(){
        return samsungButton;
    }

    public void clickCitiesButton(){
        citiesButton.click();
    }

    public String getTextCityButton(){
        return citiesButton.getText();
    }

    public String getTextFirstCity(){
        return listCities.get(0).getText();
    }

    public void clickFirstCity(){
        listCities.get(0).click();
    }

}
