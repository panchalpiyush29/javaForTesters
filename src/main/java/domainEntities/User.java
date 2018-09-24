package domainEntities;

import domainObject.InvalidPasswordException;
import org.apache.commons.lang.RandomStringUtils;

public class User {

    private String username;
    private String password;

    public User() {
        this("username", "password");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidPasswordException {

        String mustIncludeADigit = ".*[0123456789]+.*";
        String mustIncludeACapital = ".*[A-Z]+.*";

        if (password.length() < 7) {
            throw new InvalidPasswordException("Password should be greater then 6 characters");
        } else if (!password.matches(mustIncludeADigit)) {
            throw new InvalidPasswordException("Password should contain atleast 1 digit");
        } else if (!password.matches(mustIncludeACapital)) {
            throw new InvalidPasswordException("Password should contain atleast 1 capital");
        }
        this.password = password;
    }

    public String getPermission() {
        return "Normal";
    }


    public String getExistingUsername() {
        StringBuilder builder = new StringBuilder();

        return builder.append("automation_")
                .append(RandomStringUtils.randomAlphanumeric(15))
                .append("@gmail.com")
                .toString();

    }
}
