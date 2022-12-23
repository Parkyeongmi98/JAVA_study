package chap_07;

import java.util.Random;

public class _11_packge {
    public static void main(String[] args) {
        // 패키지(연관된 자바 클래스들을 묶어서 정리해주는 폴더)
        // 랜덤 클래스
        Random rendom = new Random();
        System.out.println("랜덤 정수 : " + rendom.nextInt()); // int의 범위 내에서 랜덤 정수형 값 반환
        System.out.println("랜덤 정수(범위) : " + rendom.nextInt(10)); // 0이상 10미만의 정수형 값 반환
        System.out.println("랜덤 실수 : " + rendom.nextDouble()); // 0.0이상 1.0미만의 실수값
        System.out.println("랜덤 실수(범위) : " + rendom.nextDouble(2)); // 0이상 2미만의 실수형 값 반환
        System.out.println("랜덤 boolean : " + rendom.nextBoolean());

        // 로또 번호를 랜덤으로 뽑으려면? 1~45
        System.out.println("로또 번호 : " + (rendom.nextInt(45)+1));
        // nextInt(45) : 0 이상 45 미만의 수
        // nextInt(45) + 1 : 1 이상 46 미만의 수 = 1~45

        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...
    }
}
