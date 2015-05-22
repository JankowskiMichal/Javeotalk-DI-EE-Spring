package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class EmailValidator implements IEmailValidator {
    static String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
public boolean Validate(String email) {
    return email.matches(EMAIL_REGEX);
}
}
