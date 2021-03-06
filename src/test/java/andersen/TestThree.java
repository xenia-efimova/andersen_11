// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestThree {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Downloads\\tools\\chromedriver_win32\\chromedriver");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void TestTree() {
        driver.get("https://dikidi.net/ru/business/projects");
        driver.manage().window().setSize(new Dimension(1296, 696));
        driver.findElement(By.linkText("Добавить новый проект")).click();
        driver.findElement(By.cssSelector("form > .form-group > .btn-group .filter-option")).click();
        driver.findElement(By.cssSelector(".open .filter-option")).click();
        driver.findElement(By.name("name")).click();
        driver.findElement(By.name("name")).sendKeys("homework");
        driver.findElement(By.cssSelector(".btn-group:nth-child(1) > .filled")).click();
        driver.findElement(By.cssSelector(".input-search .close")).click();
        driver.findElement(By.cssSelector(".input-search .form-control")).click();
        driver.findElement(By.xpath("//div[2]/div/div/input")).sendKeys("Казань ");
        driver.findElement(By.linkText("Казань, Татарстан")).click();
        driver.findElement(By.cssSelector(".btns > .btn")).click();
        driver.findElement(By.cssSelector(".sw > .btn")).click();
        driver.findElement(By.cssSelector(".form-group:nth-child(4) > label")).click();
        driver.findElement(By.cssSelector(".btns > .btn")).click();
    }
}