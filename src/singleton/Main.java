package singleton;

import singleton.Aclass;
import singleton.Bclass;

public class Main {
    public static void main(String[] args) {
        Aclass aClazz = new Aclass();
        Bclass bClazz = new Bclass();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        System.out.println("두객의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));
    }
}
