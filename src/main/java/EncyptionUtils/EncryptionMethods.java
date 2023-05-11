package EncyptionUtils;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.digest.DigestUtils;

public class EncryptionMethods {
  public static void apacheDigestUtils(){

    System.out.println("Input : Raman ");
    System.out.println( (DigestUtils.sha256Hex("Raman")));

    System.out.println("Printing if using same input gives us same output");
    System.out.println(DigestUtils.sha256Hex("tayal").equals(DigestUtils.sha256Hex("tayal"))) ;

    String sha256Hex_sha3 = new DigestUtils("SHA3-256").digestAsHex("Raman");
    System.out.println("Hashing using sha3");
    System.out.println(sha256Hex_sha3);

  }

  public static void googleGuavaHashing(){
    String sha256hex = Hashing.sha256()
        .hashString("Raman", StandardCharsets.UTF_8)
        .toString();
    String sha256hex2 = Hashing.sha256()
        .hashString("Raman", StandardCharsets.UTF_8)
        .toString();
    System.out.println("Hashing using google guava ");
    System.out.println(sha256hex);
    System.out.println(sha256hex.equals(sha256hex2));

  }
}
