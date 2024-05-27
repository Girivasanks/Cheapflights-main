package Cheapflights.Cheapflights.User;

import java.util.ArrayList;

public class User {
    private String userName;
    private String Password;
    private String email;
    private boolean isAdmin;
    public static User currentUser;
    public static ArrayList<User> userList = new ArrayList<User>();

    public User(String userName, String email, String Password) {
        this.userName = userName;
        this.Password = Password;
        this.email = email;
        this.isAdmin = false;
    }
    public User(User user){
        this.userName = user.userName;
        this.Password = user.Password;
        this.email = user.email;
        this.isAdmin = false;
    }
    public static User searchForUser(User u) {
        for(User user : userList) {
            if(user.equals(u))
                return u;
        }
        return null;
    }

    public static boolean exists(String userName) {
        for(User user : userList)
            if(user.userName.equals(userName) || user.email.equals(userName))
                return true;
        return false;
    }
    public boolean equals(User u) {
        return (this.userName.equals(u.userName) || this.email.equals(u.userName)) && this.Password.equals(u.Password);
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsAdmin(boolean state)
    {
        this.isAdmin = state;
    }
    public boolean getIsAdmin()
    {
        return this.isAdmin;
    }
}
