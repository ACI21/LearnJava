package tema6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
/**
 * {@code Product} class represents porperties and behaviors of
 * product objects in the Product Management System.
 * <br>
 * Each product has an id, name, price and dto
 * <br>
 * {@link dto discount rate}
 * <br>
 * Discount rate is 10%
 * @author a.carrillo.ibanez
 * @version 1.0
 */
public abstract class Product {
	private final int id;
	private final String name;
	private final BigDecimal price;
	private final BigDecimal dto = BigDecimal.valueOf(0.1);
	private final Rating rating ;
	
	/**
	 * 
	 */
	public Product() {
		this(0,"no name",BigDecimal.ZERO);
	}
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Product(int id, String name, BigDecimal price) {
		this(id,name,price, Rating.NOT_RATED);
	}
	
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param string
	 */
	public Product(int id, String name, BigDecimal price, Rating rating) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * @return the dto
	 */
	public BigDecimal getDto() {
		return dto;
	}
	
	/**
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", dto=" + dto + ", rating=" + rating
				+ ", calculateDto()=" + calculateDto() + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj instanceof Product) {
			Product other = (Product) obj;
			return id == other.id && Objects.equals(name, other.name);
		}
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;	
		return false;
	}

	/**
	 * Calculates discount on a product price and
	 * {@link dto discount rate}
	 * @return a {@link java.math.BigDecimal BigDecimal}
	 * value of the discount
	 */
	public BigDecimal calculateDto(){
		return price.multiply(getDto()).setScale(2, RoundingMode.HALF_UP);
	}
	
	public abstract Product applyRating(Rating newRating);

}
