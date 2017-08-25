// Convert a String object to a Calendar object

public void convert(String bcpTime) {
    // convert a String to Calendar
    String pattern = "yyyyMMddHHmmss";
    Date date = null;
    try {
        date = new SimpleDateFormat(pattern).parse(bcpTime);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    calendar.setTime(date);

    // convert local Calendar to bcp Calendar
}