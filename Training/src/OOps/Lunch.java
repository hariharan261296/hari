package OOps;

public class Lunch {
	public String lunchPurchase(String mainCourse) {
		if(mainCourse=="CHICKENBRIYANI") {
			return "Lunch Only";
		}
		else {
			return "invalid input";
		}
	}
	public String lunchPurchase(String mainCourse,String siDish,boolean isSoftDrinkAvailable) {
		if(isSoftDrinkAvailable==true && mainCourse=="CHICKENBRIYANI" && siDish=="CHILLYCHICKEN") {
			return "Lunch With Softdrinks And Sidish";
		}
		else {
			return "invalid input";
		}
	}

}
