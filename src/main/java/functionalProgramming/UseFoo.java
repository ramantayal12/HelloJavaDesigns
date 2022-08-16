package functionalProgramming;

public class UseFoo implements Foo{

    public static String add(String string, Foo foo) {
        return foo.method(string);
    }

    @Override
    public String method(String string) {
        return null;
    }
}
