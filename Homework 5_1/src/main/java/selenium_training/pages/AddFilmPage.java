package selenium_training.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFilmPage extends InternalPage {

public AddFilmPage(PageManager pages) {
		super(pages);
	}

@FindBy(name = "name")
private WebElement filmTitleField;

@FindBy(name = "year")
private WebElement filmYearField;

@FindBy(name = "submit")
private WebElement submitButton;

public AddFilmPage setFilmTitleField(String text) {
	filmTitleField.sendKeys(text);
    return this;
  }

  public AddFilmPage setFilmYearField(String text) {
	filmYearField.sendKeys(text);
    return this;
  }

  public void clickSubmitButton() {
    submitButton.click();
  }
  
  public AddFilmPage ensurePageLoaded() {
	    super.ensurePageLoaded();
	    wait.until(presenceOfElementLocated(By.xpath(".//*[@id='imdbsearchform']/h2")));
	    return this;
  }
}