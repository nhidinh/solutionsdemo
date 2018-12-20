package com.hansencx.solutions.solutionsdemo.actions;

import com.hansencx.solutions.core.BaseAction;
import com.hansencx.solutions.pages.SolutionsDemoDashboardPage;
import com.hansencx.solutions.pages.SolutionsDemoLoginPage;
import com.hansencx.solutions.pages.SolutionsDemoPage;
import org.openqa.selenium.WebDriver;

/**
 * Actions class
 *
 * @author  Vi Nguyen
 * @version 1.0
 * @since   2018-12-20
 * @see BaseAction
 */
public class Actions extends BaseAction{

    private SolutionsDemoPage solutionsDemoPage = new SolutionsDemoPage(driver);

    private static SolutionsDemoLoginPage solutionsDemoLoginPage;
    private static SolutionsDemoDashboardPage solutionsDemoDashboardPage;

    public Actions(WebDriver driver){
        super(driver);
    }

    /**
     * Navigate to SolutionsDemo page
     * @author Vi Nguyen
     * @param
     * @return Nothing.
     * @since 2018-12-20
     * @see
     */
    public void navigateToSolutionsDemoPage(){
        solutionsDemoPage.navigateTo();
    }

    public void navigateToSolutionLoginPage(){this.solutionsDemoLoginPage = solutionsDemoPage.clickOnLoginLink();}

    public void loginToDashboard(String username, String password) throws InterruptedException {
        solutionsDemoDashboardPage = this.solutionsDemoLoginPage.login(username, password);
    }

}
