package cherkasov_learning;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.*;
import org.testng.annotations.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateDescriptionInvalid extends cherkasov_learning.pages.TestBase {
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Test
  public void testUntitled() throws Exception {

    driver.get(baseUrl + "/php4dvd/");
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("admin");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.cssSelector("img[alt=\"Add movie\"]")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Simon Cat");
    driver.findElement(By.name("notes")).clear();
    driver.findElement(By.name("notes")).sendKeys("Personal notes 10");
    driver.findElement(By.name("taglines")).clear();
    driver.findElement(By.name("taglines")).sendKeys("Taglines 10");
    driver.findElement(By.name("plotoutline")).clear();
    driver.findElement(By.name("plotoutline")).sendKeys("Plot outline 10");
    driver.findElement(By.name("plots")).clear();
    driver.findElement(By.name("plots")).sendKeys("Plots 10");
    driver.findElement(By.id("submit")).click();
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
}