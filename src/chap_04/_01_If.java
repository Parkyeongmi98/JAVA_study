package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        // 오후 2시 전이면 커피를 마시겠습니다.
        int hour = 10; // 오전 10시
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        } else {
            System.out.println("저는 안마시겠습니다.");
        }
        System.out.println("커피 주문 완료");

        System.out.println();

        // 오후 2시 이전 모닝 커피를 마시지 않은 경우 오후에 커피를 마시겠다.
        // 오전에 마셨지만 또 마시고 싶은 경우 디카페인 커피 주문
        int time = 14;
        boolean coffee = false; // 커피마시지 않음

        if(time < 15) {
            if (coffee == true) {
                System.out.println("아이스 아메리카노 +1");
            } else {
                System.out.println("디카페인 아이스 아메리카노 +1");
            }
        }
        System.out.println("커피 주문 완료");
    }
}
