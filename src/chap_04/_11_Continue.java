package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;  // 밑으로 가지 않고 다시 for문으로 이동 -> sold에 증감처리 x
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업 종료되었습니다.");

        System.out.println();

        // While문
        int human = 1; // 손님
        max = 20; // 최대 치킨
        sold = 0; // 현재 판매 개수
        noShow = 13; // 노쇼 손님
        while (human <= 50) {
            System.out.println(human + "번 손님 주문하신 치킨 나왔습니다.");

            if (human == noShow) {
                System.out.println(human + "번 손님 안계시므로 다음 손님으로 넘어갑니다.");
                human++;
                continue;
            }
            sold++;

            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            human++;
        }
        System.out.println("영업 종료되었습니다.");
    }
}
