package adapter;

public class HairDryer implements  Electrionic110V{
    @Override
    public void PowerOn() {
        System.out.println("헤어드라이기 110v on");
    }
}
