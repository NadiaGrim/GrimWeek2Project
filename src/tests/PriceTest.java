package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Order;

/**
 * @author nadiagrimaldi ngrimaldi1
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
public class PriceTest {

	Order order1 = new Order("salad", 2);
	Order order2 = new Order("soup", 1);
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(13.98, order1.getPrice(), 0.01);
		assertEquals(7.99, order2.getPrice(), 0.01);
	}

}
