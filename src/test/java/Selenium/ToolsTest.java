package Selenium;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Point;
import javax.swing.*;

public class ToolsTest {


    private static WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\QAC\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void exampleSelenium() throws InterruptedException {
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu-item-141\"]")).click();
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        driver.findElement(By.id("draggableview")).click();
        Thread.sleep(2000);
        WebElement dragme = driver.findElement(By.id("draggableview"));
        WebElement dropme = driver.findElement(By.id("droppableview"));
        act.dragAndDrop(dragme, dropme).perform();
        Thread.sleep(3000);
    }

    @Test
    public void exampleSelenium2() throws InterruptedException {
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu-item-142\"]/a")).click();
        Thread.sleep(2000);
        Actions act = new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).click();
        Thread.sleep(2000);
        Actions act2 = new Actions(driver);
        //driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).click();
        Thread.sleep(2000);
        WebElement item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        WebElement item7 = driver.findElement(By.xpath("//ol[@id='selectable']/li[.='Item 7']"));
        act2.moveToElement(item1).clickAndHold().moveToElement(item7).release().perform();
//        WebElement item1 = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
//        WebElement item7 = driver.findElement(By.id("//ol[@id='selectable']/li[.='Item 7']"));
//        act2.clickAndHold().dragAndDrop(item1,item7).perform();
        Thread.sleep(3000);
    }

    @Test
    public void exampleSelenium3() throws InterruptedException {
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"menu-item-144\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='accordion']/h3[2]")).click();
        Thread.sleep(2000);
        Actions act3 = new Actions(driver);
        driver.findElement(By.id("accordion")).click();
        Thread.sleep(2000);
        WebElement accordion = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
        Point point = accordion.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();
        System.out.println(xcord+ ", " + ycord);


        //act3.moveByOffset(1045,470).clickAndHold().moveByOffset(1045, 500).release().perform();
        Thread.sleep(2000);
    }

        @After
        public void tearDown () {
            driver.quit();
        }
    }




