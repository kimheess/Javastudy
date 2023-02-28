package chap_04;

public class _Quiz_04 {
	
	/*
	 	조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
	 	
	 	조건
	 	주차요금은 시간당 4000원 (일일 최대 요금은 30,000원)
	 	경차 또는 장애인 차량은 최종 요금에서 50% 할인 *장애인 차량 : 직접 운전 또는 탑승 모두 포함 
	 	
	 	주차요금 예시 
	 	
	 	일반 차량 5시간 주차시 20,000원 
	 	경차 5시간 주차 시 10,000원
	 	장애인 차량 10시간 주차시 15,000원 
	 	
	 	실행 결과 
	 	
	 	주차 요금은 20000원 입니다.
	 	
	*/

	public static void main(String[] args) {
		int hour = 10; // 주차 시간
		boolean isSmallCar = true; // 경차 여부 
		boolean withDisadledPerson = false; // 장애인 차량 여부
		
		int fee = hour *4000; // 시간당 4000원 곱하기 
		
		// 30000원 초과 시 일일 최대 요금으로 수정 
		if (fee>30000) {
			fee = 30000; //일일 최대 요금 적용 
		}
		if(isSmallCar || withDisadledPerson) {
			fee /= 2; //50% 할인 적용 
		}
		
		//실행 결과 출력 
		System.out.println("주차 요금은" + fee + "원입니다");
		
	}

}
