package iVoteClone;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class iVoteService {
	private Question q;
	private Map<String,List<String>> responses;
	public iVoteService(int questionType, String question , String [] answers, String answer){
		if (questionType != 0 && questionType != 1) throw new IllegalArgumentException("questionType must be 0 or 1");
		if (questionType == 1 && answers.length != 4) throw new IllegalArgumentException("answers must be length four");
		if (questionType == 0){
			q = new TrueFalseQuestion(question,answer);
		}else{
			q = new MultipleChoiceQuestion(question, answers, answer);
		}
		responses = new HashMap<String,List<String>>();
	}
	
	public void takeResponse(Student s){
		responses.put(s.getID(), s.answerQuestion(q.text(), q.answers(), q.getMaxAnswers()));
	}
	
	public void stats(){
		Map<String, Integer> tally = new HashMap<String, Integer>();
		for(int i = 0; i < q.answers().size(); i++){
			tally.put(Integer.toString(i+1),0);
		}
	    Iterator<List<String>> it = responses.values().iterator();
	    while (it.hasNext()) {
	    	List<String> response = it.next();
	    	for (int i = 0; i < response.size(); i++){
	    		tally.put(response.get(i), tally.get(response.get(i)) + 1);
	    	}
	    }
	    System.out.println(tally);
	}
	
}
