package fan;

public interface Fan {
    int MAX_STRENGTH = 3;
    int MIN_STRENGTH = 1;

    void on();
    void off();
    void turbo();
}
