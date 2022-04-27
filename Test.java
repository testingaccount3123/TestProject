

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World");
		boolean rudraIsCool = true;
		if(rudraIsCool){
			System.out.println("Kewl");
		}
		
		int x = 5;
		
		int y = 22;
		
		int count = 0;
		
		for (int i=0; i<1000000; i++) {
			count = x * y * x * y;
			System.out.println("count: " + count);
		}
	}
}