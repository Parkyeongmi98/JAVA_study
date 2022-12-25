package chap_08.camera;

public class FactoryCam extends Camera {
    @Override // Camera 클래스에서 정의한 추상메소드를 마저 구현 -> 자식 클래스는 객체 생성 가능해짐
    public void showMainFeature() {
        System.out.println("화재 감지");
    }
}