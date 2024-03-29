/**
 * 
 */
package tema6;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * 
 */
public class Food extends Product {
	
	private LocalDate bestBefore;
	
	/**
	 * 
	 */
	public Food() {
		this(0,"Default",BigDecimal.ZERO, LocalDate.now() );
	}

	/**
	 *
	 * @param id
	 * @param name
	 * @param price
	 * @param bestBefore
	 */
	public Food(int id, String name, BigDecimal price, LocalDate bestBefore) {
		this(id, name, price, Rating.NOT_RATED, bestBefore);
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param rating
	 * @param bestBefore
	 */
	public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
		super(id, name, price, rating);
		setBestBefore(bestBefore);
	}

	/**
	 * @return the bestBefore
	 */
	public LocalDate getBestBefore() {
		return bestBefore;
	}

	@Override
	public BigDecimal getDto() {
		return (getBestBefore().equals(LocalDate.now()))
				? super.getDto() : BigDecimal.ZERO ;
	}

	/**
	 * @param bestBefore the bestBefore to set
	 */
	public void setBestBefore(LocalDate bestBefore) {
		this.bestBefore = bestBefore;
	}

	@Override
	public String toString() {
		return "Food [bestBefore=" + bestBefore + ", " + super.toString() + "]";
	}

	@Override
	public Product applyRating(Rating newRating) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
