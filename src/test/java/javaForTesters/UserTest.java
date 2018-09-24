package javaForTesters;

import domainEntities.AdminUser;
import domainEntities.ReadOnlyUser;
import domainEntities.User;
import domainObject.InvalidPasswordException;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void canConstructANewUser() {
        User user = new User();
    }

    @Test
    public void userHasDefaultUsernamePassword() {
        User user = new User("user", "Password$1");

        assertEquals("default username expected ", "user", user.getUsername());
        assertEquals("default password expected ", "Password$1", user.getPassword());
    }

    @Test
    public void canSetPasswordAfterConstructed() throws InvalidPasswordException {
        User user = new User();
        user.setPassword("Pa55word$1");

        assertEquals("setter password expected", "Pa55word$1", user.getPassword());
    }


    //We expect a IllegalArgumentException as the password is shorter then minimum length
    //hence we have added the expected as expected
    @Test(expected = InvalidPasswordException.class)
    public void checkPasswordLength() throws InvalidPasswordException {
        User user = new User();
        user.setPassword("Pass");

        assertEquals("setter password expected", "Pass", user.getPassword());
    }

    @Test
    public void aUserHAsNormalPermission() {
        User aUser = new User();

        assertEquals("Normal", aUser.getPermission());
    }

    @Test
    public void adminUserTest() {
        AdminUser adminUser = new AdminUser();

        assertEquals("adminUser", adminUser.getUsername());
        assertEquals("password", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void anAdminUserHasElevatedPermission() {
        AdminUser adminUser = new AdminUser("admin", "Passw0rd");

        assertEquals("admin", adminUser.getUsername());
        assertEquals("Passw0rd", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }

    @Test
    public void anReeadOnlyUser() {
        ReadOnlyUser readOnlyUser = new ReadOnlyUser();

        assertEquals("readOnly", readOnlyUser.getUsername());
        assertEquals("Password$1", readOnlyUser.getPassword());
        assertEquals("Read Only", readOnlyUser.getPermission());
    }

    @Test
    public void mustInclude() throws InvalidPasswordException {
        User user = new User();

        user.setPassword("Passw0rd");
        System.out.println(user.getExistingUsername());
        assertThat(user.getPassword(), is("Passw0rd"));
    }

}