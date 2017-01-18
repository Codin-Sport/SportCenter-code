package it.codin.course.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test_diff() {
		//Voglio testare che il costruttore 
		//costruisca
		//correttamente il mio Customer
	
		String firstname = "Cinzia";
		String lastname = "Bocconotti";
		String email = "cinzia.bocconotti@gmail.com";
		
		Customer c = new Customer(firstname, lastname, email);

		assertEquals(firstname, c.getFirstname());
		assertEquals(lastname, c.getLastname());
		assertEquals(email, c.getEmail());
		assertNotNull(c.getId());
		assertNotEquals("email.sbagliata@google.com", c.getEmail());
		assertNotEquals("", c.getId());
		}
	
	@Test
	public void test_sum() {
		String firstname = "Cinzia";
		String lastname = "Bocconotti";
		String email = "cinzia.bocconotti@gmail.com";
		
		Customer c = new Customer(firstname, lastname, email);
		
		assertEquals("il nome è sbagliato", "Bocconotti", c.getFirstname());	
	}
}
