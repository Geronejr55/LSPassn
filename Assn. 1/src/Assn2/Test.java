package Assn2;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public class Test {
	
/**
 * 
 * @param args
 * @throws IntegerSetException
 */
	 public static void main (String [] args) throws IntegerSetException {
	List < Integer > set0 = new ArrayList<>();
	set0.add(0);
	set0.add(1);
	set0.add(2);
	set0.add(3);
	set0.add(4);
	List < Integer > set1 = new ArrayList<>();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	set1.add(5);

	List < Integer > set2 = new ArrayList<>();
	set2.add(2);
	set2.add(3);
	set2.add(4);
	set2.add(5);
	set2.add(6);
	System.out.println("Set 0: "+set0.toString());
	System.out.println("Set 1: "+set1.toString());
	System.out.println("Set 2: "+set2.toString());

	IntegerSet intSet1= new IntegerSet(set1);
	IntegerSet intSet2= new IntegerSet(set2);

	// Set union
	IntegerSet setUnion= intSet1.union(intSet2);
	System.out.print("Union: " + setUnion.toString());
	// Set intersection
	IntegerSet setInter= intSet1.intersect(intSet2);
	System.out.print("Intersection: "+setInter.toString());
	// Set difference, i.e., s1 –s2
	IntegerSet setDifference= intSet1.diff(intSet2);
	System.out.print("Difference: "+setDifference.toString());
}
}
