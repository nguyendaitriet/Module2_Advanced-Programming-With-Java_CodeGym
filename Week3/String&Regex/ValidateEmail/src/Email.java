
import java.util.regex.Pattern;

public class Email {

    private static final String EMAIL_REGEX = "^[A-z0-9]+@+[A-z0-9]+.+com$";

    public boolean validate(String regex) {
        return Pattern.matches(EMAIL_REGEX, regex);
    }
}
