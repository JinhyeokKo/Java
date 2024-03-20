package Test;

public interface Messenger {
    // public static final 생략 시 자동 선언
    public static final int MIN_SIZE = 1;
    public static final int MAX_SIZE = 100;

    // public abstract 생략 시 자동 선언
    public abstract String getMessage();

    public abstract void setMessage(String message);

    // default 를 통한 본문 구현
    public default void setLogin(boolean login) {
        if(login)
            System.out.println("Login: true");
        else
            System.out.println("Login: false");
    }

    // default 생략 시 자동 선언
    public static void getConnection(){
        // static 메서드 내에서 다른 메서드를 사용하려면 같은 static 메서드이어야 함
        log();
        System.out.println("Connection: true");
    }

    // default 를 통한 private 메서드
    private static void log(){
        System.out.println("Logging...");
    }
}
