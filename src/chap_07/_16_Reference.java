package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형(int, float, double, long, boolean, ...)
        // 값을 지정하지 않아도 기본값을 항상 가지고 있음, 메소드가 없음, 소문자로 시작
        int[] i = new int[3];
        System.out.println(i[0]); // 0


        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형(Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam, ...)
        // 값을 지정하지 않으면 null로 지정, 메소드를 가질 수 있음, 대문자로 시작
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true -> null

        System.out.println();

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a); // 10
        System.out.println(b); // 10
        b = 30;
        System.out.println(a); // 10
        System.out.println(b); // 30

        System.out.println();

        Camera c1 = new Camera(); // c1과 c2는 각각의 객체를 참조하고 있음
        Camera c2 = new Camera(); // c1과 c2는 각각의 객체를 참조하고 있음
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라2
        c2 = c1; // c2는 c1의 객체를 참조하게 됨
        System.out.println(c1.name); // 카메라1
        System.out.println(c2.name); // 카메라1
        c2.name = "고장난 카메라";
        System.out.println(c1.name); // 고장난 카메라 -> c2만 바꿨지만 같이 바뀜
        System.out.println(c2.name); // 고장난 카메라    (c2를 바꾸게 되면 c1과 같은 객체를 참조하고 있으므로 둘다 이름이 바뀜)

        System.out.println();

        changeName(c2); // c2를 가르켰지만 c1의 객체를 대입했기 때문에 c1의 객체를 참조중
        System.out.println(c1.name); // 잘못된 카메라 -> c2만 바꿨지만 c1의 객체가 바뀐것이고
        System.out.println(c2.name); // 잘못된 카메라    c1의 객체를 참조중이기 때문에 다같이 바뀌게 됨

        c2 = null; // c1의 객체를 참조하고 있던걸 끊어버림
        System.out.println(c2.name); // 에러 -> c1의 객체를 참조하고 있던걸 끊어버렸기 때문에 빈값이므로
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
