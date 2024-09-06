package com.learn.java.EncyptionUtils;

import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;
import org.apache.commons.codec.digest.DigestUtils;

public class EncryptionMethods {

  public static void apacheDigestUtils() {

    System.out.println("Input : Raman ");

    // Compute the SHA-256 hash of the input using Apache's DigestUtils
    System.out.println((DigestUtils.sha256Hex("Raman")));

    // Hashing of same input should give same output
    System.out.println("Printing if using same input gives us same output");
    System.out.println(DigestUtils.sha256Hex("tayal").equals(DigestUtils.sha256Hex("tayal")));

    // hashing using 3rd level, most secure hashing
    String sha256Hex_sha3 = new DigestUtils("SHA3-256").digestAsHex("Raman");
    System.out.println("Hashing using sha3");
    System.out.println(sha256Hex_sha3);

  }

  public static void googleGuavaHashing() {

    // Generate SHA-256 hash of the string "Raman" using UTF-8 encoding
    String sha256hex = Hashing.sha256()
        .hashString("Raman", StandardCharsets.UTF_8)
        .toString();
    String sha256hex2 = Hashing.sha256()
        .hashString("Raman", StandardCharsets.UTF_8)
        .toString();
    System.out.println("Hashing using google guava ");
    System.out.println(sha256hex);

    // Hashing of same input should give same output
    System.out.println(sha256hex.equals(sha256hex2));

  }
}
