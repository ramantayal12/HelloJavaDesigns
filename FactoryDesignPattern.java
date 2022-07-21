class Triangle implements Polygon{

    @Override
    public String getType() {
        return "It is a Triangle";
    }
}

class Square implements Polygon{

    @Override
    public String getType() {
        return "It is a Square";
    }
}

class Pentagon implements Polygon{

    @Override
    public String getType() {
        return "It is a pentagon";
    }
}

class PolygonFactory{
    public Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            return new Triangle();
        }
        if(numberOfSides == 4) {
            return new Square();
        }
        if(numberOfSides == 5) {
            return new Pentagon();
        }
        return null;
    }
}
public class FactoryDesignPattern {

}
