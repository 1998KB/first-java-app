package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Greeter {
  private static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  private static String daysBetween(Date one, Date two){
    long difference = (one.getTime() - two.getTime()) / 86400000;
    return "Today it is " + Math.abs(difference) + " days left until the course starts";
  }


  public static void main(String[] args) throws IOException, ParseException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    Scanner in = new Scanner(System.in);
    System.out.print("When does the course start? ");
    String cs = in.next();
    Date cs1 = sdf.parse(cs);

    Date today = new Date();
    Calendar myNextCalendar = Calendar.getInstance();

    String d_b = String.valueOf(daysBetween(cs1, today));
    String todaysDate = sdf.format(today);
    String greeting = greet(name);

    System.out.println(greeting);
    System.out.println(d_b);
  }
}
