package iVoteClone;
import java.util.Map;


public interface Question {

	String text();
	
	Map<String, String> answers();
	
	String correctAns();
	
	int getMaxAnswers();
	
}
