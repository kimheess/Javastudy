package chap_06;

public class _07_VariableScope {
	
	public static void methodA() {
		//System.out.println(number);
	}
	
	public static void methodB() {
		int result = 1;	//지역 변수 변수가 선언된 영역 내 에서만 사용 가능
	}

	public static void main(String[] args) {
		int number = 3;
		
		
		for ( int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		//System.out.println(i);
		{
			int j =0;
			System.out.println(j);
		}
		
		//System.out.println(j);
		
		

	}

}
