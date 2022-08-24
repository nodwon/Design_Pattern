package Facade;

public class FTP {
    private String host;
    private int port;
    private String path;

    public FTP(String host, int port, String path){
        this.host = host;
        this.path =path;
        this.port =port;

    }
    public void connect(){
        System.out.println("FTP :" + host +"Port:"+ port + "로 연결 합니다.");
    }
    public void moveDirectory(){
        System.out.println("path:" + path +"로 이동합니다.");
    }
    public void disconnect(){
        System.out.println("FTP 연결을 종로합니다.");
    }
}
