package Assn2;
import java.util.*;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public class IntegerSet {
private List<Integer> set = new ArrayList<Integer>();
	/**
	 * 
	 * @param set
	 */
	public IntegerSet(List<Integer> set) {
	       this.set = set;
	}
	
	/**
	 * 
	 */
	public void clear() {
	set.clear();
	}

/**
 * 
 * @return
 */
	public int length() {
	
	return set.size();
	}
/**
 * 
 * @param b
 * @return
 */
public boolean equals(IntegerSet b) {
		
        ArrayList < Integer > temp0 = (ArrayList < Integer > ) set;
        ArrayList<Integer> temp1 = (ArrayList<Integer>) b.set;
	    if(temp0.size()!=temp1.size()) {
	    	return false;
	    }   
	       
	    Collections.sort(temp0);
	    Collections.sort(temp1);
	         
	    for(int i=0; i<temp0.size(); i++) {
	    	if(temp1.get(i)!=temp1.get(i)) {
	    		return false;
	    	}
	    }
	    return true;
	}; 
	
/**
 * 
 * @param value
 * @return
 */
	public boolean contains(int value) {
	
		for(int i = 0; i < set.size(); i++) {
	
			if(set.get(i) == value) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @return
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		if(set.size()==0) {
			throw new IntegerSetException("empty");
		}
		int Max = set.get(0);
		for(int i = 0; i<set.size(); i++) {
			if(set.get(i)  > Max) {
				Max = set.get(i);
			}
		}
		return Max;
	}
	/**
	 * 
	 * @return
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException {
		if(set.size()==0) {
			throw new IntegerSetException("empty");
		}
		int min = set.get(0);
		for(int i = 0; i<set.size(); i++) {
			if(set.get(i)  > min) {
				min = set.get(i);
			}
		}
		return min;
	}
	/**
	 * 
	 * @param item
	 */
	public void add(int item) {
		int present = 0;
		for(int i = 0;i < set.size();i++) {
            if(set.get(i)== item) 
            { present=1;}}
        if(present== 0) {
            set.add(item);}
        };
        
       /**
        *  
        * @param item
        */
        public void remove(int item) {
        	for(int i = 0;i < set.size();i++) {
            if(set.get(i) == item) {
                set.remove(item);
            	}
        	}
        	}
        /**
         * 
         * @param intSetb
         * @return
         */
    public IntegerSet union(IntegerSet intSetb) {
    	ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
    	Set<Integer> temp2 = new HashSet<>();
    	temp2.addAll(set);
    	temp2.addAll(temp);       
    	ArrayList<Integer> temp3= new ArrayList<>(temp2);
    	IntegerSet temp4= new IntegerSet(temp3);
    	return temp4;
  
        		}

/**
 * 
 * @param intSetb
 * @return
 */
    public IntegerSet intersect(IntegerSet intSetb) {
    	ArrayList<Integer> temp0 = (ArrayList<Integer>) intSetb.set;
    	set.retainAll(temp0);
    	IntegerSet temp2= new IntegerSet(set);		
    	return temp2;
        }; 
        /**
         * 
         * @param intSetb
         * @return
         */
	public IntegerSet diff(IntegerSet intSetb) {
		ArrayList<Integer> temp = (ArrayList<Integer>) intSetb.set;
		set.removeAll(temp);
		IntegerSet temp1= new IntegerSet(set); 
    	return temp1;
	}
/**
 * 
 * @return
 */
		boolean isEmpty(){ 
		if(set.size() == 0) {
		return true;
		}
		return false;
		}
		/**
		 * 
		 */
	public String toString() {
	String setRep = "[";
	for(int i=0;i<set.size();i++) {
		if(i==(set.size()-1)) {
			String temp1 = String.valueOf(i);
			setRep += temp1;
		}
		else {
			String temp1 = String.valueOf(i) +", ";
			setRep += temp1;
		}
	}
	setRep += "]";
	return setRep;
};
	}
	

