import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASSNAME_REGEX = "^[ACP]\\d{4}[GHIKLM]$";

    public boolean validate(String regex) {
        return Pattern.matches(CLASSNAME_REGEX, regex);
    }
}
