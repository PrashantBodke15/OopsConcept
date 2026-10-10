package OOPSConcepts;

public class TOH {
	public void toh(int n, char S, char D,char H) {
		if(n==0)return;
		toh(n-1,S,H,D);
		System.out.println("Move" + n +"from" +S + "to" +D);
		toh(n-1,H,D,S);
	}
	public static void main(String[] args) {
		TOH obj = new TOH();
		obj.toh(5, 'A', 'B','C');
		
	}

}
