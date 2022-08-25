package Facade;

public class Writer {

    private String fileName;

    public  Writer(String fileName){
        this.fileName =fileName;
    }
    public void fileConnect(){
        String msg = String.format("Reader %s로 연결 합니다.",fileName);
        System.out.println(msg);
    }
    public void fileDisconnect(){
        String msg = String.format("Reader %s로 연결 종료 합니다.",fileName);
        System.out.println(msg);
    }
    public void write(){
        String msg = String.format("Reader %s의 파일쓰기를 합니다.",fileName);
        System.out.println(msg);
    }
}
