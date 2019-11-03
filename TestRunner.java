import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
import org.junit.runner.Result;

public class TestRunner{
	
	public static void main(String[] args){
    	Result resultado = JUnitCore.runClasses(Teste.class);
    	
    	for (Failure failure : resultado.getFailures()){
    		System.out.println(failure.toString());
     	}
      	
      	System.out.println(resultado.wasSuccessful());
   
   }

}