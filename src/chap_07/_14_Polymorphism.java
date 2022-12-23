package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람 (모든 사람이 학생은 아니다. 모든 사람이 선생님은 아니다.)
        // class Student extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher extends Person : 선생님 (선생님은 사람이다. Teacher is a Person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam(); // FactoryCam의 부모 클래스인 Camera를 써도 됨.
//      = FactoryCam factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam(); // SpeenCam의 부모 클래스인 Camera를 써도 됨.
//      = SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras) {
            cam.showMainFeature();
        }

        System.out.println();

//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();
        // 에러 : 부모 클래스(Camera)로 객체를 생성해서 자식 클래스에 있는 메소드는 호출할 수 없음.

        // instanceof : 객체 타입 확인, 형 변환 가능한지 여부 확인(해당 클래스가 자기집이 맞는지 확인)
        if (camera instanceof Camera) { // camera 객체가 Camera 클래스의 인스턴스가 맞으면
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof Camera) {
            // (FactoryCam)factoryCam -> 형변환 : 객체를 FactoryCam 클래스로 형변환을 하면 접근할 수 있음.(원래는 Camera 클래스였음)
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).recognizeLicensePlate();
            ((SpeedCam)speedCam).checkSpeed();
        }
    }
}
