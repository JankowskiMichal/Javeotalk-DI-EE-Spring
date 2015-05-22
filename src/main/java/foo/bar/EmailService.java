package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements IEmailService {
    private EmailTemplateGenerator _emailTemplateGenerator;

    public void RegistrationEmail(String email, String link){
        System.out.println(link);
    }

    public void set_emailTemplateGenerator(EmailTemplateGenerator _emailTemplateGenerator) {
        this._emailTemplateGenerator = _emailTemplateGenerator;
    }
}
