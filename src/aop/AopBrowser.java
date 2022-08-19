package aop;

import Proxy.Html;
import Proxy.IBroswser;

public class AopBrowser implements IBroswser {

    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public  AopBrowser(String url, Runnable before, Runnable after){
        this.url = url;
        this.before =before;
        this.after = after;
    }
    @Override
    public Html show() {
        before.run();
        if(html ==null){
            this.url = url;
            System.out.println("AopBrowser html loading from:"+url);
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
        after.run();
        System.out.println("AopBrowser html cache:"+url);


        return null;
    }
}
