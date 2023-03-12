package chap_11;

public class _02_Catch {

	public static void main(String[] args) {
		try {
//			System.out.pr intln(3 / 0);
			
			int[] arr = new int[3];
			arr[5] = 100;
//			
//			Object obj = "test";
//			System.out.println((int)obj);
			
//			String s = null;
//			System.out.println(s.toLowerCase());
		}	
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("뭔가 실수 하셨네요");
		}
		
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("인덱스를 잘못 설정 했어요 ");
//		}
		
		catch(ClassCastException e) {
			System.out.println("잘못된 형 변환 입니다.");
		}
		
		catch (Exception e) {
			System.out.println("그외의 모든 문제는 여기서 해결 돼요");
			e.printStackTrace();
		}
		
			System.out.println("프로그램 정상 종료");

	}

}
