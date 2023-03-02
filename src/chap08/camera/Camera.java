package chap08.camera;
// 카메라 부품이라 가정 
public abstract class Camera {
	public void takePicture() {
		System.out.println("사진을 촬영합니다");
	}
	
	public void recordVideo() {
		System.out.println("동영상을 녹화합니다");
		
	}
	
	public abstract void showMainFeature(); //구현해야 하는 메소드
}
