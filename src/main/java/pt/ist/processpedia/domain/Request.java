package pt.ist.processpedia.domain;

import org.joda.time.DateTime;

public class Request extends Request_Base {

    public Request(String subject) {
        setSubject(subject);
        setLastUpdate(new DateTime());
    }

}
