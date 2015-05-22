package foo.bar;

import org.springframework.stereotype.Component;

@Component
public interface IActivatorLinkGenerator {
    String generateLink(String token, String email);
}
