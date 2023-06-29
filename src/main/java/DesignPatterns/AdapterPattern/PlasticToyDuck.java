package DesignPatterns.AdapterPattern;

public class PlasticToyDuck implements ToyDuck{


    @Override
    public void squeak() {
        System.out.println ("Squeak Squeak");
    }
}
