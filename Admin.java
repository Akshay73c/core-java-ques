package JavaQue5;

public class Admin extends User{


    public Admin(String loginId, String password) {
        super(loginId, password);
    }

    @Override
    public boolean isAdmin() {
        return true;
    }
}
