package myapp.ch05;

public class LoginManager {
    public boolean authenticate(UserBean user) {
        if (user.getUserid().equals("amosi") && user.getPassword().equals("0923")) {
            user.setEmail("amosi@gmail.com");
            return true;
        } else {
            user.setError("Invalid id/password");
            return false;
        }
    }
}
