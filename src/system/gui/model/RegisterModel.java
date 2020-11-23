package system.gui.model;

import system.bll.UserManager;

public class RegisterModel {
    public UserManager userManager = new UserManager();
    public void addUser(String user, String password) {
        userManager.addUser(user,password);
    }
}
