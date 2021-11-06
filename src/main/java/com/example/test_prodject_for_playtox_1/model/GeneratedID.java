package com.example.test_prodject_for_playtox_1.model;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.UUID;

public class GeneratedID {
    public String generatedID() {
//        byte[] array = new byte[3];
//        new Random().nextBytes(array);
//        String generatedString = new String(array, Charset.forName("Windows-1251"));
        String uniqueID = UUID.randomUUID().toString();
        return uniqueID;
    }
}
