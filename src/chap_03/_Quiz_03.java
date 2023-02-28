package chap_03;

/*
 	주민등록번호에서 생년월일 및 성별까지만 출력하는
 	프로그램을 작성하시오
 	
 	주민등록번호는 13자리의 숫자로 구성
 	앞 6자리는 생년월일 정보, 뒷7자리 중 첫 번째 숫자는 성별정보
 	입력 데이터는 -을 포함한 14자리의 문자열 형태
 	
 	예시
 	"901231-1234567"인 경우 901231-1 까지 출력
 	"030708-4567890"인 경우 031231-4 까지 출력
 */

public class _Quiz_03 {

	public static void main(String[] args) {
		String man = "901231-1234567";
		String woman = "030708-4567890";
		
		
		System.out.println(man.substring(0,8)); // 0위치부터 8위치 직전까지
		System.out.println(woman.substring(0,8));
		
		System.out.println(man.substring(man.indexOf("9"), man.lastIndexOf("2")));
		System.out.println(woman.substring(woman.indexOf("0"), woman.indexOf("5")));
		
		System.out.println(man.substring(0, man.indexOf("-")+2)); //0 위치부터 하이픈 위치 + 2 직전까지 
		System.out.println(woman.substring(0, woman.indexOf("-")+2)); //0 위치부터 하이픈 위치 + 2 직전까지 
	}

}
