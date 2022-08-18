package singleton;

// sigleton
public class SocketClient {

    private static SocketClient socketClient = null;

    private  SocketClient(){

    }
    //getter
    public static  SocketClient getInstance(){

        if(socketClient == null){
            socketClient = new SocketClient();

        }
        return socketClient;
    }
    public void connect(){
        System.out.println("connect");
    }
}
