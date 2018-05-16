package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingAutomation {

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
        driver.get("http://automationpractice.com/index.php");
        WebElement dressSearchField = driver.findElement(By.xpath("/html//input[@id='search_query_top']"));
        dressSearchField.sendKeys("Dress");
        Thread.sleep(2000);
        dressSearchField.submit();
        Thread.sleep(2000);
        WebElement dress = driver.findElement(By.xpath("//div[@id='center_column']//span[@class='lighter']"));
        Thread.sleep(15000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
