package foo.bar;

import org.springframework.stereotype.Component;

@Component
public interface IEmailService {
    void RegistrationEmail(String email, String link);
}
