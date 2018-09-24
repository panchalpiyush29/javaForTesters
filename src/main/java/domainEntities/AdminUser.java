package domainEntities;

public class AdminUser extends User {

    public AdminUser(String username, String password) {
        super(username, password);
    }

    public AdminUser() {
        this("adminUser", "password");
    }

    @Override
    public String getPermission() {
        return "Elevated";
    }
}
