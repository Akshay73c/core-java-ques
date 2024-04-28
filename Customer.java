package JavaQue5;

public class Customer extends User{
    public Customer(String loginId, String password) {
        super(loginId, password);
    }

    @Override
    public boolean isAdmin() {
        return false;
    }
}
