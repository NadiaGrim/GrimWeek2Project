package model;

/**
 * @author nadiagrimaldi ngrimaldi1
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
public class Order {
	private final double PRICE_OF_SALAD = 6.99;
	private final double PRICE_OF_SOUP = 7.99;
	private final double PRICE_OF_SANDWICH = 8.99;
	private String meal;
	private int numOfItems;
	private double price = 0;
	private double priceOfItem = 0;

	public Order() {
		super();
	}
	public Order(String meal, int numOfItems) {
		super();
		this.meal = meal;
		this.numOfItems = numOfItems;
		this.price = calculatePrice();
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public int getNumOfItems() {
		return numOfItems;
	}
	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}
	public double getPrice() {
		return price;
	}
	public double calculatePrice() {
		if (meal.equalsIgnoreCase("salad")) {
			priceOfItem = PRICE_OF_SALAD;
		} else if (meal.equalsIgnoreCase("soup")) {
			priceOfItem = PRICE_OF_SOUP;
		} else if (meal.equalsIgnoreCase("sandwich")) {
			priceOfItem = PRICE_OF_SANDWICH;
		}
		this.price = numOfItems * priceOfItem;
		return price;
	}
	public String orderSummery() {
		return ("You ordered " + numOfItems + " " + meal);
	}
}
