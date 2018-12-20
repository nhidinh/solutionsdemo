package com.hansencx.solutions.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.not;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

/**
 * BasePage class
 * All Page objects created should inherit this class
 *
 * @author  Vi Nguyen
 * @version 1.0
 * @since   2018-12-03
 */
public class BasePage {
    private static final int TIMEOUT = 5; //seconds
    private static final int POLLING = 100; //milliseconds

    protected WebDriver driver;
    private WebDriverWait wait;

    /**
     * CONSTRUCTORS
    */

    public BasePage(){}

    public BasePage(WebDriver driver) {
        this.driver = driver;
        System.out.println("From Base Page : Start driver successfully ");
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    }

    /********************************************************************************************************************/
    /**
     * This is the method which waits for the element to exist.
     * @param locator the locator.
     * @return Nothing.
     */
    protected void waitForElementToAppear(By locator) {
        wait.until(visibilityOfElementLocated(locator));
    }

    /**
     * This is the method which waits for the given element to appear.
     * @param element the Webelement.
     * @return Nothing.
     */
    public void waitForElementToAppear(WebElement element){
        wait.until(visibilityOf(element));
}

    /**
     * Waits for the given element to disappear.
     * @param element the Webelement.
     * @return Nothing.
     * @since 2018-12-03
     * @see
     */
    public void waitForElementToDisappear(WebElement element){
        wait.until(invisibilityOf(element));
    }

    /**
     * Wait for element is clickable
     * @author Vi Nguyen
     * @param element the given web element
     * @return Nothing
     * @since 2018-12-03
     * @see
     */
    public void waitForTextToDisappearInElement(WebElement element, String text){
        wait.until(not(textToBePresentInElement(element, text)));
    }

    /**
     * Wait for element is clickable
     * @author Vi Nguyen
     * @param element the given web element
     * @return Nothing
     * @since 2018-12-03
     * @see
     */
    public void waitForElementToBeClickable(WebElement element){
        wait.until(visibilityOf(element));
    }

    /**
     * Click on given element
     * @author Vi Nguyen
     * @param element the given web element
     * @return Nothing
     * @since 2018-12-03
     * @see
     */
    public void click(WebElement element){
        element.click();
    }

}
