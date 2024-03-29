/**
 * 
 */
package tema6;

import java.math.BigDecimal;
import java.time.LocalDate;
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
		Product p = new Drink(101, "Tea", BigDecimal.valueOf(1.99));
		Product p2 = new Drink(102, "TeaRock", BigDecimal.valueOf(3.99), Rating.THREE_STAR);
		Product p3 = new Drink(103, "TeaMegaRock", BigDecimal.valueOf(9.99), Rating.FIVE_STAR);
		Product p4 = new Drink();
		Product p5 = new Drink(101, "Teas", BigDecimal.valueOf(1.99));
		Product p6 = new Food(104,"Chocolate",BigDecimal.valueOf(1.99),Rating.FOUR_STAR,LocalDate.now());
		Product p7 = new Drink(104,"Chocolate",BigDecimal.valueOf(1.99),Rating.FOUR_STAR);
		
		Food f = new Food();
		Food f2 = new Food(201,"Cake",BigDecimal.valueOf(3.99),LocalDate.now().plusDays(4));
		Food f3 = new Food(202,"Carrot",BigDecimal.valueOf(1.99),Rating.FIVE_STAR,LocalDate.now().plusDays(9));
		
		Drink d = new Drink();
		Drink d2 = new Drink(301,"Expresso Coffe",BigDecimal.valueOf(3.99));
		Drink d3 = new Drink(302,"American Coffe",BigDecimal.valueOf(1.99),Rating.FOUR_STAR);
		
		try {
			if (logger.isLoggable(Level.INFO)) {
				logger.log(Level.INFO, "-- PRODUCT INFORMATION --");
	            logger.log(Level.INFO, p.toString());
	            logger.log(Level.INFO, p2.toString());
	            logger.log(Level.INFO, p3.toString());
	            logger.log(Level.INFO, p4.toString());
	            logger.log(Level.INFO, p5.toString());
	            p5 = p5.applyRating(Rating.FOUR_STAR);
	            logger.log(Level.INFO, p5.toString());
	            
	            logger.log(Level.INFO, "\n-- FOOD INFORMATION --");
	            logger.log(Level.INFO, f.toString());
	            logger.log(Level.INFO, f2.toString());
	            logger.log(Level.INFO, f3.toString());
	            
	            logger.log(Level.INFO, "\n-- DRINK INFORMATION --");
	            logger.log(Level.INFO, d.toString());
	            logger.log(Level.INFO, d2.toString());
	            logger.log(Level.INFO, d3.toString());
	            
	            logger.log(Level.INFO, "\n-- COMPARATION P6 == P7 INFORMATION --");
	            logger.log(Level.INFO, String.valueOf(p6.equals(p7)));

	        }
		} catch (NullPointerException e) {
			String msg = "ERROR IN VALUES --> "+e.getMessage();
			logger.log(Level.INFO, msg);
		}
    }
}