package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TravelTesting2 {

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
        driver.get("https://www.phptravels.net/");
        Thread.sleep(1000);
        driver.findElement(By.tagName("input")).sendKeys("hotel");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("adults")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='adults']//option[@value='3']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"dpd2\"]/input")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[15]/div/table/tbody/tr[3]/td[7]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"HOTELS\"]/form/div[3]/div[3]/button")).click();
        Thread.sleep(2500);
//        WebElement webElement = driver.findElement(By.tagName("button"));
//        webElement.click();

        List<WebElement> webElement = driver.findElements(By.tagName("button"));

        int i = 0;
        for(WebElement element : webElement) {
            i++;
            System.out.println(element.getLocation().x + " " + element.getLocation().y);
            System.out.println(i + " " + element.getText());
        }

        //webElement.get(15).click();

        webElement.get(8).click();
        //System.out.println(webElement.size());

        //Actions action = new Actions(driver);
        //action.moveByOffset(959,1488).click().perform();
        Thread.sleep(5000);




    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

