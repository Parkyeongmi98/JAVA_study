package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final -> Final 변수 : 선언과 동시에 초기화하고 그 이후에는 값을 사용하는 것은 되지만 변경은 불가능
        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준 렌즈"; 에러 : ActionCam클래스에서 final 변수로 지정했기 때문에 변경 불가
        actionCam.recordVideo(); // actionCam의 부모 클래스인 Camera 메소드
        actionCam.makeVideo(); // actionCam의 메소드

        System.out.println();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();

    }
}
