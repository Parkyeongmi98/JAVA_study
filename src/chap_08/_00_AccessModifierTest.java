package chap_08;

import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish; // 다른 패키지에 있는 클래스를 사용하겠다.

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망"; // modelName -> public(모든 클래스에서 접근 가능)
        //b1.resolution = "FHD"; // 에러 : resolution -> default(같은 패키지에서만 접근 가능)
        //b1.price = 200000; // 에러 :price -> private(해당 클래스 내에서만 접근 가능)
        //b1.color = "검은색" // 에러 : color -> protected(같은 패키지 내에서 접근 가능, 다른 패키지인 경우 자식 클래스에서 접근 가능)

        BlackBox b2;
    }
}
