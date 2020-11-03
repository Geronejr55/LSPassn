package Assn5;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlTest {


		public Bowling correctFrame;
		public Bowling incorrectThrow;
		public Bowling perfectGame;
		public Bowling NonvalidFrame;

		@Before
		public void setUp() throws Exception {
			correctFrame = new Bowling();
			incorrectThrow = new Bowling();
			perfectGame = new Bowling();
			NonvalidFrame = new Bowling();
			
}
		@Test
		public void isCorrectFrameAndThrow(){
			String Frame1 = "45-54-36-27-09-63-81-18-90-72";
			assertEquals(correctFrame.score(Frame1), 90);
		}
			
		@Test
		public void isIncorrectThrow(){
			String Frame2 = "45-82-36-27-09-63-81-18-90-72";
			assertEquals(incorrectThrow.score(Frame2), 0);
		}

		public void isPerfectGame(){
			String Frame3 = "X-X-X-X-X-X-X-X-X-XXX";
			assertEquals(perfectGame.score(Frame3), 300);
		}

		@Test
		public void isNonvalidFrame(){
			String Frame = "45-54-21-36-27-09-63-81-18-90-72";
			assertEquals(NonvalidFrame.score(Frame), 0);
		}
}
