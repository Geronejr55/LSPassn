package Assn7;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public class GradeTest {
	public Grade median;
	public Grade EmptySet;
	public Grade drop;
	public Grade compute;
	
	

	@Before
	/**
	 * creates list 
	 * @throws Exception
	 */
	public void setUp() throws Exception {
		List < Integer > set0 = new ArrayList<>();
		set0.add(20);
		set0.add(40);
		set0.add(60);
		set0.add(80);
		set0.add(100);
		
		List < Integer > set1 = new ArrayList<>();
		
		median = new Grade(set0);
		EmptySet = new Grade(set1);
		drop = new Grade(set0);
		compute = new Grade(set0);
		
}
	@Test
	/**
	 * finds the median of the grades
	 * @throws EmptyListException
	 */
	public void isMedian() throws EmptyListException{
		
		List < Integer > set0 = new ArrayList<>();
		set0.add(20);
		set0.add(40);
		set0.add(60);
		set0.add(80);
		set0.add(100);
		
		assertEquals(median.median(set0), 60);
	}
		
	@Test
	/**
	 * Looks for empty sets
	 * @throws EmptyListException
	 */
	public void isEmptySet() throws EmptyListException{
		
		List < Integer > set1 = new ArrayList<>();
	
		try {
			EmptySet.compute(set1);
		}catch(Exception s) {System.out.println(s);}
	
		
		assertEquals(EmptySet.compute(set1), 0);
	}

	public void isDrop() throws EmptyListException{
		
		List < Integer > set0 = new ArrayList<>();
		set0.add(20);
		set0.add(40);
		set0.add(60);
		set0.add(80);
		set0.add(100);
		
		assertEquals(drop.drop(set0), 80);
	}

	@Test
	/**
	 * Computes the avg
	 * @throws EmptyListException
	 */
	public void isCompute() throws EmptyListException{
		
		
		List < Integer > set0 = new ArrayList<>();
		set0.add(20);
		set0.add(40);
		set0.add(60);
		set0.add(80);
		set0.add(100);
		
		assertEquals(compute.compute(set0), 60);
	}
}