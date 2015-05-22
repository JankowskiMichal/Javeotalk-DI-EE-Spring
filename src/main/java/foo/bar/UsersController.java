package foo.bar;


import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController {
    private IEmailValidator _emailValidator;
    private IActivatorLinkGenerator _activationLinkGenerator;
    private IEmailService _emailService;

    public void set_activationLinkGenerator(IActivatorLinkGenerator _activationLinkGenerator) {
        this._activationLinkGenerator = _activationLinkGenerator;
    }

    public void set_emailService(IEmailService _emailService) {
        this._emailService = _emailService;
    }

    public void set_emailValidator(IEmailValidator _emailValidator) {
        this._emailValidator = _emailValidator;
    }

 /*   public UsersController(ApplicationContext context){
        _emailService=context.getBean(EmailService);
        _emailValidator=context.getBean(EmailValidator);
        _activationLinkGenerator=context.getBean(ActivatonLinkGenerator);
    }*/

    public UsersController(){

}
    // DI
    public UsersController(IEmailValidator emailValidator, IActivatorLinkGenerator activationLinkGenerator, IEmailService emailService){
        _emailValidator = emailValidator;
        _activationLinkGenerator = activationLinkGenerator;
        _emailService = emailService;
    }

    public void RegisterUser(String email){

        if(_emailValidator.Validate(email) == false){
            throw new IllegalArgumentException("Invalid email address");
        }
        User user = new User();
        user.setEmail(email);
        user.setRegistrationToken("token");
        UsersDataBase.insertUser(user);
        String registrationLink = _activationLinkGenerator.generateLink("token", "email");
        _emailService.RegistrationEmail("email", registrationLink);

    }

}
