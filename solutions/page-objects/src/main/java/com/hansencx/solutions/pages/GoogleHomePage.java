package com.hansencx.solutions.pages;

import com.hansencx.solutions.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * GoogleHomePage class
 *
 * @author  Vi Nguyen
 * @version 1.0
 * @since   2018-12-03
 * @see BasePage
 */
public class GoogleHomePage extends BasePage {

    @FindBy(name = "q")
    private static WebElement searchBox; //= driver.findElement(By.name("q"));

    /***********************************************GETTERs************************************************************/
    public WebElement getSearchBox() {
        return searchBox;
    }

    /**********************************************CONSTRUCTORs********************************************************/
    public GoogleHomePage(WebDriver driver){
        super(driver);
    }

    /**********************************************METHODs********************************************************/
    /**
     * Navigate to Google Home page.
     * @author Vi Nguyen
     * @param
     * @return Nothing.
     * @since   2018-12-03
     * @see
     */
    public void navigateTo(){
        driver.get("https://www.google.com/");
        searchBox.sendKeys("AAAAAAA");
    }


}
