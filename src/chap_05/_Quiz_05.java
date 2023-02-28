package chap_05;

/*
 	배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그래믈 작성하시오
 	
 	조건
 	신발 사이즈는 250부터 295 까지 5단위로 증가
 	신발 사이즈 수는 총 10가지 
 */
public class _Quiz_05 {

	public static void main(String[] args) {
//		int[] size = {250,255,260,270,275,280,285,290,295};
//		
//		for(int i = 0; i < size.length; i++) {
//			System.out.println("사이즈 " + size[i] + " (재고 있음)");
//		}
//	}
		int[] sizeArray = new int[10];
		
		for(int i = 0; i < sizeArray.length; i++) {
			sizeArray[i]=250 + (5 * i);
		}
		for(int size:sizeArray) {
			System.out.println("사이즈 " + size + " (재고 있음)");
		}
		
	}
}
