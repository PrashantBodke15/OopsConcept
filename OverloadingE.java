package OOPSConcepts;

public class OverloadingE {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void add(double a, double b) {
		System.out.println(a+b);
		
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a,double b,double c) {
		return a+b+c;
	}
	
}
