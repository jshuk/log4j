package beta;

import org.apache.logging.log4j.*;

public class demo2 {
	
	private static Logger log= LogManager.getLogger(demo2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.fatal("2-this comes under default config file");
		log.error("2-this 2 ");
log.debug("2-doesnot");
log.info("2-nopes");
	}

}
