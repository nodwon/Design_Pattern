package singleton;

public class Aclass {

    private SocketClient socketClient;

    public  Aclass(){
        this.socketClient = SocketClient.getInstance();
    }
    //getter
    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
