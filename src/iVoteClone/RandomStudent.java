package iVoteClone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomStudent implements Student {

	private String ID;
	
	public RandomStudent(String id){
		ID = id;
	}
	
	@Override
	public String getID() {
		return ID;
	}

	@Override
	public List<String> answerQuestion(String question,
			Map<String, String> answers, int max) {
		Random random = new Random();
		List<String> ans = new ArrayList<String>();
		if(max == 1) max++;
		ans.add((String) answers.keySet().toArray()[random.nextInt(max)]);
		return ans;
	}

}
