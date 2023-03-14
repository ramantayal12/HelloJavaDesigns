import java.util.stream.Collectors;
import org.joda.time.DateTime;

public class SampleDriver {

  public static void main(String[] args){

    System.out.println(DateTime.now().plusHours(1).toDateTime().getMillis());
    System.out.println(DateTime.now().plusMinutes(3).toDateTime().getMillis());



  }

}
