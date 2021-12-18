package com.main.admin;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

public class EmailGenerator {


    public EmailGenerator() {

    }

    public String emailGenerator(String fn, String ln, String dept){
        String list = fn.toLowerCase() + "." + ln.toLowerCase() + "@" + dept.toLowerCase() + ".gs.com" ;
        return list;

    }

    public String generatePwd() {
        int leftLimit = 33; // letter 'a'
        int rightLimit = 126; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }





}
