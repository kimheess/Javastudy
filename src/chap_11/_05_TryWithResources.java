package chap_11;

public class _05_TryWithResources {

	public static void main(String[] args) {
		

	}

}

class MyfileWriter implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("파일을 정상적으로 닫습니다.");
	}
	
}