/**
 * 
 */
package tema6;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 */
public class Drink extends Product {

	/**
	 * 
	 */
	public Drink() {
		this(0,"Default",BigDecimal.ZERO);
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param price
	 */
	public Drink(int id, String name, BigDecimal price) {
		this(id, name, price, Rating.NOT_RATED);
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param rating
	 */
	public Drink(int id, String name, BigDecimal price, Rating rating) {
		super(id, name, price, rating);
	}

	@Override
	public BigDecimal getDto() {
		LocalTime lt = LocalTime.now();
		return (lt.isAfter(LocalTime.of(17,30)) && 
				lt.isBefore(LocalTime.of(2,30)))
				? super.getDto() : BigDecimal.ZERO;
	}

	@Override
	public String toString() {
		return "Drink [" + super.toString() + "]";
	}

	@Override
	public Product applyRating(Rating newRating) {
		// TODO Auto-generated method stub
		return null;
	}

}
