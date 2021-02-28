package com.codewithazam.Day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvertion {
    public static void main(String[] args) throws ParseException {

        String time = "12:01:00AM";
        System.out.println(timeConversion(time));

    }
   public static String timeConversion(String s) throws ParseException {
       String input = "hh:mm:ssa";
       String output = "HH:mm:ss";
       SimpleDateFormat sdfIn = new SimpleDateFormat(input);
       SimpleDateFormat sdfOut = new SimpleDateFormat(output);

       Date date = sdfIn.parse(s);
       return sdfOut.format(date);
    }
}