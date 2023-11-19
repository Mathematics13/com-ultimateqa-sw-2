package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest
{
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement signInLink  =  driver.findElement(By.linkText("Sign In"));
        Thread.sleep(4000);
        signInLink.click();
        Thread.sleep(2000);

        String expectedResult = "Welcome Back!";
        WebElement actualText = driver.findElement(By.xpath("//h2[contains(text(),'Welcome Back')]"));
        String actualResult = actualText.getText();
        Assert.assertEquals( expectedResult , actualResult);
    }
    @Test
    public void verifyTheErrorMessage() throws InterruptedException
    {
        WebElement signInLink  =  driver.findElement(By.partialLinkText("Sign"));
        Thread.sleep(2000);
        signInLink.click();
        Thread.sleep(2000);

        WebElement email  =  driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("Prime123@gmail.com");
        Thread.sleep(2000);

        WebElement password  =  driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Prime123");
        Thread.sleep(2000);

        WebElement signInButton  =  driver.findElement(By.xpath("//button[contains(text(), 'Sign in')]"));
        signInButton.click();
        Thread.sleep(2000);

        String expectedText = "Invalid email or password";
        WebElement actualText = driver.findElement(By.className("form-error__list-item"));
        String actualResult = actualText.getText();

        Assert.assertEquals(expectedText , actualResult );
    }
}
