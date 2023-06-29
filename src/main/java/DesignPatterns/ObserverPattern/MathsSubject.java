package DesignPatterns.ObserverPattern;

import com.google.common.collect.Lists;
import java.util.List;

public class MathsSubject implements Subject{

    List<Observer> observers = Lists.newArrayList ();
    private int state;

    public void addObserver(Observer observer) {
        observers.add (observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove (observer);
    }

    public void changeState(int state){
        this.state = state;
        publishMessage();
    }

    public void publishMessage() {
        for( Observer observer: observers){
            observer.update();
        }
    }

    public int getState(){
        return this.state;
    }
}
