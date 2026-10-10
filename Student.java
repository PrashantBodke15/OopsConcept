package OOPSConcepts;

public class Student extends Teacher  {
	int c=9;
	public void sleeping() {
		System.out.println("student is sleeping");
	}
	@Override
	public void occupation() {
		System.out.println("I am a software Developer");
	}

}
