package chap_07;

import chap_07.camera.SpeedCam;
import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;

public class _12_Ingeritance {

	public static void main(String[] args) {
		// 상속  부모클래스에서 자식클래스에서 갖다 쓴다 
		
		Camera camera = new Camera();
		FactoryCam factoryCam = new FactoryCam();
		SpeedCam speedcam = new SpeedCam();
		
		System.out.println(camera.name);
		System.out.println(factoryCam.name);
		System.out.println(speedcam.name);
		
		camera.takePicture();
		factoryCam.recordVideo();
		speedcam.takePicture();
		
		factoryCam.detectFire();
		speedcam.checkSpeed();
		speedcam.recognizeLicensePlate();

	}

}
