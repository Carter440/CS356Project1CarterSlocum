package iVoteClone;
import java.util.HashMap;
import java.util.Map;

public class MultipleChoiceQuestion implements Question {
	
	private String q;
	private Map<String,String> ans;
	private String corans;
	
	public MultipleChoiceQuestion(String question, String [] answers, String correctAnswer){
		q = question;
		ans = new HashMap<String,String>();
		if (answers.length != 4) throw new IllegalArgumentException("answers must be of length four");
		ans.put("1", answers[0]);
		ans.put("2", answers[1]);
		ans.put("3", answers[2]);
		ans.put("4", answers[3]);
		if (! ans.containsKey(correctAnswer))throw new IllegalArgumentException("correctAnswer must be 1 2 3 or 4");
		corans = correctAnswer;
	}
	
	@Override
	public String text() {
		return q;
	}

	@Override
	public Map<String,String> answers() {
		return ans;
	}

	@Override
	public String correctAns() {
		return corans;
	}
	
	public int getMaxAnswers(){
		return 4;
	}

}
