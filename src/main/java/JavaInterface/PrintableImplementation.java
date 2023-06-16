package JavaInterface;

// Interface is blueprint of class

/**
 * The Printable interface serves as a blueprint for classes implementing it.
 * It contains a static constant id and an abstract method print().
 *
 * The interface also includes default methods getUserName() and getUserId() that provide default implementations.
 */
interface Printable {

    String id = "ID"; // Static constant declaration
    void print(); // Abstract method declaration

    // Default methods in an interface
    default String getUserName(){
        return "default Name";
    }

    default String getUserId(){
        return this.id;
    }
}


/**
 * The PrintableImplementation class implements the Printable interface and
 * provides concrete implementations for the abstract print() method and
 * the default getUserName() method.
 */
public class PrintableImplementation implements Printable {

    /**
     * The print() method is overridden from the Printable interface in the PrintableImplementation class.
     */
    @Override
    public void print() {
        System.out.println("hello");
    }

    /**
     * The getUserName() method is also overridden in the PrintableImplementation class,
     * providing a different implementation from the default one.
     *
     * Default methods are not needed to be implemented
     */
    @Override
    public String getUserName(){
        return "randomUserName";
    }

    public static void main(String []args){
        PrintableImplementation obj = new PrintableImplementation();
        obj.print(); // Calling the overridden print() method
        System.out.println (obj.getUserName ()); // Calling the overridden getUserName() method
        System.out.println (obj.getUserId ()); // Calling the inherited getUserId() method
    }
}
