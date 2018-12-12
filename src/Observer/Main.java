package Observer;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> jobs = new ArrayList<String>();
		jobs.add("hi");
		jobs.add("hi2");
		jobs.add("hi3");
		jobs.add("hi4");
		
		JobHunter j = new JobHunter();
		System.out.println("Expected to print: Empty List ...");
		JobSeeker s = new JobSeeker(j);

		j.display();
 		j.populate(jobs);
		System.out.println("mydata2 object is populated with:");
		j.addJob("Umer");
		j.removeJob("hi2");
		j.display();
	}

}
