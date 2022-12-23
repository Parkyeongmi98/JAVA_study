package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super : 부모 클래스의 변수나 메소드에 접근해 자식 클래스에서 그대로 사용하기 위해
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println();
        speedCam.takePicture();
    }
}
