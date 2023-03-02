package chap_08;

import chap08.detector.AdvancedFireDetector;
import chap08.detector.Detectable;
import chap08.detector.FireDetector;
import chap08.reporter.NormalReporter;
import chap08.reporter.Reportable;
import chap08.reporter.VideoReporter;
import chap08.camera.FactoryCam;

public class _02_Interface {

	public static void main(String[] args) {
		// 인터페이스
		
	
		Reportable nor1 = new NormalReporter();
		nor1.report();
		
		Reportable vid1 = new VideoReporter();
		vid1.report();
		
		System.out.println("--------------------------");
		
		Detectable fire = new FireDetector();
		fire.detect();
		
		Detectable advn = new AdvancedFireDetector();
		advn.detect();
		
		System.out.println("--------------------------");
		
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.setDetector(advn);
		factoryCam.setReporter(vid1);
		
		factoryCam.detect();
		factoryCam.report();
	}

}