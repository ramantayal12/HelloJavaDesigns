import ConcurrencyInJava.Invoker;
import OptionalClass.ObjectsIsNull;
import OptionalClass.OptionalBasics;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleDriver {

  public static void main(String[] args){

    Executor executor = new Invoker();
    executor.execute( () -> {} );

    ExecutorService executorService = Executors.newFixedThreadPool(10);
  }

}
