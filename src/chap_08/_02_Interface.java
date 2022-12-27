package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스(뼈대만 구성)
        // 단일상속(extends) -> 부모를 하나만 상속 가능

        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        FireDetector fireDetector = new FireDetector();
        fireDetector.detect();

        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();

        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(fireDetector);
        speedCam.setReporter(normalReporter);

        speedCam.detect();
        speedCam.report();
    }
}
