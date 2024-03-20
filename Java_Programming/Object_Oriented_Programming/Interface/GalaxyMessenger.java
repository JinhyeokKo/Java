package Test;

public class GalaxyMessenger implements Messenger, WorkFile {
    public String getMessage() {
        return "galaxy";
    }

    public void setMessage(String msg) {
        System.out.println("galaxy에서 메시지 설정 : " + msg);
    }

    public void changeKeyboard() {
        System.out.println("키보드아이콘 터치 후 키보드를 변경");
    }

    public void fileDownload(){
        System.out.println("file download");
    }
    public void fileUpload(){
        System.out.println("file upload");
    }
}
