package webdriver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class signinwebsitetesting {

    WebDriver driver = new ChromeDriver();


    @Test
    public void signinstesting1(){
        driver.navigate().to("https://sis.cuiatd.edu.pk/login.aspx");
        driver.manage().window().maximize();
        Select dropdown = new Select(driver.findElement(By.id("ddl_Session")));
        dropdown.selectByVisibleText("FA17");
        Select dropdown1 = new Select(driver.findElement(By.id("ddl_Program")));
        dropdown1.selectByVisibleText("BSE");


        WebElement myElement = driver.findElement(By.id("txt_RollNo"));
        String js = "arguments[0].setAttribute('value','"+"033"+"')";
        ((JavascriptExecutor) driver).executeScript(js, myElement);

        WebElement myElement1 = driver.findElement(By.id("txt_Password"));
        String js1 = "arguments[0].setAttribute('value','"+"1659"+"')";
        ((JavascriptExecutor) driver).executeScript(js1, myElement1);
//        driver.findElement(By.name("btn_StudentSignIn")).click();
        WebElement ele = driver.findElement(By.id("btn_StudentSignIn"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);





    }
}
