package singleton;

import Proxy.*;
import adapter.*;
import singleton.Aclass;
import singleton.Bclass;
import singleton.SocketClient;
public class Main {
    public static void main(String[] args) {
        Aclass aClazz = new Aclass();
        Bclass bClazz = new Bclass();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();
        System.out.println("두객의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient));

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
        Cleaner cleaner = new Cleaner();
        Electrionic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);
        AairConditioner aairConditioner = new AairConditioner();
        Electrionic110V airAdapter = new SocketAdapter(aairConditioner);
        connect(airAdapter);

        Browser browser = new Browser("www.naver.com");
        browser.show();
    }
    //콘센트
    public static void connect(Electrionic110V electrionic110V){
        electrionic110V.PowerOn();
    }
}
