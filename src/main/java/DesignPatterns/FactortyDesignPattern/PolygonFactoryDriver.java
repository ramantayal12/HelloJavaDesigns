package DesignPatterns.FactortyDesignPattern;

/**
 * The Factory design pattern is used in this example to encapsulate the object creation logic
 * and provide a unified way to create instances of different polygons.
 * The PolygonFactoryDriver acts as a factory, and the getPolygon() method determines the type of
 * polygon to create based on the input. This approach allows for easy extensibility if new polygon
 * types need to be added in the future.
 */
public class PolygonFactoryDriver {
    public Polygon getPolygon(int numberOfSides) {

        if (numberOfSides == 3) {
            return new Triangle ();
        }
        if (numberOfSides == 4) {
            return new Square ();
        }
        if (numberOfSides == 5) {
            return new Pentagon ();
        }
        return null;
    }
}
