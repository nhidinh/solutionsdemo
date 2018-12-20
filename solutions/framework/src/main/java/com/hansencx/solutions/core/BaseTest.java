package com.hansencx.solutions.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * BaseTest class
 *
 * @author  Vi Nguyen
 * @version 1.0
 * @since   2018-12-03
 */
public class BaseTest {
    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    /**
     * Start driver before running a test suite
     * @author Vi Nguyen
     * @param
     * @return Nothing.
     * @since 2018-12-03
     * @see
     */
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("name" + System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\framework\\src\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Code\\solutions\\framework\\src\\drivers\\chromedriver.exe");



        String headless = null;

        ChromeDriverManager.chromedriver();
        if("true".equals(headless)) {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else {
            driver = new ChromeDriver();
        }
    }

    /**
     * Quit driver after running a test suite
     * @author Vi Nguyen
     * @param
     * @return Nothing.
     * @since 2018-12-03
     * @see
     */
    @AfterSuite
    public void afterSuite(){
        if(null != driver){
            driver.close();
            driver.quit();
        }
    }
}
