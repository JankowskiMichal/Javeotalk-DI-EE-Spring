package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class EmailTemplateGenerator implements  IEmailTemplateGenerator {

    @Override
    public String ActivationTemplate(String link) {
        return link;
    }
}
