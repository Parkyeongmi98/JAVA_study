package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 실행가능한 형태로 만들어진 것들 : 프로그램 / 프로그램을 클릭하여 돌아가고 있는 상태 : 프로세스
        // 프로세스는 여러 개의 쓰레드를 가질 수 있으나 쓰레드처리를 해주지않으면 하나의 프로세스가 하나의 쓰레드만 가지게 됨
        // 하나의 포르세스(Process)
        // 쓰레드(Thread) : 프로세스의 자원을 이용해서 실제로 작업을 수행하는 것

        // 1 3 5 7  9 (사장님이 청소)
        // 2 4 6 8 10 (직원이 청소)

        // cleanBySelf();
        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); // 직원과 사장 메소드가 동시에 호출 x
        cleanThread.start(); // 직원이 청소(Thread 호출)
        cleanByBoss(); // 사장님이 청소
    }

    public static void cleanBySelf() {
        System.out.println("-- 혼자 청소 시작 --");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("-- 혼자 청소 끝 --");
    }

    public static void cleanByBoss() {
        System.out.println("-- 사장 청소 시작 --");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("-- 사장 청소 끝 --");
    }
}
