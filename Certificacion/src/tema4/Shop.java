/**
 * 
 */
package tema4;

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
		var p = new Product();
		p.setId(3);
		p.setName("Tea");
		p.setPrice(BigDecimal.valueOf(1.99));
		
		try {
			if (logger.isLoggable(Level.INFO)) {
	            logger.log(Level.INFO, p.toString());
	        }
		} catch (NullPointerException e) {
			String msg = "ERROR IN VALUES --> "+e.getMessage();
			logger.log(Level.INFO, msg);
		}
		
		char[][] matrix = {{'A','B','C','D','E'},
				{'F','G','H','I','J'},
				{'K','L','M','N','Ñ'},
				{'O','P','Q','R','S'},
				{'T','U','V','W','X'}
				};
		var sb = new StringBuilder();
		outerLoopLabel:
		for ( char[] row : matrix) {
			for (char cs : row) {
				if(cs == 'C') continue;
				if(cs == 'H') continue outerLoopLabel;
				if(cs == 'N') break;
				if(cs == 'S') break outerLoopLabel;
				sb.append(cs);
			}
			sb.append('\n');
		}
		
		try {
			if (logger.isLoggable(Level.INFO)) {
	            logger.log(Level.INFO, sb.toString());
	        }
		} catch (Exception e) {
			String msg = "ERROR IN VALUES --> "+e.getMessage();
			logger.log(Level.INFO, msg);
		}
    }
}