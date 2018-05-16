package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniutmTest {

    private static WebDriver driver;

   @Before
   public void setup () {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\QAC\\Desktop\\chromedriver.exe");
       driver = new ChromeDriver();

   }

   @Test
    public void exampleSelenium() throws InterruptedException {
       driver.manage().window().fullscreen();
       Thread.sleep(1000);
       driver.get("http://www.google.com");
       WebElement googleSearchField = driver.findElement(By.name("q"));
       googleSearchField.sendKeys("funny vines compilation");
       Thread.sleep(2000);
       googleSearchField.submit();
       Thread.sleep(2000);
       WebElement funnyVine = driver.findElement(By.partialLinkText("Best Vines of All Time Vine Compilation"));
       funnyVine.click();
       Thread.sleep(15000);
   }

   @After
    public void tearDown() {
       driver.quit();
   }

}
