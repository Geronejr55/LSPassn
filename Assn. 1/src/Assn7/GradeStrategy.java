package Assn7;

import java.util.List;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public interface GradeStrategy {
	/**
	 * 
	 * @param grades
	 * @return returns average
	 * @throws EmptyListException
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
/**
 * 
 * @param grades
 * @return computes avg after lowest 2 are dropped
 * @throws EmptyListException
 */
	public int drop(List<Integer> grades) throws EmptyListException;
	/**
	 * 
	 * @param grades
	 * @return computes the median
	 * @throws EmptyListException
	 */
	public int median(List<Integer> grades) throws EmptyListException;
	
}

