package Assn7;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public class TestFunction {
	/**
	 * records grades for computing
	 * @param args
	 * @throws EmptyListException
	 */
	 public static void main (String [] args) throws EmptyListException {
	List < Integer > set0 = new ArrayList<>();
	set0.add(20);
	set0.add(40);
	set0.add(60);
	set0.add(80);
	set0.add(100);
	Grade set= new Grade(set0);
	System.out.println(set.compute(set0));
	System.out.println(set.drop(set0));
	System.out.println(set.median(set0));
}
}
