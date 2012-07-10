package pt.ist.processpedia.domain;

import java.util.Set;
import pt.ist.fenixframework.FenixFramework;

public class Processpedia extends Processpedia_Base {

    public Processpedia() {
        User u1 = new User("davidmartinho@gmail.com", "pass");
        addUser(u1);
        Request r1 = new Request("Req 1");
        r1.setInitiator(u1);

        addRequest(r1);

        addQueue(new Queue("Queue 1"));
        addQueue(new Queue("Queue 2"));
        addQueue(new Queue("Queue 3"));
        addQueue(new Queue("Queue 4"));
        addTag(new Tag("Tag A"));
        addTag(new Tag("Tag B"));
        addTag(new Tag("Tag C"));
        addTag(new Tag("Tag D"));
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
