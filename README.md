# JAVA01
## 자바 입출력과 연산자
- ### 자바 입출력

1. `Scanner` 클래스를 이용한 변수를 선언할 수 있다.

2. 기본적인 데이터 타입들을 `Scanner` 의 메소드를 사용하여 입력받을 수 있다. 예로 들어 100을 입력하고자 할 때, `String`(문자열)로 입력받고 싶으면 `next()` 나 `nextLine()` 을, `int`(정수)로 입력받고 싶다면 `nextInt()` 를 사용하여 입력받으면 알아서 해당 타입으로 입력된다.

3. `Scanner` 을 사용할 시 `util` 패키지를 경로의 `Scanner` 클래스를 호출해야 한다. 자바에서 쓰이는 대부분의 클래스는 `lang` 패키지가 아니라면 `import` 을 통해 호출해주어야 한다. `Scanner` 의 경우는 java.util 패키지에 있다.

4. 공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다. `Scanner` 의 입력 메소드들은 대부분 공백과 개행`(' ', '\t', '\r', '\n' 등등..)`을 기준으로 읽는다. 이 덕분에 사용자의 편의에 따라 쉽게 입력을 받을 수 있다.

- ### 자바 연산자의 종류와 우선순위

1. 피 연산자의 개수에 따른 연산자의 종류
- 단항연산자 : 피 연산자가 1개인 연산자
- 이항 연산자 : 피 연산자가 2개인 연산자
- 삼항 연산자 : 피 연산자가 3개인 연산자

※참고 : 피 연산자란 연산에 참여하는 변수나 상수

2. 용도에 따른 연산자의 우선 순위

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

3. 최우선 연산자
- `( )` : 우선순위 변경을 위해사용
- `[ ]` : 배열의 크기나 첨자를 나타낼 때 사용

4. 단항(Unary) 연산자
- `~` : 1의 보수를 구해주는 연산자.
- 양수의 1의 보수의 부호는 음수가 되고 절대값 1증가
- 음수의 1의 보수의 부호는 양수가 되고 절대값 1감소
- `!` : `NOT(true -> false, false -> true)`
- 부호 +, - : '+'는 형식적으로 제공, '-'는 2의보수 연산자 or 부호바꿈연산자 
- 증감연산자 `++`, `--` : 일반적으로 단항연산자는 피 연산자의 왼쪽에 위치하지만 증감연산자는 왼쪽, 오른쪽 둘다 가능.
- `++` : 피 연산자 1증가
- `--` : 피 연산자 1감소
- 증감연산자의 위치에 따라 연산결과가 달라질 수 있습니다.

5. 산술연산자
- `+, -, *, /` 나머지 연산자 `%`는 두 개의 피연산자를 가지는 이항연산자이며 산술 연산자는 피 연산자의 크기가 4byte보다 작으면 4byte(`int`형)로 변환한 다음에 연산을 수행 
- 연산하기 전에 데이터형 일치시키기 (둘 중 더 큰 자료형으로)
- 정수와 정수 나눗셈시 정수로 나와야 하므로 소수는 버려지고 정수만 출력 된다.

6. Shift 연산자 `<< , >> , >>>`
- 정수형데이터에서만 사용가능하고 2진수로 표현했을때 각 자리를 오른쪽 또는 왼쪽으로 이동
- 오른쪽으로 n비트 이동하면 피연산자를 2의 n승으로 나눈 것과 같은 결과이다.
- `<<` 연산자의 경우, 피연산자의 부호에 상관없이 자리를 왼쪽으로 이동시킵니다.
- `>>` 연산자는 음수인 경우 부호를 유지시켜주기 위해서 빈자리를 1로 채웁니다.
- `>>>` 연산자는 부호에 상관없이 항상 0으로 빈자리를 채워줍니다.

7. 관계 연산자
- 이항 연산자로 피 연산자의 크기를 비교하는 연산자
- 연산의 결과는 `true or false`
- `<, >, <=, >=` : 두 피 연산자의 크기를 비교(boolean형을 제외한 나머지 자료형 사용가능)
- `==, != `: 두 피연산자의 값이 같은지 비교

8. 논리 연산자
- 논리연산자는 이항 연산자로 조건의 참, 거짓을 비교하는 조건 논리 연산자와 비트 논리 연산자로 나뉜다
- 조건 논리 연산자 `||, && ` : boolean형의 값을 결과로 하는 조건식만 허용 (조건문, 반복문에서 많이 사용된다.)
- '||'은 OR 결합이고 `&&`은 `AND`결합이다. 
- 비트 논리 연산자 ` |, &, ^, ~` : 피연사자끼리 이진 비트 연산을 수행해서 결과를 정수로 반환하는 연산자( 정수형만 사용가능)
-  `|`은 OR연산자, `&`은 AND연산자, `^`은 XOR연산자, `~`은 NOT연산자이다.

9. 삼항연산자
- 삼항 연산자는 조건 연산자라고도 하며 3개의 피연산자를 필요로 하게 되는데 첫 번째 피연산자는 조건이며 두 번째 피연산자는 조건이 true일 때 반환 값 세 번째 피연산자는 조건이 false일 때 반환 값입니다.

10. 대입연산자

- 대입 연산자는 변수에 값 또는 수식의 연산결과를 저장하는데 사용됩니다.
    EX) `x = y = 3`일때 `y = 3`이 진행후 `x= y`가 수행된다.
- 대입연사자는 다른연산자와 결합하여 사용할 수 있다. 
    EX) `i = i + 3 ---------------> i += 3` 
