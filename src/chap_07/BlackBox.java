package chap_07;

public class BlackBox {
    // <변수>
    String modelName; // 모델명 -> 인스턴스 변수(필드)
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할
                            // (처음엔 0이었다가 ++연산자를 통해서 값을 증가)

    // static을 붙으면 클래스변수,
    // 클래스로부터 만들어지는 모든 객체에 공통적으로 똑같이 적용
    static boolean canAutoReport = false; // 자동 신고 기능

    // <생성자> : 객체가 생성될때 자동으로 호출되는 메소드
    BlackBox() {
//        // 밑에 코드를 호출하고 싶을 경우 this(String modelName, ...) 적어주면 됨
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter; // counter가 현재 0이므로 ++한 1이 serialNumber 값
//                                       // static 변수이므로 값이 초기화되지않고 계속 고정된 상태로 1씩 증가
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // BlackBox() 기본 생성자 호출 후 밑에 코드 실행(시리얼 넘버를 발급받기 위해)
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    // <메소드>
    // 자동 신고 기능 메소드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    };

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if(showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        } if(showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5); // 기본값 설정
    }

    // static이 없는 메소드는 인스턴스 메소드. 각 객체마다 다른 동작을 하게 됨
    // static이 붙은 메소드는 클래스 메소드.
    // 객체가 생성되지 않아도 클래스이름.클래스메소드이름(BlackBox.callServiceCenter)으로 접근 가능
    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        //modelName = "test"; -> 에러 : 인스턴스 변수는 객체가 생성되어야 사용 가능하므로 직접 접근 불가능
        canAutoReport = false; // 클래스 변수는 클래스 메소드에서 바로 사용 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;  // 이름이 같을 경우 this 사용
        // this : 이 클래스의 인스턴스 변수 modelName
        // this가 없는거 : 파라미터로 전달받은 modelName
    }

    // Getter(값을 가져오는 메소드) & Setter(값을 설정하는 메소드)
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if(resolution == null || resolution.isEmpty()) { // isEmpty : " "일 경우 true
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution() {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

}
