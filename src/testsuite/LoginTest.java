package testsuite;
/**
 * Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * Enter “Admin” username
 * Enter “admin123 password
 * Click on ‘LOGIN’ button
 * Verify the ‘Dashboard’ text is display
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        //Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        //Verify the ‘Dashboard’ text is display
        String expectedResult = "Dashboard";
        String actualResult = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']")).getText();
        Assert.assertEquals("Incorrect Text", expectedResult, actualResult);
    }
    @After
    public void tearDown() {

        //closeBrowser();
    }

}
