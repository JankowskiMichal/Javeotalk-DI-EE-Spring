package foo.bar;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

public class Main {

    public static void main(String[] args) {
/*

        EmailValidator emailValidator = new EmailValidator();
        ActivatonLinkGenerator activatonLinkGenerator = new ActivatonLinkGenerator();
        EmailService emailService = new EmailService();
        EmailTemplateGenerator emailTemplateGenerator = new EmailTemplateGenerator();
        emailService.set_emailTemplateGenerator(emailTemplateGenerator);
        UsersController usersController = new UsersController(emailValidator, activatonLinkGenerator, emailService);
        usersController.RegisterUser("michal@wp.pl");
*/

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

       UsersController usersController = context.getBean("UsersController", UsersController.class);
        usersController.RegisterUser("michal@wp.pl");


    }
}
