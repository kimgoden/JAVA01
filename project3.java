package project02;

import java.util.Scanner;

public class project3 {
	public static void main(String [] args) throws Exception {
	
	System.out.println("이름, 핸드폰번호, 나이, 오늘의 날짜를 빈칸으로 분리하여 입력하세요");
	Scanner scanner = new Scanner(System.in);
	String a = scanner.next();
	System.out.println("당신의 이름은 " + a + "입니다.");
	String b = scanner.next();
    System.out.println("당신의 핸드폰 번호는 " + b + "입니다.");
    int c = scanner.nextInt();
    System.out.println("당신의 나이는 " + c +"입니다.");
    String d = scanner.next();
    System.out.println("오늘의 날짜는 " + d + "입니다.");
    scanner.close();
    
    
}
	
}
