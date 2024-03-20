package Test;

public class IPhoneMessenger extends GraphicIOS implements Messenger {

    public String getMessage() {
        return "iPhone";
    }

    public void setMessage(String msg) {
        System.out.println("iPhone에서 메세지 설정: " + msg);
    }

    public void clearMessage() {
        System.out.println("좌우로 흔들어 문자열을 지움");
    }
}
