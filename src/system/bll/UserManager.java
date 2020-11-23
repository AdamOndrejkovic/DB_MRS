package system.bll;

import system.dal.UserDB;

public class UserManager {
    public UserDB userDB = new UserDB();
    public boolean checkUser(String userName, String userPass) {
        if(userDB.checkUser(userName,userPass)){
            return true;
        }else{
            return false;
        }
    }

    public void addUser(String user, String password) {
        userDB.addUser(user,password);
    }
}
