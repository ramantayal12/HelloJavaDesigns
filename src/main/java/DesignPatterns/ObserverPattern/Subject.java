package DesignPatterns.ObserverPattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void publishMessage();
    void changeState(int state);
    int getState();
}
