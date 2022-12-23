package chap_07.camera;

// FactoryCam is a Camera. (상속은 IS_A 관계)
public class FactoryCam extends Camera{ // 자식 클래스
    public FactoryCam() {
        // this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void recordVideo() {
        // 동영상 녹화
       super.recordVideo(); // Super : 부모 클래스의 변수나 메소드에 접근해 자식 클래스에서 그대로 사용하기 위해
       detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
        // 부모 클래스의 showMainFeature 메소드 재정의
        // 부모 클래스의 showMainFeature는 이제 호출 불가(Camera.showMainFeature)
    }
}
