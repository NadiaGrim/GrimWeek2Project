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
public class SummeryTest {
	Order order = new Order("sandwich", 3);
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("You ordered 3 sandwich", order.orderSummery());
	}

}
