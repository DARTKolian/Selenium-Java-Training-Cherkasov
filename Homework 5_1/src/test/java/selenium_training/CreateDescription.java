package selenium_training;

import org.testng.annotations.Test;

import selenium_training.model.Film;
import selenium_training.model.User;

import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.*;


public class CreateDescription extends selenium_training.TestBase {

  @BeforeMethod
  public void mayBeLogout() {
    if (app.getUserHelper().isLoggedIn()) {
      app.getUserHelper().logout();
    }
  }
  
  @Test
  public void CreateOK() throws Exception {
    User user = new User().setLogin("admin").setPassword("admin");
    app.getUserHelper().loginAs(user);
    Film film = new Film().setTitle("Pokemon").setYear("2014");
	 app.getFilmHelper().create(film);
	 ///AssertJUnit.assertTrue(app.getFilmHelper().search(film));
	    }
  }


