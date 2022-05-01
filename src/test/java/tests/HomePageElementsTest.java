package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageElementsTest extends BaseTest{
    private static final String SEARCH_WORD = "Samsung";

    @Test(priority = 2)
    public void checkSearchByWord(){
        getHomePage().searchProduct(SEARCH_WORD);
        getSamsungPage().waitVisibilityOfElement(30, getSearchResultPage().getSearchResult());
        assertEquals(getSearchResultPage().getTextSearchResult(), SEARCH_WORD);
    }

    @Test(priority = 2)
    public void checkChangeCityButton(){
        getHomePage().clickCitiesButton();
        String city = getHomePage().getTextFirstCity();
        getHomePage().clickFirstCity();
        assertEquals(getHomePage().getTextCityButton(), city);
    }
}
