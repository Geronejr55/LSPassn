package Final;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.List;

import org.junit.Test;

public class Testing {
/**
 * 
 * @throws FileNotFoundException
 */
   @Test
   public void testerFindName() throws FileNotFoundException {
       List<Person> list = Person.readPerson("file.csv");
     
       assertTrue(list.size() > 0);
   }

   @Test
   public void testEqualityT() throws FileNotFoundException {
       Person name1 = new Person("Gerone", 20);
       Person name2 = new Person("Gerone", 20);
       boolean equalStatus = name1.equals(name2);
       assertTrue(equalStatus);
   }

   @Test
   public void testEqualityF() throws FileNotFoundException {
       Person name1 = new Person("Gerone", 20);
       Person name2 = new Person("Mike", 30);
       boolean equalResult = name1.equals(name2);
       assertFalse(equalResult);
   }

}