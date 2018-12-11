package Observer;

import java.util.ArrayList;

public class JobSeeker implements Observer{
	ArrayList<String> jobs;
	Subject subject;
	
	public JobSeeker(Subject s) {
		subject = s;
		subject.register(this);
	}
	
	public void update(ArrayList<String> jobs) {
		this.jobs = jobs;
		display();
	}
	
	
	
	public void display() {
		for(int i=0;i<jobs.size();i++) {
			System.out.println(jobs.get(i));
		}
	}
}
