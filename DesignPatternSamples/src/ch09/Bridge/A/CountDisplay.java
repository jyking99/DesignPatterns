package ch09.Bridge.A;

public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }
    public void multiDisplay(int times) {       // times?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申?申
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
