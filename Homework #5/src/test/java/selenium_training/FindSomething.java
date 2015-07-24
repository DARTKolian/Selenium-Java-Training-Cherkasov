/**package selenium_training;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.*;
import org.testng.annotations.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@Test
public class FindSomething extends TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/php4dvd/");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
    List<WebElement> elementsBefore = driver.findElements(By.xpath(".//*[@id='results']/a")); 
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys("Star Wars" + Keys.RETURN);
    String  title = driver.findElement(By.xpath("//div[@id='content']")).getText();
	System.out.println(title);
	title = driver.findElement(By.xpath("//div[@id='content']")).getText();
	System.out.println(title);
    List<WebElement> elementsAfter = driver.findElements(By.xpath(".//*[@id='results']/a"));
    Assert.assertNotEquals(elementsAfter.size(), elementsBefore.size());
   
    driver.findElement(By.linkText("Log out")).click();
    assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to log out[\\s\\S]$"));
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}**/