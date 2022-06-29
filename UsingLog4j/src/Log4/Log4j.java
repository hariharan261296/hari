package Log4;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4j {
	static Logger log=Logger.getLogger(Log4j.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.info("Sham");
		log.error("kavin");
		log.debug("sin");
		log.warn("siva");
		log.fatal("karthi");

	}

}
