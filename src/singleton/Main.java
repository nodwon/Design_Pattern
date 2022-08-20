package singleton;

import Proxy.IBroswser;
import adapter.*;
import aop.AopBrowser;
import singleton.Aclass;
import singleton.Bclass;
import singleton.SocketClient;

import java.util.concurrent.atomic.AtomicLong;

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

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBroswser aopbroswser = new AopBrowser("www.naver.com",
                () ->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());

                },() ->{
                long now  = System.currentTimeMillis();
                end.set(now -start.get());

        });
        aopbroswser.show();
        System.out.println("loding time:" +end.get());

        aopbroswser.show();
        System.out.println("loding time:" +end.get());
    }
    //콘센트
    public static void connect(Electrionic110V electrionic110V){
        electrionic110V.PowerOn();
    }
}
