package pt.ist.processpedia.domain;

import java.util.Set;
import pt.ist.fenixframework.FenixFramework;

public class Processpedia extends Processpedia_Base {

    public Processpedia() {
        addUser(new User("davidmartinho@gmail.com", "pass"));
        addUser(new User("john@doe.com", "123"));
        addRequest(new Request());
        addRequest(new Request());
        addRequest(new Request());
        addRequest(new Request());
    }

    public User login(String email, String password) {
        for(User user : getUserSet()) {
            if(user.getEmail().equals(email)) {
                if(user.getPassword().equals(password)) {
                    return user;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public static Processpedia getInstance() {
        return FenixFramework.getRoot();
    }

}
