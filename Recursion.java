package OOPSConcepts;

public class Recursion {
	
//public void A() {
//	System.out.println("A");
//
// B() ;
//	System.out.println("A");
//}
//
//
//public void B() {
//	System.out.println("B");
//	C();
//	System.out.println("B");
//	
//}
//
//public void C() {
//	System.out.println("c");
//	
//}

	
//	public void PrintDecreasing(int n) {
//		if(n==0)return;
//		System.out.println(n);
//		PrintDecreasing(n-1);
//		
//		
//		
//	}
	
	
//	public void PrintIncreasing(int n) {
//		if(n==0)return;
//		System.out.println(n);
//		PrintIncreasing(n-1);
//		System.out.println(n);
//		
//		
//		
//	}
	
	public void PrintZigZag(int n) {
		if(n==0)return;
		System.out.println("Pre"+n);
		PrintZigZag(n-1);
		System.out.println("In"+n);
		PrintZigZag(n-1);
		System.out.println("Post"+n);
		
		
	}
	


public static void main(String[] args){
Recursion obj = new Recursion();
//obj.PrintDecreasing(3);
//obj.PrintIncreasing(3);
obj.PrintZigZag(3);


}
}
