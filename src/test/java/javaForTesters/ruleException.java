package javaForTesters;

import domainEntities.User;
import domainObject.InvalidPasswordException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ruleException {

    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test
    public void invalidPasswordThrown() throws InvalidPasswordException {
        expected.expect(InvalidPasswordException.class);

        User user = new User("username", "<6");
        user.setPassword("Pa55");

        expected.expectMessage("6 characters");
    }
}
