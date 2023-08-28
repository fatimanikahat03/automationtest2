package testrunner;

import org.junit.Before;
import re.browser;

import java.io.IOException;

public class hook extends browser{


    @Before()
    public void bb() throws IOException {

        browser.bowserInvocation();
    }

}



