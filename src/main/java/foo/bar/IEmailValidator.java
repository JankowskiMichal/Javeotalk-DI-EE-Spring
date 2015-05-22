package foo.bar;

import org.springframework.stereotype.Component;

@Component
public interface IEmailValidator {
    boolean Validate(String email);
}
