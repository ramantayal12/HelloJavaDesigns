package DesignPatterns.ObserverPattern;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver (this);
    }

    @Override
    void update() {
        System.out.println ("Binary state value is : "+ Integer.toBinaryString (subject.getState ()));
    }
}
