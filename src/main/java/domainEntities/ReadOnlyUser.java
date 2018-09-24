package domainEntities;

public class ReadOnlyUser extends User {

    public ReadOnlyUser() {
        this("readOnly", "Password$1");
    }

    public ReadOnlyUser(String username, String password) {
        super(username, password);
    }

    @Override
    public String getPermission() {
        return "Read Only";
    }
}
