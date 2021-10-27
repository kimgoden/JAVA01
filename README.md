# JAVA01
### 자바 입출력과 연산자
-자바 입출력

1. Scanner 클래스를 이용한 변수를 선언할 수 있다.

2. 기본적인 데이터 타입들을 Scanner 의 메소드를 사용하여 입력받을 수 있다. 예로 들어 100을 입력하고자 할 때, String(문자열)로 입력받고 싶으면 next() 나 nextLine() 을, int(정수)로 입력받고 싶다면 nextInt() 를 사용하여 입력받으면 알아서 해당 타입으로 입력된다.

3. Scanner 을 사용할 시 util 패키지를 경로의 Scanner 클래스를 호출해야 한다. 자바에서 쓰이는 대부분의 클래스는 lang 패키지가 아니라면 import 을 통해 호출해주어야 한다. Scanner 의 경우는 java.util 패키지에 있다.

4. 공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다. Scanner 의 입력 메소드들은 대부분 공백과 개행(' ', '\t', '\r', '\n' 등등..)을 기준으로 읽는다. 이 덕분에 사용자의 편의에 따라 쉽게 입력을 받을 수 있다.

-자바 연산자의 종류와 우선순위

| 종류  | 최우선  |
|:---:|:---:|
|  최우선 | ( ), [ ]   |
| 단항 연산자  | ++, --, +, -, (type), !, ~    |
| 산술 연산자  | %, /, *, +, -   |
| 시프트 연산자  | >>, <<, >>>   |
| 관계 연산자  | <, <=, >, >=, ==, !=    |
| 논리 연산자  | &, ^, |, ~, &&, ||    |
| 삼항 연산자  | ? :    |
| 대입 연산자  | =, +=, -=, *=, %=, /=, >>=, <<=    |
| 콤마 연산자  | ,   |
