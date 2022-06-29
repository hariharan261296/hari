package OOps;

public class Weekday {
	public String findDay(String day1) {
		if(day1.equalsIgnoreCase("monday") || day1.equalsIgnoreCase("tuesday") || day1.equalsIgnoreCase("wednesday") || day1.equalsIgnoreCase("thursday") || day1.equalsIgnoreCase("friday")) {
			return "Weekday";
		}
		else {
			return "Weekend";
		}
		
	}
	public String findDay(String day2,int month) {
		if(day2.equalsIgnoreCase("monday") || day2.equalsIgnoreCase("tuesday") || day2.equalsIgnoreCase("wednesday") || day2.equalsIgnoreCase("thursday") || day2.equalsIgnoreCase("friday")) {
			return "Weekday";
			
		}
		else {
			return "Weekend";
		}
		
		int day=11;
		switch(day) {
		case 1:return "January"; break;
		case 2:return "Feburary"; break;
		case 3:return "March"; break;
		case 4:return "April"; break;
		case 5:return "May"; break;
		case 6:return "June"; break;
		case 7:return "July"; break;
		case 8:return "August"; break;
		case 9:return "September"; break;
		case 10:return "October"; break;
		case 11:return "November"; break;
		case 12:return "December"; break;
		default :return "invalid month";break;
		
		}
	}

}
