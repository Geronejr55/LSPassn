package Final;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileNotFoundException;
/**
*
* Person class implements comparable
*
*/
public class Person implements Comparable<Person> {

   private String name;
   private int age;
/**
 * Has input for name and age
 * @param name
 * @param age
 */

   public Person(String name, int age) {
       super();
       this.name = name;
       this.age = age;
   }
  /**
   * gets the age
   * @return
   */
   public int getAge() {
       return age;
   }
  
   /**
   * The method returns a list
   * @param fileName
   * @return
   * @throws FileNotFoundException
   */
   public static List<Person> readPerson(String fileName) throws FileNotFoundException {
 
       Scanner scan = new Scanner(new File(fileName));
     
       List<Person> namesOnList = new ArrayList<>();
       while (scan.hasNext()) 
       {
           String line = scan.next();
           String[] Array = line.split(",");          
           Person x = new Person(Array[0], Integer.parseInt(Array[1]));
           namesOnList.add(x);
       }
       scan.close();
       Collections.sort(namesOnList);
       return namesOnList;
   }
   /**
    * Checks if equal
    */
   @Override
   public boolean equals(Object obj) {

	   Person nextName = (Person) obj; 
		if (name.equals(nextName.name) && age==nextName.age) {
	    	return true;
	    }
	    return false;
   }
   /**
    * compared the inputs
    */
   @Override
   public int compareTo(Person o) {
       return this.getAge() - o.getAge();
   }
  /**
   * returns string with name and age
   */
   @Override
   public String toString() {
       return " "+ name +  " " + age + "";
   }
  

}