package Log4;

import org.apache.log4j.Logger;

public class Calc {
	static Logger log=Logger.getLogger(Calc.class); 
	
	public int add(int num1,int num2) {
		return num1+num2;
	}

}
