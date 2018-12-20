package com.hansencx.solutions.pages;

import com.hansencx.solutions.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * SolutionsDemoLoginPage class
 *
 * @author  Vi Nguyen
 * @version 1.0
 * @since   2018-12-20
 * @see BasePage
 */
public class SolutionsDemoLoginPage extends BasePage{

    /***********************************************LOCATORs************************************************************/
    @FindBy(xpath = "//*[@id=\"user_login\"]")
    private static WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"user_pass\"]")
    private static WebElement passwordField;

    @FindBy(id="wp-submit")
    private static WebElement loginButton;

    /***********************************************GETTERs************************************************************/
    public WebElement getusernameField() {
        return usernameField;
    }
    public WebElement getpasswordField() {
        return passwordField;
    }
    public WebElement getloginButton() {
        return loginButton;
    }

    /********************************************CONSTRUCTORs********************************************************/
    public SolutionsDemoLoginPage(){
    }
    public SolutionsDemoLoginPage(WebDriver driver){
        super(driver);
    }

    /**
     * Login.
     * @author Vi Nguyen
     * @param username,password
     * @return SolutionsDemoDashboardPage
     * @since   2018-12-20
     * @see
     */
    public SolutionsDemoDashboardPage login(String username, String password) throws InterruptedException {
        getusernameField().sendKeys(username);
        getpasswordField().sendKeys(password);
        Thread.sleep(2000);

        waitForElementToBeClickable(getloginButton());
        getloginButton().click();

        //getloginButton().submit();
        return new SolutionsDemoDashboardPage(driver);
    }

}
