package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTest extends BaseTest{
    private static final String BRAND = "Samsung";

    @Test(priority = 1)
    public void checkAddProdToCartByMenu(){
        getHomePage().clickCatalogButton();
        getHomePage().selectPhoneByMenu();
        getHomePage().waitVisibilityOfElement(30, getHomePage().getSubMenuSmart());
        getHomePage().selectSmartBySubmenu();
        getHomePage().waitVisibilityOfElement(30, getHomePage().getSamsungHref());
        getHomePage().clickSamsungHref();
        getSamsungPage().clickBuyFirstProduct();
        getSamsungPage().waitVisibilityOfElement(30, getSamsungPage().getClosePopupButton());
        getSamsungPage().closePopupCart();
        assertEquals(getSamsungPage().getCountProductsCart(),"1");
    }
}
