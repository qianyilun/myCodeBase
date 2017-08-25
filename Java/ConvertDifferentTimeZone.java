// Convert local time to a specific time-zone's time

public static void TimeZone() {
      // Create a calendar object and set it time based on the local
      // time zone
      Calendar localTime = Calendar.getInstance();
      localTime.set(Calendar.YEAR, 2017);
      localTime.set(Calendar.MONTH, 8);
      localTime.set(Calendar.DAY_OF_MONTH, 24);
      localTime.set(Calendar.HOUR, 16);
      localTime.set(Calendar.MINUTE, 15);
      localTime.set(Calendar.SECOND, 20);

      int year = localTime.get(Calendar.YEAR);
      int month = localTime.get(Calendar.MONTH);
      int date = localTime.get(Calendar.DAY_OF_MONTH);
      int hour = localTime.get(Calendar.HOUR);
      int minute = localTime.get(Calendar.MINUTE);
      int second = localTime.get(Calendar.SECOND);


      // Print the local time
      System.out.printf("Local time  : %02d:%02d:%02d:%02d:%02d:%02d\n", year, month, date, hour, minute, second);


      // Create a calendar object for representing a Germany time zone. Then we
      // wet the time of the calendar with the value of the local time

      Calendar germanyTime = new GregorianCalendar(TimeZone.getTimeZone("Europe/Berlin"));
      germanyTime.setTimeInMillis(localTime.getTimeInMillis());
      year = germanyTime.get(Calendar.YEAR);
      month = germanyTime.get(Calendar.MONTH);
      date = germanyTime.get(Calendar.DAY_OF_MONTH);
      hour = germanyTime.get(Calendar.HOUR);
      minute = germanyTime.get(Calendar.MINUTE);
      second = germanyTime.get(Calendar.SECOND);


      // Print the local time in Germany time zone
      System.out.printf("Germany time: %02d:%02d:%02d:%02d:%02d:%02d\n", year, month, date, hour, minute, second);
  }