package chap_04;

public class _05_for {

	public static void main(String[] args) {
		// 반복문 for 
		// 나코 매장 
//		System.out.println("어서오세요. 나코입니다.");
//		// 또 다른 손님이 들어오면?
//		System.out.println("어서오세요. 나코입니다.");
//		System.out.println("어서오세요. 나코입니다.");
//		System.out.println("어서오세요. 나코입니다.");
//		System.out.println("어서오세요. 나코입니다.");
//		System.out.println("어서오세요. 나코입니다.");
//		System.out.println("어서오세요. 나코입니다.");
//		// 만약에 인사 법이 바뀌면?
//		System.out.println("환영합니다. 나코입니다.");
//		System.out.println("환영합니다. 나코입니다.");
//		System.out.println("환영합니다. 나코입니다.");
//		System.out.println("환영합니다. 나코입니다.");
//		
//		// 매장 이름이 바뀌면?
//		// 나코 -> 코나
//		System.out.println("환영합니다. 코나입니다.");
//		
//		System.out.println("------반복문 사용 --------");
//		// 반복문 사용 for 
////		for (선언;조건;증감) {
////			...수행 명령...
////		}
//		for (int i = 0; i < 10; i++) {
//			System.out.println("어서오세요. 나코입니다 " + i);
//		}
//		
//		// 짝수만 출력
//		// 0, 2 , 4, 6, 8
//		for (int i = 0; i < 10; i += 2) {
//			System.out.println(i);
//		}
//		// 홀수만 출력
//		for (int i = 1; i < 10; i+=2 ) {
//			System.out.println(i);
//		}
//		
//		// 거꾸로 숫자
//		// 5,4,3,2,1
//		for (int i = 5; i >0; i--) {
//			System.out.print(i);
//		}
//		
		//1부터 10까지의 수들의 합 = 55
		int sum = 0;
		for (int i=1; i <= 10; i++) {
			sum += i;
			System.out.println("현재까지 총합은 " + sum + "입니다.");
		}
		System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
	}

}
