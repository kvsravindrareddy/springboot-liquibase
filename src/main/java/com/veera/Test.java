package com.veera;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // the string representation of date (month/day/year)
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

// Get the date today using Calendar object.
        Date today = new Date(System.currentTimeMillis());
// Using DateFormat format method we can create a string
// representation of a date with the defined format.
        String reportDate = df.format(today);

// Print what date is today!
        System.out.println("Report Date: " + reportDate);
    }
}
