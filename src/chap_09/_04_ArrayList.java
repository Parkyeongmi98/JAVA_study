package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 : 많은 데이터를 쉽고 편리하게 효과적으로 관리하기 위해서 자바에서 제공해주는 클래스들의 모음
        // List(ArrayList, LinkedList) : 중복 허용
        // ArrayList : 배열 중간에 데이터를 추가하려면 그 위치부터 뒤에 모든 데이터가 하나씩 밀림
        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        //데이터 조회(인덱스)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("----------------");

        // 삭제(박명수씨가 이사)
        System.out.println("신청 학생 수(이사 전) : " + list.size()); // 5
        list.remove("박명수");
        System.out.println("신청 학생 수(이사 후) : " + list.size()); // 4
        System.out.println(list.get(3)); // 인덱스번호 4였던 강호동이 3으로 올라옴

        System.out.println("----------------");

        System.out.println("남은 학생 수(제외 전) : " + list.size()); // 4
        list.remove(list.size() - 1); // 총 남은 학생 수 -1(인덱스번호) 제일 마지막 학생이 줄어듬
        System.out.println("남은 학생 수(제외 후) : " + list.size()); // 3

        System.out.println("----------------");

        // 순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------");

        // 데이터 변경(수강권 변경)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("----------------");

        // 데이터 확인
        System.out.println(list.indexOf("김종국")); // 인덱스 번호 확인

        System.out.println("----------------");

        // 선착순 5명 내에 포함되었는가? (true or false)
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("----------------");

        // 데이터 전체 삭제
        list.clear();
        if(list.isEmpty()) { // isEmpty : 비었다
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("----------------");

        // 새로운 학기 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        Collections.sort(list); // 데이터 정렬
        for (String s : list) {
            System.out.println(s);
        }
    }
}
