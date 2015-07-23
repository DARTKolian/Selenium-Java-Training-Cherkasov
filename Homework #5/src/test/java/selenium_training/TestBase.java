package selenium_training;

import org.testng.annotations.BeforeClass;

import selenium_training.applogic.ApplicationManager;
import selenium_training.applogic0.ApplicationManager0;
import selenium_training.applogic1.ApplicationManager1;

public class TestBase {

  protected ApplicationManager app;

	@BeforeClass
	public void init() {
		app = new ApplicationManager1();
	}
	
}