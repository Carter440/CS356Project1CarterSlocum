package iVoteClone;

import java.util.ArrayList;
import java.util.List;

public class SimulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] emp = {};
		String [] a = {"Burgers", "Pizza", "Tacos", "Pancakes"};
		List<Student> studs = new ArrayList<Student>();
		for (int i = 0; i < 50; i ++){
			studs.add(new RandomStudent(Integer.toString(i)));
		}
		iVoteService s1 = new iVoteService(0,"A Process and a Thread are the same thing.",emp,"2");
		for(int i = 0; i < 50; i++){
			s1.takeResponse(studs.get(i));
		}
		s1.stats();
		iVoteService s2 = new iVoteService(1,"What is the best food?", a, "4");
		for(int i = 0; i < 50; i++){
			s2.takeResponse(studs.get(i));
		}
		s2.stats();
	}

}
