package Assn5;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public class Tester {
public static void main(String[] args) {
		
		String Frame1 = "X-X-X-X-X-X-X-X-X-XXX"; 
		Bowling Fr1 = new Bowling();
		
		String Frame2 = "45-54-36-27-09-63-81-18-90-72"; 
		Bowling Fr2 = new Bowling();
System.out.println("Final Score "+ Fr1.score(Frame1));
		
		
		String Frame3 = "5/-5/-5/-5/-5/-5/-5/-5/-5/-5/5";
		Bowling Fr3 = new Bowling();
		System.out.println("Final Score "+ Fr2.score(Frame2));
		System.out.println("Final Score "+ Fr3.score(Frame3));
	}
}
