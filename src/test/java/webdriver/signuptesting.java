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
    public void signinstesting1()
    {
        driver.navigate().to("https://www.bonanzasatrangi.com/pk/customer/account/create/");
        driver.manage().window().maximize();



        WebElement myElement = driver.findElement(By.id("firstname"));
        String js = "arguments[0].setAttribute('value','"+"khurram"+"')";
        ((JavascriptExecutor) driver).executeScript(js, myElement);

        WebElement myElement2 = driver.findElement(By.id("lastname"));
        String js2 = "arguments[0].setAttribute('value','"+"ali"+"')";
        ((JavascriptExecutor) driver).executeScript(js2, myElement2);

        WebElement myElement3 = driver.findElement(By.id("email_address"));
        String js3 = "arguments[0].setAttribute('value','"+"khurramali852@gmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(js3, myElement3);

        WebElement myElement4 = driver.findElement(By.id("password"));
        String js4 = "arguments[0].setAttribute('value','"+"hcbADW_a4my.kHx"+"')";
        ((JavascriptExecutor) driver).executeScript(js4, myElement4);

        WebElement myElement5 = driver.findElement(By.id("password-confirmation"));
        String js5 = "arguments[0].setAttribute('value','"+"hcbADW_a4my.kHx"+"')";
        ((JavascriptExecutor) driver).executeScript(js5, myElement5);
        WebElement ele = driver.findElement(By.xpath("//button[contains(.,'Sign up')]"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);


//        WebElement myElement1 = driver.findElement(By.id("txt_Password"));
//        String js1 = "arguments[0].setAttribute('value','"+"1659"+"')";
//        ((JavascriptExecutor) driver).executeScript(js1, myElement1);
////        driver.findElement(By.name("btn_StudentSignIn")).click();
//        WebElement ele = driver.findElement(By.id("btn_StudentSignIn"));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", ele);





    }
}
