package chap02_variableAndType.sec01_variable.exam01_Initialization;

// 변수 초기화
public class VariableInitializationExample {
	public static void main(String[] args) {
		// 변수 value 선언, 초기화
		int value = 3;
		
		// 변수 value 값을 읽고 10을 더하는 산술 연산 수행
		// -> 연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}
}
