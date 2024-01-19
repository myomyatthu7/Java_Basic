package interfac;

public class Television implements Remote {

    @Override
    public void powerOn() {
        System.out.println("Power On");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }

    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }
}
interface Remote {

    void powerOn();
    void volumeUp();
    void volumeDown();
    void powerOff();

}
