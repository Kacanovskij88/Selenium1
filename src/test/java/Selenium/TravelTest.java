package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelTest {

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
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='body-section']/div[@class='herobg']//div[@class='col-md-5 col-xs-12 go-right']/div[@class='row']/ul/li[2]/a[@href='#TRAVELPAYOUTSHOTELS']/span[@class='hidden-xs']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='TRAVELPAYOUTSHOTELS']//section[@class='mewtwo-hotels mewtwo-tabs-container']/div[@role='hotels']/form[@role='hotels-form']//input[@role='place']")).sendKeys("hotel");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='modal']/div[@role='autocomplete']/ul/li[1]/span[@class='mewtwo-autocomplete-list-item_text']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='TRAVELPAYOUTSHOTELS']//div[@role='hotels']/form[@role='hotels-form']/div[@role='guests']/div[@class='mewtwo-hotels-guests__text mewtwo-like_input']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='modal']/div[@role='guests_modal']//div[@role='adults']/span[@role='increase']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='TRAVELPAYOUTSHOTELS']//section[@class='mewtwo-hotels mewtwo-tabs-container']/div[@role='hotels']/form[@role='hotels-form']//input[@role='hotels-dates-checkout']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[19]/div[@role='modal']//div[@role='datepicker-table-wrapper']/div/div[1]/table[@class='mewtwo-datepicker-table mewtwo-datepicker-table--normal-weekdays']/tr[5]/td[5]/div[.='25']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='TRAVELPAYOUTSHOTELS']//section[@class='mewtwo-hotels mewtwo-tabs-container']/div[@role='hotels']/form[@role='hotels-form']//button[@role='hotels_submit']")).click();
        Thread.sleep(2000);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}


