package foo.bar;

import org.springframework.stereotype.Component;

@Component
public interface IEmailTemplateGenerator {
    String ActivationTemplate(String link);
}
