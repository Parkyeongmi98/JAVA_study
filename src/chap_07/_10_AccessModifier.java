package chap_07;

public class _10_AccessModifier {
    // 캡슐화(Encapsulation) -> 연관되어 있는 데이터들을 하나로 묶어두기(하나의 클래스로)
    // 정보은닉(Information hiding) -> 정보 숨기기. 객체내에 있는 변수나 메소드의 직접적인 접근을 막고
    //                               객체에서 허용해주는 형태로만 접근이 가능하게 하는 것(getter, setter를 통해 어느 정도 접근)

    // 접근 제어자
    // private : 해당 클래스 내에서만 접근 가능
    // public : 모든 클래스에서 접근 가능
    // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
    // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
//      b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution); // b1.resolution을 주석처리하고 호출 -> null

        System.out.println();

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());
    }
}
