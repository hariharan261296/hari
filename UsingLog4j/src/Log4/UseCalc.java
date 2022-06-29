package Log4;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UseCalc {

	static Logger log=Logger.getLogger(Calc.class);
	public static void main(String[] args) {
		BasicConfigurator.configure();
		int num1=2;
		int num2=4;
		Calc c=new Calc();
		log.info(c.add(num1,num2));
		
	}

}
