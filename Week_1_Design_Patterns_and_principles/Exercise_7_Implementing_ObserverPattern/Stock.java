package Exercise_7_Implementing_ObserverPattern;

public interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

