package selenium_training;

import org.testng.annotations.*;
import static org.junit.Assert.*;

import selenium_training.model.User;

public class LoginTest extends selenium_training.TestBase {

  @BeforeMethod
  public void mayBeLogout() {
    if (app.getUserHelper().isLoggedIn()) {
      app.getUserHelper().logout();
    }
  }
  
  @Test
  public void testLoginOK() throws Exception {
    User user = new User().setLogin("admin").setPassword("admin");
    app.getUserHelper().loginAs(user);
    assertTrue(app.getUserHelper().isLoggedInAs(user));
  }

  @Test
  public void testLoginFailed() throws Exception {
    User user = new User().setLogin("admin").setPassword("wrong");
    app.getUserHelper().loginAs(user);
    // assertFalse(app.getUserHelper().isLoggedIn());
    assertTrue(app.getUserHelper().isNotLoggedIn());
  }

}
