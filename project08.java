package project02;

public class project08 extends porject {
	public static void main(String [] args) {

	int x = 3;
	int y = 4;
	int z = x * y;
	
	System.out.println("사갈형의 넓이는 " +z);
	
	  System.out.println("삼각형의 넓이느 " +(z/2));
	
	int a = 40;
	int b = 30;
	int c = 10;
	int q = a + b + c;
	
	System.out.println("평균은 " + (q/3));
	
	int d = 1200;
	int e = 240;
	System.out.println("연봉은 " +(d-e));
	
	int f = 256;
	int k = f / 60;
	System.out.println(k + "분 " + (f%60) + "초");
	
	
	int g = 10;
	int h = 5;
	boolean result;
	
	result = ((g > 7)) && ((h<=5));
	System.out.println("result1 = " +result);
	result = ((g%3==0)) || ((h%2 !=1));
	System.out.println("result2 = " +result);
	System.out.println();

	int i = 534;
	System.out.println("학생당 받을 수 있는 연필은 " +(i/30) +  "개 이고" + " 남은 연필은 " + (i%30) + "개 이다.");
	
	int value = 356;
	int j = 356 % 300;
	System.out.println(("value =" + (value-j)));
	
	
	
	
	
	
	

	
	
	
	
		
	}
}
