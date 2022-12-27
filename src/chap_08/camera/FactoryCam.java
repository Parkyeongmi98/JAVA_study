package chap_08.camera;

import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {
    public Detectable detector;
    public Reportable reporter;
    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override // Camera 클래스에서 정의한 추상메소드를 마저 구현 -> 자식 클래스는 객체 생성 가능해짐
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        this.detector.detect();
    }

    @Override
    public void report() {
        this.reporter.report();
    }
}
