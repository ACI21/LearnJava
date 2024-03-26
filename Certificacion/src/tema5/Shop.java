/**
 * 
 */
package tema5;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author a.carrillo.ibanez
 *
 */
public class Shop {
    private static final Logger logger = Logger.getLogger(Shop.class.getName());
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var p = new Product(101, "Tea", BigDecimal.valueOf(1.99));
		var p2 = new Product(102, "TeaRock", BigDecimal.valueOf(3.99), Rating.THREE_STAR);
		var p3 = new Product(103, "TeaMegaRock", BigDecimal.valueOf(9.99), Rating.FIVE_STAR);
		var p4 = new Product();
		var p5 = new Product(101, "Tea", BigDecimal.valueOf(1.99));
		
		try {
			if (logger.isLoggable(Level.INFO)) {
	            logger.log(Level.INFO, p.toString());
	            logger.log(Level.INFO, p2.toString());
	            logger.log(Level.INFO, p3.toString());
	            logger.log(Level.INFO, p4.toString());
	            logger.log(Level.INFO, p5.toString());
	            p5 = p5.applyRating(Rating.FOUR_STAR);
	            logger.log(Level.INFO, p5.toString());

	        }
		} catch (NullPointerException e) {
			String msg = "ERROR IN VALUES --> "+e.getMessage();
			logger.log(Level.INFO, msg);
		}
    }
}