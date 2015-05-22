package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class ActivatonLinkGenerator implements IActivatorLinkGenerator {
    @Override
    public String generateLink(String token, String email) {
        return String.format("http://myap.com/confirm?email=%s&token=%s", email, token);

    }
}
