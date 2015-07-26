package selenium_training;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.*;


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
    AssertJUnit.assertTrue(app.getUserHelper().isLoggedInAs(user));
  }

  @Test
  public void testLoginFailed() throws Exception {
    User user = new User().setLogin("admin").setPassword("wrong");
    app.getUserHelper().loginAs(user);
    // assertFalse(app.getUserHelper().isLoggedIn());
    AssertJUnit.assertTrue(app.getUserHelper().isNotLoggedIn());
  }

}
