//https://www.mkyong.com/java/java-how-to-get-current-date-time-date-and-calender/
public void printTimestamp() {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
}
