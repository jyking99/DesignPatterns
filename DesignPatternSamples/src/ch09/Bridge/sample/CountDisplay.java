package ch09.Bridge.sample;
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {       // times?¿½?·«¤?¿½?¿½Ö¤?¿½?¿½?¿½É½?¿½?¿½?¿½?¿½?¿½?¿½
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
