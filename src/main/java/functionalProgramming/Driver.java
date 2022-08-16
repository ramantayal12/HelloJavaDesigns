package functionalProgramming;

import java.util.function.Function;

public class Driver {

    public static void main(String[] args){
        Foo foo = parameter -> parameter + "helloFunctionalProgramming";
        System.out.println (UseFoo.add("Message ", foo) );

        Function<String,String> fn = parameter -> parameter + "from lambda";
        System.out.println (UseFooWithoutInterface.add ("hello", fn));
    }
}
