

public class Main {
    public static void main(String[] args) {
        LoginTest login = new LoginTest();
        login.loginWithValidCredentials();
        WishListTest wishList = new WishListTest();
        wishList.addToWishList();
        RegisterTest register = new RegisterTest();
        register.newUserRegister();
    }
}
