package chap_08.camera;

public abstract class Camera {  // abstract : 추상클래스
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); // 자식클래스에서 마저 구현해야 하는 메소드
    // 추상클래스에서 정의하는 추상메소드는 선언만 해도 됨.
}
