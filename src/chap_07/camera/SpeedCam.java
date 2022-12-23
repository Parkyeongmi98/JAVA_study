package chap_07.camera;

// SpeedCam is Camera. (상속은 IS_A 관계)
public class SpeedCam extends Camera{ // 자식 클래스
    public SpeedCam() {
        //this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture() {
        // 사진 촬영
        super.takePicture(); // Super : 부모 클래스의 변수나 메소드에 접근해 자식 클래스에서 그대로 사용하기 위해
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
        // 부모 클래스의 showMainFeature 메소드 재정의
        // 부모 클래스의 showMainFeature는 이제 호출 불가(Camera.showMainFeature)
    }
}
