package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화(Data Abstraction)
        // abstract
        // 추상 클래스(아직 완성되지 않은 클래스) -> 객체를 만들 수 없음
        // 추상 메소드(추상 클래스 또는 인터페이스에서 사용 가능, 껍데기만 있는 메소드)

        // Camera camera = new Camera(); -> 추상클래스는 객체 만들 수 없음.

        // 추상클래스를 상속한 자식클래스는 추상클래스에 있는 추상메소드를 반드시 구현해야함
        // 구현 후 자식클래스는 객체 생성 가능
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
