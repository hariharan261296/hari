package OOps;

public class UseLunch {

	public static void main(String[] args) {
		String mainCourse="CHICKENBRIYANI";
		boolean isSoftDrinkAvailable= true;
		String siDish="CHILLYCHICKEN";
		Lunch x=new Lunch();
		System.out.println(x.lunchPurchase(mainCourse)+" "+x.lunchPurchase(mainCourse, siDish, isSoftDrinkAvailable));
		// TODO Auto-generated method stub

	}

}
