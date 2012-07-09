package pt.ist.processpedia.domain;

public class User extends User_Base {

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

}
