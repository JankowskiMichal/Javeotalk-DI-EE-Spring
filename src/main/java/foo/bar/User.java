package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class User {
    public int Id;
    public String Email;
    public String RegistrationToken;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRegistrationToken() {
        return RegistrationToken;
    }

    public void setRegistrationToken(String registrationToken) {
        RegistrationToken = registrationToken;
    }
}
