package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Write down the following test into
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * click on the ‘Forgot your password’ link
 * Verify the text ‘Reset Password’
 */
public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void SetUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        //click on the ‘Forgot your password’ link
        Thread.sleep(2000);
        driver.findElement(By.className("orangehrm-login-forgot-header")).click();
        Thread.sleep(2000);
        //Verify the text ‘Reset Password’
        String expectedResult = "Reset Password";
        String actualResult = driver.findElement(By.xpath("//button[@type='submit']")).getText();
        Assert.assertEquals("Incorrect password", expectedResult, actualResult);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
