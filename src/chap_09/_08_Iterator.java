package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // Iterator(이터레이터) : 데이터를 순회, 커서 위치를 하나씩 이동하며 커서에 위치한 데이터 출력 및 삭제 가능
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("---------------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while (it.hasNext()) { // 커서 다음에 출력할 데이터가 있는지 true이면 계속 출력 / false이면 반복문 종료
            System.out.println(it.next());
        }
        System.out.println("---------------");

        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();// 삭제할 데이터인지 한칸씩 확인
            if (s.contains("(알 수 없음)")) {
                it.remove(); // 삭제
            }
        }

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");
        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }
        System.out.println("---------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator(); -> map은 이터레이터 제공되지 않음
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()) {
            System.out.println(itMapKey.next());
        }
        System.out.println("---------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }
        System.out.println("---------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator(); // entrySet : key와 value 함께 출력
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
