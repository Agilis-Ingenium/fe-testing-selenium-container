package tests;// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
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
import org.openqa.selenium.firefox.FirefoxOptions;

public class AddFoodItemTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {

    WebDriverManager.firefoxdriver().setup();
    FirefoxOptions options=new FirefoxOptions();
    options.addArguments("--headless");
    driver = new FirefoxDriver(options);

    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void addFoodItem() {
    driver.get("http://172.17.0.1:3000");
    driver.findElement(By.cssSelector("a:nth-child(4) .ml-3")).click();
    driver.findElement(By.cssSelector(".bg-green-600")).click();
    driver.findElement(By.id("name")).click();
    driver.findElement(By.id("name")).sendKeys("TestFoodItem");
    driver.findElement(By.id("calories")).click();
    driver.findElement(By.id("calories")).sendKeys("12");
    driver.findElement(By.id("carbohydrates")).click();
    driver.findElement(By.id("carbohydrates")).sendKeys("12");
    driver.findElement(By.id("proteinsd")).click();
    driver.findElement(By.id("proteinsd")).sendKeys("12");
    driver.findElement(By.id("fats")).click();
    driver.findElement(By.id("fats")).sendKeys("12");
    driver.findElement(By.id("vitamins")).click();
    driver.findElement(By.id("vitamins")).sendKeys("Vit C");
    driver.findElement(By.id("minerals")).click();
    driver.findElement(By.id("minerals")).sendKeys("NaCl");
    driver.findElement(By.cssSelector(".hover\\3A bg-green-500")).click();
    driver.findElement(By.cssSelector(".text-blue-800")).click();
  }
}
