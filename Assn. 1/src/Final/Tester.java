package Final;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Tester {
/**
 * 
 * @param args
 */
   public static void main(String[] args) {
       Result end = JUnitCore.runClasses(Testing.class);
       for (Failure failure : end.getFailures()) {
           System.out.println(failure.toString());
       }
       System.out.println(end.wasSuccessful());
   }

}