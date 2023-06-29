package DesignPatterns.ObserverPattern;

public class HexaObserver extends Observer{


    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver (this);
    }

    @Override
    public void update() {
        System.out.println ("Hex value of state is : " + Integer.toHexString (subject.getState ()));
    }
}
