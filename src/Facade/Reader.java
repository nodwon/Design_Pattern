package Facade;

public class Reader {

    private  String fileName;

    public Reader(String fileName){
        this.fileName = fileName;
    }
    public void fileConnect(){
        System.out.println("Reader %s");
    }
    public void fileRead(){

    }
    public void fileDisconnect(){

    }
}
