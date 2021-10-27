package project02;

public class project07 extends porject {
	public static void main(String [] args) {

		
		int a = 0;
		int b = 0;
		boolean result;
		
		result =((a += 10) < 0) & ((b += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println();
		
		result = ((a += 10) > 0) || ((b += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		
				
				
		
	}
}
