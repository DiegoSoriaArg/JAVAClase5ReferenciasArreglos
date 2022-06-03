package referencias;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTests {

	@Test
	public void radioCirculoTest() {
		Circulo c = new Circulo(4);
		assertNotNull(c);
	}
	
	@Test
	public void radioCirculoPidoRadioTest() {
		Circulo c = new Circulo(2);
		assertEquals(2, c.getRadio(),0.001);
	}
	
	@Test
	public void radioCirculoDefaultTest() {
		Circulo c = new Circulo();
		assertNotNull(c);
	}
	
	@Test
	public void radioCirculoPidoRadioDefaultTest() {
		Circulo c = new Circulo();
		assertEquals(1, c.getRadio(),0.001);
	}
	
	@Test
	public void referenciasIgualesTest() {
		Circulo c = new Circulo();
		Circulo o = c;
		assertTrue(o == c);
		assertTrue(c.equals(o));
	}
	
	@Test
	public void referenciasDistintasIgualesTest() {
		Circulo c = new Circulo();
		Circulo o = new Circulo();
		assertFalse(o == c);
		assertTrue(c.equals(o));
	}
	
	@Test(expected = Error.class)
	public void radioInvalidoTest() {
		Circulo c = new Circulo(-2);
	}

}
