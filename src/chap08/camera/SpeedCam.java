package chap08.camera;

import chap08.Accident.Detector;
import chap08.detector.Detectable;
import chap08.reporter.Reportable;

public class SpeedCam extends Camera implements Detector,Reportable{
	private Detector detector;
	private Reportable reporter;
	
	public void setDetector(Detector detector){
		this.detector = detector;
	}
	
	public void setReporter(Reportable reporter) {
		this.reporter = reporter;
	}
	
	
	
	
	
	@Override
	public void showMainFeature() {
		System.out.println("속도 측정, 번호 인식");
	}
	
	public void detect() {
		detector.detect();
	}
	public void report() {
		reporter.report();
	}
}
