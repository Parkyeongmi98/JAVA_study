package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류(에러 error, 예외 exception)
        // 에러 : 우리가 작성하는 코드를 통해서 수습 x, 메모리가 부족해서
        // 예외 : 우리가 작성한 코드를 통해서 수습할 수 있는 것
//      int i = "문자열"; -> 컴파일 오류
//      int[] arr = new int[3];
//      arr[5] = 100; // 컴파일때는 오류가 나지 않지만 실행했을경우 에러 -> 런타임 오류

        try {
            // System.out.println(3 / 0);

            // int[] arr = new int[3];
            // arr[5] = 100;

            Object obj = "test";
            System.out.println((int)obj);

        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace(); // 빨간색 메시지(문제메시지 + 위치)
        }

        System.out.println("프로그램 정상 종료");

    }
}

