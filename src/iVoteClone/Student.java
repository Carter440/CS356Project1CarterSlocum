package iVoteClone;

import java.util.List;
import java.util.Map;

public interface Student {
	
	String getID();
	
	List<String> answerQuestion(String question, Map<String,String> answers, int max);
	
	
}
