package ch09.Bridge;
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {       // times�󷫤��֤���ɽ������
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
