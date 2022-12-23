package chap_07.camera;

// final 클래스 : 상속 불가능
public final class ActionCam extends Camera{
    public final String lens = "광각렌즈"; // final 변수 : 선언과 동시에 초기화하고 그 이후에는 값을 사용하는 것은 되지만 변경은 불가능
    public ActionCam() {
        this("액션 카메라");
    }

    public ActionCam(String name) {
        super("액션 카메라");
    }

    // final 메소드 : 메소드 사용 불가능
    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}

