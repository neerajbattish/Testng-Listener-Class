package IExecutionListenerexmple;

import org.testng.IExecutionListener;

public class iexelistner implements IExecutionListener {

	@Override
    public void onExecutionStart() {
        System.out.println("Printed before any suite run");     
    }
 
    @Override
    public void onExecutionFinish() {
        System.out.println("Printed after all the suite run");
    }
}
