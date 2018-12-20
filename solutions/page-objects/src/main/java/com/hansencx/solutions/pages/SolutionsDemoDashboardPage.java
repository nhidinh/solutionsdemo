package com.hansencx.solutions.pages;

import com.hansencx.solutions.core.BasePage;
import com.hansencx.solutions.core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * SolutionsDemoDashboardPage class
 *
 * @author  Vi Nguyen
 * @version 1.0
 * @since   2018-12-20
 * @see BasePage
 */
public class SolutionsDemoDashboardPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"wpbody-content\"]/div[3]/h1 ")
    private static WebElement title;

    /***********************************************GETTERs************************************************************/
    public WebElement gettitle() {
        return title;
    }

    /********************************************CONSTRUCTORs********************************************************/
    public SolutionsDemoDashboardPage(){}

    public SolutionsDemoDashboardPage(WebDriver driver){
        super(driver);
    }

}
