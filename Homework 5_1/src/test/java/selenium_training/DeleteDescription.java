import org.testng.annotations.Test;

import org.testng.annotations.Test;

import selenium_training.model.Film;
import selenium_training.model.User;

import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.*;


public class DeleteDescription extends selenium_training.TestBase {

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
  public void CreatenotOK() throws Exception {
	  Film film = new Film().setTitle("Starwars").setYear("2015");
	  app.getFilmHelper().create(film);
	  AssertJUnit.assertNotTrue(app.getFilmHelper().List<Film> search(String title));
  }
  
  @Test
  public void Delete() throws Exception {
	  Film film = new Film().setTitle("Starwars").setYear("2015");
	  app.getFilmHelper().delete(film);
	  AssertJUnit.assertNotTrue(app.getFilmHelper().List<Film> search(String title));
    }
}

