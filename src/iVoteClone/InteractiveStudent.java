package iVoteClone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InteractiveStudent implements Student {
	
	private String ID;

	public InteractiveStudent(String id){
		ID = id;
	}
	
	@Override
	public String getID() {
		return ID;
	}

	@Override
	public List<String> answerQuestion(String question,
			Map<String, String> answers, int max){
		//this is an experimental class to showcase polymorphism
		//does not sanitize inputs
		List<String> ans = new ArrayList<String>();
		System.out.println("Student ID: " + ID);
		System.out.println(question);
		//this is a hacky solution to make printing work for sets
		String [] alph = {"1", "2", "3", "4"};
		for(int i = 0; i < max; i++){
			System.out.println(alph[i] + ": " + answers.get(alph[i]));
		}
		int choice = 0;
		try {
			choice = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String choices = Integer.toString(choice);
		for (int i = 0; i < max; i++){
			if (i < choices.length())
				ans.add(choices.substring(i, i+1));
		}
		return ans;
	}

}
