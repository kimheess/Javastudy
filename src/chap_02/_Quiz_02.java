package chap_02;

/*
 	어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오 
 	
 	조건 키가 120CM 이상인 경우에만 탑승 가능
 	삼항 연산자 이용 
 */

public class _Quiz_02 {

	public static void main(String[] args) {
		int i = 0;
		String x = (120 <= i) ? "가능" : "불가능";
		 
		 i=118;
		 
		 System.out.println("키가" + i + "cm 이므로 탑승 " + x + "합니다");
		 
		 
	}

}
