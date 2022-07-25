/**

Interfaces are used for :-
* 1. for abstraction :- Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
* 2. blueprint of Class
* 3. has static constants and abstract class

 */
interface Printable {
    void print();
}

public class Interface implements Printable {

    @Override
    public void print() {
        System.out.println("hello");
    }

    public static void main(String []args){
        Interface obj = new Interface ();
        obj.print();
    }
}
