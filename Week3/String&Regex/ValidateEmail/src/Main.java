import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String args[]) {
        System.out.println("__________VALIDATE EMAIL__________");
        Email emailExample = new Email();
        final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
        final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        System.out.println();
        System.out.println("__________VALIDATE USERNAME__________");
        UserName userNameExample = new UserName();
        final String[] validUserName = new String[]{"123abc_", "_abc123", "______", "123456","abcdefgh" };
        final String[] invalidUserName = new String[]{".@", "12345", "1234_", "abcde" };
        for (String userName : validUserName) {
            boolean isValid = userNameExample.validate(userName);
            System.out.println("Username is " + userName + " is valid: " + isValid);
        }
        for (String userName : invalidEmail) {
            boolean isValid = emailExample.validate(userName);
            System.out.println("Username is " + userName + " is valid: " + isValid);
        }
    }
}
