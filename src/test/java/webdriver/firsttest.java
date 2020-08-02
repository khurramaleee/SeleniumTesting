package webdriver;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttest {

    @Test
    public  void  startwebdrver(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://seleniumsimplified.com");
        Assertions.assertTrue(driver.getTitle().startsWith("Selenium Simplified"),
                "title should start differntly");
        driver.close();
    }
}
