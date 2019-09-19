package IExecutionListenerexmple;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

//@Listeners(iexelistner.class)

public class TestClass {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }
     
    @Test
    public void t() {
        System.out.println("test");
    }
     
    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }
}
