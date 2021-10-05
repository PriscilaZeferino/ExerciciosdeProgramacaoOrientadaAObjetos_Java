package lista1;

public class ex1 {
	
	public static int maior(int a, int b) {
		if(a > b) {
			return a;
		} else if (a < b) {
			return b;
		}
		return a;
	}
	
	public static void main(String[] args) {

		System.out.println(maior(10, 2)==10);
		System.out.println(maior(5, 8)==8);
		System.out.println(maior(8, 8)==8);
		
	}

}
