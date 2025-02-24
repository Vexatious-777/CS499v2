package org.alexgrif;


import java.io.InputStream;

public class KeyFileChecker {

    public static void main(String[] args) {
        checkKeyFile("privateKey.pem");
        checkKeyFile("publicKey.pem");
    }

    public static void checkKeyFile(String fileName) {
        InputStream fileStream = KeyFileChecker.class.getClassLoader().getResourceAsStream(fileName);
        if (fileStream == null) {
            System.out.println("Error: " + fileName + " not found!");
        } else {
            System.out.println(fileName + " loaded successfully!");
        }
    }
}
