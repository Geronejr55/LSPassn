package Assn7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public class Grade implements GradeStrategy{ 
	private List<Integer> grades = new ArrayList<Integer>();

	public Grade(List<Integer> grades) {
	       this.grades = grades;
	}

	@Override
	
	public int compute(List<Integer> grades) throws EmptyListException {
	
		if(grades.isEmpty()) {
			throw new EmptyListException("List is empty"); 
	    }
		
		int GradeTotal=0;
		for (int i=0; i<grades.size(); i++) {
			GradeTotal+=grades.get(i);
		}
		int GradeAvg=GradeTotal/grades.size();
	
		return GradeAvg;
		
		
	}

	@Override
	public int drop(List<Integer> grades) throws EmptyListException {
		
		
		if(grades.isEmpty()) {
			throw new EmptyListException("List is empty"); 
	    }
	
		Collections.sort(grades);
		
		grades.remove(grades.get(0));
	
		grades.remove(grades.get(0));
		
		int GradeTotal=0;
		for (int i=0; i<grades.size(); i++) {
			GradeTotal+=grades.get(i);
		}
		int GradeAvg=GradeTotal/grades.size();
	
		return GradeAvg;
	
	}
	@Override

		
	public int median(List<Integer> grades) throws EmptyListException {
			
		if(grades.isEmpty()) {
			throw new EmptyListException("List is empty"); 
	    }
		Collections.sort(grades);
		int GradeMedian=0;
			if (grades.size()%2==1){
				
		int median=(grades.size()/2);
		
		
		GradeMedian=grades.get(median);
			}
			else {
				double half=grades.size()/2;
				
			int Grade1=(int) (half+0.5);
			int Grade2=(int) (half-0.5);

			GradeMedian=(grades.get (Grade1)+grades.get (Grade2));
			GradeMedian=GradeMedian/2;
			}
			return GradeMedian;
	}
}
