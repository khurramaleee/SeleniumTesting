package webdriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signuptesting {

    WebDriver driver = new ChromeDriver();
    @Test
    public void signinstestingpasscase()
    {
        driver.navigate().to("https://www.bonanzasatrangi.com/pk/customer/account/create/");
        driver.manage().window().maximize();
        //setting value in first name field
        WebElement myElement = driver.findElement(By.id("firstname"));
        String js = "arguments[0].setAttribute('value','"+"khurram"+"')";
        ((JavascriptExecutor) driver).executeScript(js, myElement);
        //setting value in last name field
        WebElement myElement2 = driver.findElement(By.id("lastname"));
        String js2 = "arguments[0].setAttribute('value','"+"ali"+"')";
        ((JavascriptExecutor) driver).executeScript(js2, myElement2);
        //setting value in email field
        WebElement myElement3 = driver.findElement(By.id("email_address"));
        String js3 = "arguments[0].setAttribute('value','"+"khurramali852@gmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(js3, myElement3);
        //setting value in password field
        WebElement myElement4 = driver.findElement(By.id("password"));
        String js4 = "arguments[0].setAttribute('value','"+"hcbADW_a4my.kHx"+"')";
        ((JavascriptExecutor) driver).executeScript(js4, myElement4);
        //setting value in password confirm  field
        WebElement myElement5 = driver.findElement(By.id("password-confirmation"));
        String js5 = "arguments[0].setAttribute('value','"+"hcbADW_a4my.kHx"+"')";
        ((JavascriptExecutor) driver).executeScript(js5, myElement5);
        //clicking on the signup button
        WebElement ele = driver.findElement(By.xpath("//button[contains(.,'Sign up')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

    }
    @Test
    public void signinstestingfailcase()
    {
        driver.navigate().to("https://www.bonanzasatrangi.com/pk/customer/account/create/");
        driver.manage().window().maximize();
        //setting value in first name field
        WebElement myElement = driver.findElement(By.id("firstname"));
        String js = "arguments[0].setAttribute('value','"+"khurram"+"')";
        ((JavascriptExecutor) driver).executeScript(js, myElement);
        //setting value in last name field
        WebElement myElement2 = driver.findElement(By.id("lastname"));
        String js2 = "arguments[0].setAttribute('value','"+"ali"+"')";
        ((JavascriptExecutor) driver).executeScript(js2, myElement2);
        //setting value in email field
        WebElement myElement3 = driver.findElement(By.id("email_address"));
        String js3 = "arguments[0].setAttribute('value','"+"khurramali852@abc.com"+"')";
        ((JavascriptExecutor) driver).executeScript(js3, myElement3);
        //setting value in password field
        WebElement myElement4 = driver.findElement(By.id("password"));
        String js4 = "arguments[0].setAttribute('value','"+"hcbADW_a4my.kHx"+"')";
        ((JavascriptExecutor) driver).executeScript(js4, myElement4);
        //setting value in password confirm  field
        WebElement myElement5 = driver.findElement(By.id("password-confirmation"));
        String js5 = "arguments[0].setAttribute('value','"+"hcbADW_a4my.kHx"+"')";
        ((JavascriptExecutor) driver).executeScript(js5, myElement5);
        //clicking on the signup button
        WebElement ele = driver.findElement(By.xpath("//button[contains(.,'Sign up')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);
        ////this test will be failed because not valid email has provided. they should verify email first.

    }
}
