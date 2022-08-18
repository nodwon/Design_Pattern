package Proxy;

public class Browser implements IBroswser{
    private String url;
    public Browser(String url){
        this.url=url;
    }

    @Override
    public Html show() {
        System.out.println("broswer loading html from:"+url);
        return new Html(url);
    }
}
