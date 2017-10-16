package iVoteClone;

import java.util.HashMap;
import java.util.Map;

public class TrueFalseQuestion implements Question {

	private String q;
	private Map<String,String> ans;
	private String corans;
	
	public TrueFalseQuestion(String question, String correctAnswer){
		q = question;
		ans = new HashMap<String,String>();
		ans.put("1", "True");
		ans.put("2", "False");
		if(!ans.containsKey(correctAnswer)) throw new IllegalArgumentException("correctAnswer must be 1 or 2");
		corans = correctAnswer;
	}
	
	@Override
	public String text() {
		return q;
	}

	@Override
	public Map<String, String> answers() {
		return ans;
	}

	@Override
	public String correctAns() {
		return corans;
	}
	
	public int getMaxAnswers() {
		return 1;
	}

}
