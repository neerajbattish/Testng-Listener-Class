package suiteListenerExample;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

@Listeners(Suitelistn.class)

public class Testclass {
	@Parameters("ui")
    @BeforeSuite
    public void beforeSuite(String parm) {
        System.out.println("before suite, ui value: " + parm);
    }
     
    @Test
    public void t() {
        System.out.println("test method");
    }
     
    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }

}
