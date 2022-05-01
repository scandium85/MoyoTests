package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class SamsungPage extends BasePage{

    @FindBy(xpath = "//button[contains(@class,'buy-btn')]")
    private List<WebElement> buyButtons;

    @FindBy(xpath = "//*[@class='modal__close sc-bdVaJa Dsuco']")
    private WebElement closePopupButton;

    @FindBy(xpath = "//div[@class='header_actions_item_count']/span")
    private WebElement countProductsCart;

    public SamsungPage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyFirstProduct(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", buyButtons.get(0));
    }

    public WebElement getClosePopupButton(){
        return closePopupButton;
    }

    public void closePopupCart(){
        closePopupButton.click();
    }

    public String getCountProductsCart(){
        return countProductsCart.getText();
    }
}
