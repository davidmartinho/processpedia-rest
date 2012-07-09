package pt.ist.processpedia.util;

import pt.ist.processpedia.domain.Processpedia;
import pt.ist.fenixframework.Config;
import pt.ist.fenixframework.FenixFramework;

public class Bootstrap {

    public static void run() {
        try {
            FenixFramework.initialize(new Config() {{
                domainModelPaths = new String[] { "/cenas.dml" };
                dbAlias = "//localhost:3306/cenas";
                dbUsername = "root";
                dbPassword = "";
                rootClass = Processpedia.class;
            }});
            } catch(Error e) {
                System.err.println("SOMETHING WRONG: "+e.getMessage());
            }
    }

}
