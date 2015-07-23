package selenium_training.applogic0;

import selenium_training.applogic.UserHelper;
import selenium_training.model.User;

public class UserHelper0 implements UserHelper {

  private User user;

  @Override
  public void loginAs(User user) {
    if (user.getPassword().equals("wrong")) {
      return;
    }
    this.user = user;
  }

  @Override
  public void logout() {
    this.user = null;
  }

  @Override
  public boolean isLoggedIn() {
    return user != null;
  }

  @Override
  public boolean isLoggedInAs(User user) {
    return isLoggedIn() && this.user.getLogin().equals(user.getLogin());
  }

  @Override
  public boolean isNotLoggedIn() {
    return user == null;
  }

}
