package system.gui.model;

import system.bll.UserManager;

public class LogInModel {
    public UserManager userManager = new UserManager();
    public boolean checkLog(String userName, String userPass) {
        if(userManager.checkUser(userName,userPass)){
            return true;
        }else{
            return false;
        }
    }
}
