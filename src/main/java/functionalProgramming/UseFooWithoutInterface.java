package functionalProgramming;

import java.util.function.Function;

public class UseFooWithoutInterface {

    public static String add(String string, Function<String, String> fn ){
        return fn.apply(string);
    }

}