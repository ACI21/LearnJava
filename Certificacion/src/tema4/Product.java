package tema4;

import java.math.BigDecimal;
import java.math.RoundingMode;

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
public class Product {
	private int id;
	private String name;
	private BigDecimal price;
	final BigDecimal dto = BigDecimal.valueOf(0.1);

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(final int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the dto
	 */
	public BigDecimal getDto() {
		return dto;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", dto=" + dto + ", price+dto=" + calculateDto() + "]";
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

}
