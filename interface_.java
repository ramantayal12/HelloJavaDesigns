/*

1. Used for abstraction
2. Blue Print of Class
3. has static constants and abstract class


 */
interface printabel{
    void print();
}

public class interface_ implements printabel {

    @Override
    public void print() {
        System.out.println("hello");
    }

    public static void main(String []args){
        interface_ obj = new interface_();
        obj.print();
    }
}
