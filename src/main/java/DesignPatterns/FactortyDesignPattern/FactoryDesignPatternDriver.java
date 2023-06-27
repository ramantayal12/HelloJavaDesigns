package DesignPatterns.FactortyDesignPattern;

/**
 * The factory design pattern defines an interface for creating an object,
 * but lets subclass decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 */
public class FactoryDesignPatternDriver {

    public static void main(String[] args ){

        for(int i=3; i<=5; i++){
            PolygonFactory polygonFactory = new PolygonFactory ();
            System.out.println(polygonFactory.getPolygon(i).getPolygonType());
        }

    }
}
