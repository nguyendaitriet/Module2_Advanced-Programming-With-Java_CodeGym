import java.util.regex.Pattern;

public class UserName {
    private static final String USERNAME_REGEX = "^[_a-z0-9]{6,}$";

    public boolean validate(String regex) {
        return Pattern.matches(USERNAME_REGEX, regex);
    }

}
