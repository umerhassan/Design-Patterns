package Observer;

import java.util.ArrayList;

public class JobHunter implements Subject{
	ArrayList<String> jobs;
	ArrayList<Observer> observers;
	
	public JobHunter() {
		jobs = new ArrayList<String>();
		observers = new ArrayList<Observer>();
	}
	
	public void register(Observer o) {
		observers.add(o);
		o.update(jobs);
	}
	
	public void remove(Observer o) {
		observers.remove(o);
		// it doesn't include update because it will have no access to data once removed 
		
	}
	
	public void addJob(String s) {
		jobs.add(s);
		notifyAllObservers();
	}
	
	public void removeJob(String s) {
		for(int i=0;i<jobs.size();i++) {
			if(jobs.get(i).equals(s)) jobs.remove(i);
		}
		notifyAllObservers();
	}
	
	public void notifyAllObservers() {
		for(int i=0;i<observers.size();i++) {
			Observer o = observers.get(i);
			o.update(jobs);
		}
	}
	
	public void populate(ArrayList<String> jobs) {
		for(int i = 0; i < jobs.size(); i++)
			this.jobs.add(jobs.get(i));
		notifyAllObservers();
	}
	
	public void display() {
		for(int i=0;i<jobs.size();i++) {
			System.out.println(jobs.get(i));
		}
	}
}
