package Assn5;
/**
 * 
 * @author geronehamiltonjr.
 *
 */
public class Bowling {
	/**
	 * 
	 * @param FrameScore
	 * @return score
	 */
int score(String FrameScore) {
	int count=0;
	int score=0;
	for (int i=0;i<FrameScore.length();i++) {
		if (FrameScore.charAt(i) == '-'){
			count += 1;
		}
	
	if(count > 9) {
		System.out.println("invalid number of frames");
		score = 0;
		return score;
	}
	}
	int FrameCount=0;
	for(int i=0;i<FrameScore.length();i++)
		
		if (FrameCount >=9) {
			if (FrameScore.charAt(i)=='X')
				{score+=10;}
			else if (FrameScore.charAt(i) == '/')
			{	int next=Character.getNumericValue(FrameScore.charAt(i+1));

			int total = next;
				score+=total;
			System.out.println(score);	
			}
	
			else score+=Character.getNumericValue (FrameScore.charAt(i));
		}
		
		
		else if (FrameScore.charAt(i) == 'X')
			{score+=30;}
		else if (FrameScore.charAt(i) == '-'){
		FrameCount += 1;}
	
		else if (FrameScore.charAt(i+1) == '/')
			
		{	int next=Character.getNumericValue(FrameScore.charAt(i+3));

		int total = next+10;
			score+=total;
			
				}
	
		else if (Character.getNumericValue(FrameScore.charAt(i)) + Character.getNumericValue(FrameScore.charAt(i+1)) <= 9) {
			System.out.println(score);
			
			char strRoll1 = FrameScore.charAt(i);
			char strRoll2 = FrameScore.charAt(i+1);
			if (strRoll2 != '-') {
			
			int roll1 = Character.getNumericValue(strRoll1);
			int roll2 = Character.getNumericValue(strRoll2);
			int total = roll1+roll2;
			if (total>9) {System.out.println("Invalid Total");
			score=0;
			return score;
			}
			else score += total;
			}		
		}

			return score;
}
}