package EncyptionUtils;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.commons.codec.digest.DigestUtils;

public class EncryptionMethods {
//DigestUtils.sha256Hex
  // Apache
  public static void apacheDigestUtils(){

    System.out.println("Input : Raman " + (DigestUtils.sha256Hex("Raman")));

    System.out.println("Printing if using same input gives us same output");
    System.out.println(DigestUtils.sha256Hex("tayal").equals(DigestUtils.sha256Hex("tayal"))) ;

  }

  public static void googleGuavaHashing(){
    String sha256hex = Hashing.sha256()
        .hashString("Raman", StandardCharsets.UTF_8)
        .toString();
    String sha256hex2 = Hashing.sha256()
        .hashString("Raman", StandardCharsets.UTF_8)
        .toString();
    System.out.println(sha256hex);
    System.out.println(sha256hex.equals(sha256hex2));

  }
}
